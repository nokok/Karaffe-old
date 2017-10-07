package org.karaffe.compiler.parser;

import java.util.ArrayList;
import java.util.List;

import org.karaffe.compiler.lexer.CommonToken;
import org.karaffe.compiler.lexer.CommonToken.RightBrace;
import org.karaffe.compiler.lexer.KeywordToken.Extends;
import org.karaffe.compiler.lexer.Tokens;
import org.karaffe.compiler.parser.util.CParser;
import org.karaffe.compiler.parser.util.MatchResult;
import org.karaffe.compiler.parser.util.TokenMatcher;
import org.karaffe.compiler.tree.Block;
import org.karaffe.compiler.tree.MethodDef;
import org.karaffe.compiler.tree.Name;
import org.karaffe.compiler.tree.TypeDef.ClassDef;
import org.karaffe.compiler.tree.VarDef;
import org.karaffe.compiler.tree.base.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ClassDefParser implements Parser {

    private static final Logger LOGGER = LoggerFactory.getLogger(ClassDefParser.class);

    @Override
    public MatchResult parse(final Tokens input) {
        if (input.isEmpty()) {
            return new MatchResult.Failure(input);
        }
        ClassDefParser.LOGGER.debug("Input : {}", input);
        final CParser cp = new CParser(input);
        cp.testNext(TokenMatcher.classKeyword());
        if (!cp.testNext(TokenMatcher.identifier())) {
            ClassDefParser.LOGGER.debug("className not found.");
            return cp.toFailure();
        }
        final Node className = cp.lastMatch();
        final boolean hasExtends = cp.testNext(Extends.class);
        final boolean hasSuperClass = cp.testNext(TokenMatcher.identifier(), Name.class);

        if (hasExtends != hasSuperClass) {
            ClassDefParser.LOGGER.debug("superClass not found. 1");
            return cp.toFailure();
        }

        final Name superClassName = hasExtends ? cp.lastMatch() : new Name("Object");

        cp.testNext(CommonToken.LeftBrace.class);

        final List<Node> defs = new ArrayList<>();
        while (cp.testNext(new VarDefParser(), VarDef.class)) {
            final VarDef varDef = cp.lastMatch();
            defs.add(varDef);
        }

        while (cp.testNext(new MethodDefParser(), MethodDef.class)) {
            final MethodDef varDef = cp.lastMatch();
            defs.add(varDef);
        }

        cp.testNext(RightBrace.class);

        if (cp.hasError()) {
            ClassDefParser.LOGGER.debug("gen error");
            return cp.toFailure();
        }
        return new MatchResult.Success(cp.next(), cp.matched(), new ClassDef(className, superClassName, new Block(defs)));
    }

}
