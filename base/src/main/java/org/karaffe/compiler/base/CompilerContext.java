package org.karaffe.compiler.base;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.ParserRuleContext;
import org.karaffe.compiler.base.mir.instructions.IR;
import org.karaffe.compiler.base.tree.Tree;

import java.util.stream.Stream;

public interface CompilerContext extends
        SourceFileContainer,
        CommandLineOptionContext,
        ReportContainer,
        BytecodeContainer,
        BackendConfiguration,
        FrontendConfiguration {

    String getState();

    void setState(String state);

    void addLexer(Lexer lexer);

    Stream<CommonTokenStream> tokenStreamStream();

    void addContext(ParserRuleContext context);

    Stream<ParserRuleContext> contextStream();

    Tree getCompilationUnit();

    void setCompilationUnit(Tree compilationUnit);

    void setInstructions(IR instructions);

    IR getInstructions();

    void setIR(org.karaffe.compiler.base.ir.IR ir);

    org.karaffe.compiler.base.ir.IR getIR();
}
