package org.karaffe.compiler.base.tree.stmt;

import org.karaffe.compiler.base.tree.AbstractTree;
import org.karaffe.compiler.base.tree.TreeKind;
import org.karaffe.compiler.base.tree.TreeVisitor;

public class ReturnStatement extends AbstractTree {

    public ReturnStatement() {
        super(TreeKind.RETURN);
    }

    @Override
    public <R, P> R accept(TreeVisitor<R, P> visitor, P p) {
        return visitor.visitReturn(this, p);
    }
}