/**
 * Karaffe Programming Language
 */
package karaffe.compiler.phase.checker;

import karaffe.compiler.phase.Phase;
import karaffe.compiler.tree.AST;
import karaffe.compiler.tree.compileunits.CompileUnit;
import karaffe.compiler.warn.Warning;

public class Warnings extends Phase<AST, AST> {

    public Warnings() {
        super("warnings");
    }

    @Override
    public AST apply(AST t) {
        if (t instanceof CompileUnit) {
            CompileUnit compileUnit = (CompileUnit) t;
            if (!compileUnit.hasPackageDecl()
                    || !compileUnit.hasImportDecl()
                    || !compileUnit.hasClassDecl()) {
                System.err.println(new Warning("ファイルが空です", "何も宣言がされていないか、認識できません。"));
            }
        }
        return t;
    }

}
