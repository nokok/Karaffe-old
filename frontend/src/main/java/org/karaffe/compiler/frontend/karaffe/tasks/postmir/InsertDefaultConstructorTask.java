package org.karaffe.compiler.frontend.karaffe.tasks.postmir;

import org.karaffe.compiler.base.CompilerContext;
import org.karaffe.compiler.base.ir.IR;
import org.karaffe.compiler.base.task.AbstractTask;
import org.karaffe.compiler.base.task.MIRTask;
import org.karaffe.compiler.base.task.TaskResult;

public class InsertDefaultConstructorTask extends AbstractTask implements MIRTask {

    @Override
    public String name() {
        return "frontend-karaffe-postmir-defaultctor";
    }

    @Override
    public String description() {
        return "Insert default constructor";
    }

    @Override
    public boolean changed() {
        return false;
    }

    @Override
    public TaskResult run(IR ir, CompilerContext context) {
        return TaskResult.SUCCESSFUL;
    }
}
