package org.karaffe.compiler.tree.base;

import java.util.List;

import org.karaffe.compiler.pos.Position;
import org.karaffe.compiler.tree.NodeList;
import org.karaffe.compiler.tree.NodeType;
import org.karaffe.compiler.tree.TermNode;

public interface Node {
    public String getID();

    public NodeType getNodeType();

    public Position getPosition();

    public default boolean hasAnyChild() {
        return !getChildren().isEmpty();
    }

    public void replaceChildren(List<Node> replaced);

    public List<? extends Node> getChildren();

    public void addChild(Node n);

    public default boolean isKNormalizable() {
        return this instanceof KNormalizable;
    }

    public default boolean isTermNode() {
        return this instanceof TermNode;
    }

    public default NodeList toNodeList() {
        return new NodeList(this);
    }

    public default Node normalize() {
        if (this.isKNormalizable()) {
            KNormalizable n = (KNormalizable) this;
            return n.normalize();
        }
        return this;
    }

    public static Node KNormalize(Node node) {
        if (node.isKNormalizable()) {
            KNormalizable n = (KNormalizable) node;
            return n.normalize();
        }
        return node;
    }

}
