/* Generated By:JJTree: Do not edit this line. ASTFunctionName.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTFunctionName extends SimpleNode {

    public ASTFunctionName(int id) {
        super(id);
    }

    public ASTFunctionName(Parser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(ParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.ParserException {

        return visitor.visit(this, data);
    }
}
/*
 * JavaCC - OriginalChecksum=bf026a75241f18d2b8ae70ed07b1ea4d (do not edit this line)
 */
