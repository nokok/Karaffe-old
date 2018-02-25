package org.karaffe.compiler.tree.transform.api;

import java.util.ArrayList;
import java.util.List;

import org.karaffe.compiler.tree.v2.api.TypeDefStatement;
import org.karaffe.compiler.tree.v2.names.SimpleName;

public interface TypeDefInterfacesTransformer extends SimpleNameTransformer {

    public default void onInterfacesBefore(TypeDefStatement parent, List<? extends SimpleName> oldInterfaces) {

    }

    public default void onInterfacesAfter(TypeDefStatement parent, List<? extends SimpleName> oldInterfaces) {

    }

    public default List<? extends SimpleName> transformOnTypeDefInterfaces(TypeDefStatement parent, List<? extends SimpleName> oldInterfaces) {
        onInterfacesBefore(parent, oldInterfaces);
        List<SimpleName> interfaces = new ArrayList<>();
        for (SimpleName simpleName : oldInterfaces) {
            interfaces.add(transform(simpleName));
        }
        onInterfacesAfter(parent, interfaces);
        return interfaces;
    }
}
