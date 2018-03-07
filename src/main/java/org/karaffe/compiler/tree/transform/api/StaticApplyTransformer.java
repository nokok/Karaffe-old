package org.karaffe.compiler.tree.transform.api;

import java.util.stream.Collectors;

import org.karaffe.compiler.tree.v2.api.Expression;
import org.karaffe.compiler.tree.v2.expressions.StaticApply;

public interface StaticApplyTransformer extends TypeNameTransformer, SimpleNameTransformer, BaseTransformer {

    public default void onStaticApplyBefore(StaticApply staticApply) {

    }

    public default void onStaticApplyAfter(StaticApply staticApply) {

    }

    public default StaticApply transformBody(StaticApply staticApply) {
        return new StaticApply(
                transform(staticApply.getTypeName()),
                transform(staticApply.getMethodName()),
                staticApply.getArgs().stream().map(this::transform).collect(Collectors.toList()));
    }

    public default Expression transform(StaticApply staticApply) {
        onStaticApplyBefore(staticApply);
        StaticApply transformBody = transformBody(staticApply);
        onStaticApplyAfter(transformBody);
        return transformBody;
    }
}
