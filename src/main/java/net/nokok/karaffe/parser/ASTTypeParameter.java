/* Generated By:JJTree: Do not edit this line. ASTTypeParameter.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTTypeParameter extends SimpleNode {

    public ASTTypeParameter(int id) {
        super(id);
    }

    public ASTTypeParameter(KaraffeParser p, int id) {
        super(p, id);
    }

    /**
     * Accept the visitor. *
     */
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=79e9a1bf1a9537b6c7d4f59bbbae4aa4 (do not edit this line) */
