package org.karaffe.compiler.base.tree.term;

import org.karaffe.compiler.base.tree.AbstractTree;
import org.karaffe.compiler.base.tree.TreeVisitor;

public class EmptyTree extends AbstractTree implements Term {

    public EmptyTree() {

    }

    @Override
    public <R, P> R accept(TreeVisitor<R, P> visitor, P p) {
        return visitor.visit(this, p);
    }

    @Override
    public String toString() {
        return "()";
    }
}
