package org.karaffe.compiler.frontend.karaffe.visitor;

import org.karaffe.compiler.frontend.karaffe.antlrautogenerated.KaraffeBaseVisitor;
import org.karaffe.compiler.frontend.karaffe.antlrautogenerated.KaraffeParser;
import org.karaffe.compiler.frontend.karaffe.ast.CompilationUnit;
import org.karaffe.compiler.frontend.karaffe.ast.api.Tree;
import org.karaffe.compiler.frontend.karaffe.ast.api.TypeDefStatement;

import java.util.List;

public class ASTVisitor extends KaraffeBaseVisitor<CompilationUnit> {

    @Override
    public CompilationUnit visitCompilationUnit(KaraffeParser.CompilationUnitContext ctx) {
        CompilationUnit compilationUnit = new CompilationUnit();
        List<KaraffeParser.TopLevelStatementContext> context = ctx.topLevelStatement();
        TopLevelStatementVisitor visitor = new TopLevelStatementVisitor();
        for (KaraffeParser.TopLevelStatementContext topLevelStmt : context) {
            Tree stmt = topLevelStmt.accept(visitor);
            compilationUnit.addTypeDefStatement((TypeDefStatement) stmt);
        }
        return compilationUnit;
    }
}
