package org.karaffe.compiler.frontend.karaffe.tasks.postparse;

import org.karaffe.compiler.base.CompilerContext;
import org.karaffe.compiler.base.task.TaskResult;
import org.karaffe.compiler.base.tree.DefaultVisitor;
import org.karaffe.compiler.base.tree.Tree;
import org.karaffe.compiler.base.tree.term.NestedPath;
import org.karaffe.compiler.base.tree.term.Path;
import org.karaffe.compiler.base.tree.term.Terms;
import org.karaffe.compiler.frontend.karaffe.tasks.AbstractTask;

public class NameResolveTask extends AbstractTask {
    @Override
    public String name() {
        return "name-resolver";
    }

    @Override
    public String description() {
        return "resolve simple names";
    }

    @Override
    public TaskResult run(CompilerContext context) {
        Tree compilationUnit = context.getCompilationUnit();
        compilationUnit.accept(new DefaultVisitor<Void>() {

            @Override
            public Path visitNestedName(NestedPath path, Void aVoid) {
                Path typeName = super.visitNestedName(path, aVoid);
                if (typeName.isResolved()) {
                    return typeName;
                }
                if (typeName.asFullName().equals("Array")) {
                    return Terms.typeName("karaffe.core.Array");
                }
                return typeName;
            }

            @Override
            public Path visitTypeName(Path path, Void aVoid) {
                Path typeName = super.visitTypeName(path, aVoid);
                if (path.isResolved()) {
                    return path;
                }
                if (typeName.asFullName().equals("Int")) {
                    typeName.markResolved();
                }
                if (typeName.asFullName().equals("String")) {
                    typeName.markResolved();
                }
                if (typeName.isPrimitiveType() && typeName.asFullName().equals("void")) {
                    typeName.markResolved();
                }
                return typeName;
            }
        }, null);
        return TaskResult.SUCCESS;
    }

    @Override
    public boolean changed() {
        return true;
    }
}