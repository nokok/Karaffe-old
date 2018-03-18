package org.karaffe.compiler.tree;

import org.karaffe.compiler.context.NormalizeContext;
import org.karaffe.compiler.tree.base.AbstractNode;

public class LabelDef extends AbstractNode {

    public LabelDef() {
        super(NodeType.DEFLABEL);
    }

    @Override
    public NodeList normalize(final NormalizeContext context) {
        return this.toNodeList();
    }

    @Override
    public String vSource() {
        return String.format("Label(%s):", this.hashCode());
    }
}