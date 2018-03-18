package org.karaffe.compiler.tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.karaffe.compiler.context.NormalizeContext;
import org.karaffe.compiler.context.TypeContext;
import org.karaffe.compiler.tree.base.AbstractNode;
import org.karaffe.compiler.tree.base.Node;
import org.karaffe.compiler.types.InferResult;

public class Block extends AbstractNode {

    public Block(final List<Node> nodes) {
        super(NodeType.BLOCK, nodes);
    }

    public Block(final Node... nodes) {
        this(new ArrayList<>(Arrays.asList(nodes)));
    }

    public List<Node> findBlockBody() {
        return new ArrayList<>(this.getChildren());
    }

    @Override
    public NodeList normalize(final NormalizeContext context) {
        final List<Node> nodes = new ArrayList<>();
        for (final Node n : this.getChildren()) {
            nodes.addAll(n.normalize(context).flatten());
        }
        return new NodeList(nodes);
    }

    @Override
    public Optional<InferResult> tryTypeInference(TypeContext context) {
        Node last = this.getChildren().get(this.getChildren().size() - 1);
        return last.tryTypeInference(context);
    }

    @Override
    public String vSource() {
        return String.format("{%s}", String.join(";", this.findBlockBody().stream().map(Node::vSource).collect(Collectors.toList())));
    }
}