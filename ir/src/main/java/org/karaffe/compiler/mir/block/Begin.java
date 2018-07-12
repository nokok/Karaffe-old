package org.karaffe.compiler.mir.block;

import org.karaffe.compiler.mir.AbstractInstruction;
import org.karaffe.compiler.mir.InstructionType;
import org.karaffe.compiler.mir.util.Label;

import java.util.Objects;

public class Begin extends AbstractInstruction {
    private Label label;

    public Begin(InstructionType type, Label label) {
        this.setInstType(type);
        this.label = Objects.requireNonNull(label);
    }

    public Label getLabel() {
        return label;
    }
}