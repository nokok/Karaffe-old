/**
 * Karaffe Programming Language
 */
package karaffe.compiler.tree;

import karaffe.compiler.visitor.Visitor;

public class PackageDecl extends AbstractNode {

    private final AmbiguousName name;

    public PackageDecl(AmbiguousName name) {
        this.name = name;
    }

    public PackageDecl(Object name) {
        this((AmbiguousName) name);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.packageDecl(this);
    }

    public AmbiguousName name() {
        return name;
    }

    @Override
    public String toString() {
        return "(PackageDecl:" + name + ")";
    }

}
