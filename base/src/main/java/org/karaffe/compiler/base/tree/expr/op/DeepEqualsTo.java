package org.karaffe.compiler.base.tree.expr.op;

import org.karaffe.compiler.base.tree.TreeVisitor;

public class DeepEqualsTo extends AbstractOperator {
    @Override
    public <R, P> R accept(TreeVisitor<R, P> visitor, P p) {
        return visitor.visit(this, p);
    }
}
