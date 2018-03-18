package org.karaffe.compiler.tree.v2.expressions;

import org.karaffe.compiler.pos.Position;

public class IntLiteral extends Literal {
    private final int value;

    public IntLiteral(int value) {
        this.value = value;
    }

    public IntLiteral(Position position, int value) {
        super(position);
        this.value = value;
    }

    public int getRawValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return Integer.toString(this.value);
    }

    @Override
    public ExpressionType getExpressionType() {
        return ExpressionType.INT_LITERAL;
    }

}