package org.karaffe.compiler.frontend.karaffe.tasks;

import org.karaffe.compiler.base.CompilerContext;
import org.karaffe.compiler.base.task.TaskResult;
import org.karaffe.compiler.frontend.karaffe.antlrautogenerated.KaraffeParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParserTask extends AbstractTask {

    private static final Logger LOGGER = LoggerFactory.getLogger(ParserTask.class);

    @Override
    public String name() {
        return "parsing";
    }

    @Override
    public String description() {
        return "Parsing Token Stream";
    }

    @Override
    public TaskResult run(CompilerContext context) {
        context.tokenStreamStream().map(KaraffeParser::new).forEach(parser -> {
            LOGGER.trace("new Parser : {}", parser);
            LOGGER.trace("Removing default listeners...");
            parser.removeParseListeners();
            parser.removeErrorListeners();
            LOGGER.trace("Removed");
            LOGGER.debug("Start Parsing... : {}", parser.getSourceName());
            KaraffeParser.CompilationUnitContext antlrCUContext = parser.compilationUnit();
            LOGGER.debug("Parsed");
            context.addContext(antlrCUContext);
        });
        return TaskResult.SUCCESS;
    }

    @Override
    public boolean isRunnable(CompilerContext context) {
        return context.tokenStreamStream().count() > 0;
    }

    @Override
    public boolean changed() {
        return true;
    }
}