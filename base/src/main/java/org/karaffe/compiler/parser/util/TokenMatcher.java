package org.karaffe.compiler.parser.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.karaffe.compiler.lexer.CommonToken.Dot;
import org.karaffe.compiler.lexer.CommonToken.EOF;
import org.karaffe.compiler.lexer.KeywordToken;
import org.karaffe.compiler.lexer.Token;
import org.karaffe.compiler.lexer.Tokens;
import org.karaffe.compiler.lexer.WhitespaceToken.NewLine;
import org.karaffe.compiler.lexer.WhitespaceToken.Space;
import org.karaffe.compiler.lexer.WhitespaceToken.Tab;
import org.karaffe.compiler.lexer.WhitespaceToken.WideSpace;
import org.karaffe.compiler.parser.IdentifierParser;

public interface TokenMatcher {

    public static final List<Class<? extends Token>> DEFAULT_SKIP_TOKENS = new ArrayList<>(Arrays.asList(NewLine.class, Space.class, Tab.class, WideSpace.class));

    public static TokenMatcher classKeyword() {
        return TokenMatcher.create(KeywordToken.Class.class);
    }

    public static TokenMatcher create(final Class<? extends Token> tokenClazz) {
        return new SimpleTokenMatcher(tokenClazz);
    }

    public static TokenMatcher create(final Class<?>... tokens) {
        final List<Class<? extends Token>> pattern = new ArrayList<>(Arrays.asList((Class<? extends Token>[]) tokens));
        final SimpleTokenMatcher matcher = new SimpleTokenMatcher(pattern);
        return matcher;
    }

    public static TokenMatcher dot() {
        return TokenMatcher.create(Dot.class);
    }

    public static TokenMatcher identifier() {
        return new IdentifierParser();
    }

    public static boolean isLineEnd(final Tokens tokens) {
        final Iterator<Token> tokenIterator = tokens.iterator();
        while (tokenIterator.hasNext()) {
            final Token nextToken = tokenIterator.next();
            if (nextToken.isNeedLineReset()) {
                return true;
            }
            if (nextToken.isWhiteSpace()) {
                continue;
            }
            if (nextToken.is(EOF.class)) {
                return true;
            }
            return false;
        }
        return true; // Token not found.
    }

    public default ResultState head(final List<Token> tokens) {
        return this.head(new Tokens(tokens));
    }

    public default MatchResult head(final Tokens tokens) {
        return this.head(tokens, TokenMatcher.DEFAULT_SKIP_TOKENS);
    }

    public default MatchResult head(final Tokens tokens, final List<Class<? extends Token>> skipTokens) {
        int reducedCount = 0;
        for (final Token token : tokens) {
            boolean hitSkipToken = false;
            for (final Class<? extends Token> skipToken : skipTokens) {
                if (token.is(skipToken)) {
                    hitSkipToken = true;
                }
            }
            if (token.is(EOF.class)) {
                return new MatchResult.Failure(token, tokens);
            }
            if (!hitSkipToken) {
                final List<Token> retTokens = new ArrayList<>(tokens).subList(reducedCount, tokens.size());
                return new MatchResult.Success(new Tokens(retTokens), new Tokens());
            }
            reducedCount++;
        }
        return new MatchResult.Failure(null, tokens);
    }

    public MatchResult match(Tokens tokens);

    public default List<Class<? extends Token>> skipTokens() {
        return TokenMatcher.DEFAULT_SKIP_TOKENS;
    }

}