/* Generated By:JJTree: Do not edit this line. ASTEnumDeclaration.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package net.nokok.karaffe.parser;

public class ASTEnumDeclaration extends SimpleNode {

    public ASTEnumDeclaration(int id) {
        super(id);
    }

    public ASTEnumDeclaration(KaraffeParser p, int id) {
        super(p, id);
    }

    /** Accept the visitor. **/
    public Object jjtAccept(KaraffeParserVisitor visitor, Object data) throws net.nokok.karaffe.parser.excptn.KaraffeParserException {

        return visitor.visit(this, data);
    }
}
/* JavaCC - OriginalChecksum=719c753f960cddccb6d3857f03800915 (do not edit this line) */
