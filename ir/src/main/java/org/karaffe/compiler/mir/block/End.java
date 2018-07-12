package org.karaffe.compiler.mir.block;

import org.karaffe.compiler.mir.AbstractInstruction;
import org.karaffe.compiler.mir.util.Label;

import java.util.Objects;

public class End extends AbstractInstruction {
    private Label label;

    public End(Label label) {
        this.label = Objects.requireNonNull(label);
    }

    public Label getLabel() {
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        End end = (End) o;
        return Objects.equals(label, end.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label);
    }

    @Override
    public String toString() {
        return "End " + label;
    }
}
