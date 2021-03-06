package org.karaffe.compiler.frontend.karaffe.tasks.postparse;

import org.karaffe.compiler.base.CompilerContext;
import org.karaffe.compiler.base.task.AbstractTask;
import org.karaffe.compiler.base.task.NoDescriptionTask;
import org.karaffe.compiler.base.task.Task;
import org.karaffe.compiler.base.task.TaskResult;
import org.karaffe.compiler.base.task.TaskRunner;

import java.util.LinkedHashSet;
import java.util.Set;

public class PostParseTask extends AbstractTask implements NoDescriptionTask {

    private final Set<Task> subTask = new LinkedHashSet<>();

    public PostParseTask() {
        this.subTask.add(new NormalizeTask());
    }

    @Override
    public String name() {
        return "frontend-karaffe-postparse";
    }

    @Override
    public TaskResult run(CompilerContext context) {
        TaskRunner taskRunner = TaskRunner.newDefaultTaskRunner(context);
        this.subTask.forEach(taskRunner::standBy);
        return taskRunner.runAll().toTaskResult();
    }

    @Override
    public boolean changed() {
        return true;
    }

    @Override
    public Set<Task> getSubTask(CompilerContext context) {
        return subTask;
    }

    @Override
    public boolean isRunnable(CompilerContext context) {
        return context.getCompilationUnit() != null;
    }
}
