package org.karaffe.compiler.parser;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;
import org.karaffe.compiler.lexer.Token;
import org.karaffe.compiler.parser.util.MatchResult;

public class ClassDeclParserTest {

    private void runFailureTest(final String source, final int line, final int column) {
        final Parser parser = new ClassDefParser();
        final MatchResult result = parser.parse(source);
        assertTrue(result.isFailure());
        final Token token = result.errorHeadF().get();
        assertEquals(line, token.getPosition().getLineNumber().get().intValue());
        assertEquals(column, token.getPosition().getColNumber().get().intValue());
    }

    private void runTest(final String source, final boolean v) {
        final Parser parser = new ClassDefParser();
        final MatchResult result = parser.parse(source);
        Assert.assertEquals(source + " " + result, v, result.isSuccess());
        if (v) {
            if (result.next().isEmpty()) {
                return;
            }
            final MatchResult eofResult = new EOFParser().parse(result.next());
            if (eofResult.isFailure()) {
                Assert.fail(eofResult.toString());
            }
            Assert.assertEquals(0, eofResult.next().size());
        }
    }

    @Test
    public void testClassDecl1() {
        this.runTest("class A", true);
    }

    @Test
    public void testClassDecl2() {
        this.runTest("class A{}", true);
    }

    @Test
    public void testClassDecl3() {
        this.runTest("class A {var a:int;}", true);
    }

    @Test
    public void testClassDecl4() {
        this.runTest("class A{var a:int;var b:int; var c:String;}", true);
    }

    @Test
    public void testClassDecl5() {
        this.runTest("class A{\n"
                + "     var a :int;\n"
                + "     public int doSomething(int a) {\n"
                + "       return a;\n"
                + "     }\n"
                + "   }", true);
    }

    @Test
    public void testClassDecl6() {
        this.runTest("class A extends Base{ }", true);
    }

    @Test
    public void testClassDecl7() {
        this.runTest("class A extends Base {\n"
                + "     var a :int;\n"
                + "     var b :int;\n"
                + "     public int doSomething(int a) {\n"
                + "       return a;\n"
                + "     }\n"
                + "   }", true);
    }

    @Test
    public void testClassDecl8() {
        this.runTest("class A{public int doSomething(int a) {return false;}}", true);
    }

    @Test
    public void testClassDecl9Fail() {
        this.runFailureTest("class A{public void doSomething(int _) {return false;}}", 1, 36);
    }

    @Test
    public void testEmpty() {
        this.runTest("", false);
    }

}