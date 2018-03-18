package org.karaffe.compiler.tree.transform.namer;

import java.util.ArrayList;
import java.util.List;

import org.karaffe.compiler.tree.transform.AbstractTransformer;
import org.karaffe.compiler.tree.v2.CompilationUnit;

public class NameRemapper extends AbstractTransformer {

    private final List<AbstractTransformer> transformers = new ArrayList<>();

    public NameRemapper() {
        super("name-remapper");
        this.transformers.add(new OperatorNameRemapper());
        this.transformers.add(new DefaultImportTransformer());
        this.transformers.add(new ClassNameResolver());
    }

    @Override
    public CompilationUnit transform(CompilationUnit oldCompilationUnit) {
        CompilationUnit last = oldCompilationUnit;
        for (AbstractTransformer transformer : this.transformers) {
            last = transformer.transform(last);
        }
        return last;
    }
}