package org.karaffe.compiler.backend.jvm.tasks;

import net.nokok.azm.Opcodes;
import org.karaffe.compiler.backend.jvm.tasks.visitors.GenJavaByteCodeVisitor;
import org.karaffe.compiler.base.CompilerContext;
import org.karaffe.compiler.base.ir.IR;
import org.karaffe.compiler.base.task.AbstractTask;
import org.karaffe.compiler.base.task.MIRTask;
import org.karaffe.compiler.base.task.TaskResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GenJavaByteCodeTask extends AbstractTask implements MIRTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(GenJavaByteCodeTask.class);

    private final int JAVA_VM_BYTECODE_VERSION;

    public GenJavaByteCodeTask() {
        this.JAVA_VM_BYTECODE_VERSION = Opcodes.V1_8;
    }

    @Override
    public TaskResult run(IR ir, CompilerContext context) {
        ir.accept(new GenJavaByteCodeVisitor(context));
        return TaskResult.SUCCESSFUL;
    }

    @Override
    public String name() {
        return "backend-jvm-bytecode";
    }

    @Override
    public String description() {
        return "Generate Java VM bytecode";
    }

    @Override
    public boolean changed() {
        return false;
    }

}
