package org.karaffe.compiler.frontend.karaffe.tasks.postparse;

import org.karaffe.compiler.base.CompilerContext;
import org.karaffe.compiler.base.generator.Generator;
import org.karaffe.compiler.base.task.ASTTask;
import org.karaffe.compiler.base.task.AbstractTask;
import org.karaffe.compiler.base.task.TaskResult;
import org.karaffe.compiler.base.tree.Tree;
import org.karaffe.compiler.frontend.karaffe.visitor.NormalizeVisitor;

public class NormalizeTask extends AbstractTask implements ASTTask {
    @Override
    public TaskResult run(Tree compilationUnit, CompilerContext context) {
        Tree accept = compilationUnit.accept(new NormalizeVisitor(), Generator.defaultElementIdGenerator());
        context.setCompilationUnit(accept);
        return TaskResult.SUCCESSFUL;
    }

    @Override
    public String name() {
        return "frontend-karaffe-postparse-normalize";
    }

    @Override
    public String description() {
        return "Normalize AST";
    }

    @Override
    public boolean changed() {
        return true;
    }
}
