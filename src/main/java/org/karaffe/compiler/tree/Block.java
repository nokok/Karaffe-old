package org.karaffe.compiler.tree;

import java.util.Arrays;
import java.util.List;

import org.karaffe.compiler.tree.base.AbstractNode;
import org.karaffe.compiler.tree.base.Node;

public class Block extends AbstractNode {

    public Block(final List<Node> nodes) {
        super(NodeType.BLOCK, nodes);
    }

    public Block(final Node... nodes) {
        super(NodeType.BLOCK, Arrays.asList(nodes));
    }
}
