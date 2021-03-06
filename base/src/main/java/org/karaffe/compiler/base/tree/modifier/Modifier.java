package org.karaffe.compiler.base.tree.modifier;

import org.karaffe.compiler.base.tree.Tree;

import java.io.Serializable;

public interface Modifier extends Serializable, Tree {
    ModifierType getType();
}
