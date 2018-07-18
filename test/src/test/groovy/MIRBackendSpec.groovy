import org.karaffe.compiler.backend.jvm.BackendType
import org.karaffe.compiler.backend.jvm.KaraffeCompilerBackend
import org.karaffe.compiler.base.CompilerContext
import org.karaffe.compiler.base.CompilerContextImpl
import org.karaffe.compiler.base.mir.Instructions
import org.karaffe.compiler.base.task.Task
import org.karaffe.compiler.base.task.TaskResult
import org.karaffe.compiler.base.util.SourceFile
import org.karaffe.compiler.frontend.karaffe.FrontendType
import org.karaffe.compiler.frontend.karaffe.KaraffeCompilerFrontend
import spock.lang.Specification

class MIRBackendSpec extends Specification {
    private Instructions parse(String source) {
        Task frontend = KaraffeCompilerFrontend.getFrontend(FrontendType.KARAFFE)
        CompilerContext context = new CompilerContextImpl()
        context.addSourceFile(SourceFile.fromLiteral(source))
        def result = frontend.run(context)
        if (result != TaskResult.SUCCESSFUL) {
            throw new RuntimeException()
        }
        return context.getInstructions()
    }

    private CompilerContext runBackend(String source) {
        def instructions = parse(source)
        Task backend = KaraffeCompilerBackend.getBackend(BackendType.JVM)
        CompilerContext context = new CompilerContextImpl()
        context.setInstructions(instructions)
        def run = backend.run(context)
        if (run != TaskResult.SUCCESSFUL) {
            throw new RuntimeException()
        }
        return context
    }

    private boolean assertBytecodeFileCount(CompilerContext context, int count) {
        return context.getBytecodes().size() == count
    }

    def "simpleClass1"() {
        setup:
        def context = runBackend("""class A""")

        expect:
        context.getInstructions().toString() == """[       <no-pos>] BeginBlock #
[       <no-pos>] NameRule Object -> Ljava/lang/Object;
[       <no-pos>] NameRule String -> Ljava/lang/String;
[       <no-pos>] NameRule System -> Ljava/lang/System;
[       <no-pos>] NameRule Integer -> Ljava/lang/Integer;
[       <no-pos>] NameRule Matcher -> Ljava/util/regex/Matcher;
[       <no-pos>] NameRule Pattern -> Ljava/util/regex/Pattern;
[       <no-pos>] BeginClass #A
[       <no-pos>] BeginConstructor #A#<init>():void
[       <no-pos>] Load this
[       <no-pos>] InvokeSpecial Ljava/lang/Object#<init>():V
[       <no-pos>] Return
[       <no-pos>] EndConstructor #A#<init>():void
[       <no-pos>] EndClass #A
[       <no-pos>] EndBlock #"""
        !context.hasErrorReport()
        !context.hasAnyReport()
        assertBytecodeFileCount(context, 1)
    }

    def "mainMethod"() {
        setup:
        def context = runBackend("""class A {
  main {
  }
}""")

        expect:
        context.getInstructions().toString() == """[       <no-pos>] BeginBlock #
[       <no-pos>] NameRule Object -> Ljava.lang.Object;
[       <no-pos>] NameRule String -> Ljava.lang.String;
[       <no-pos>] NameRule System -> Ljava.lang.System;
[       <no-pos>] NameRule Integer -> Ljava.lang.Integer;
[       <no-pos>] NameRule Matcher -> Ljava.util.regex.Matcher;
[       <no-pos>] NameRule Pattern -> Ljava.util.regex.Pattern;
[       <no-pos>] BeginClass #A
[       <no-pos>] BeginConstructor #A#<init>():void
[       <no-pos>] Load this
[       <no-pos>] InvokeSpecial Ljava/lang/Object#<init>():V
[       <no-pos>] Return
[       <no-pos>] EndConstructor #A#<init>():void
[       <no-pos>] BeginClass #A
[        2:2~3:2] [public, static] BeginMethod #A#main([Ljava/lang/String;):V
[       <no-pos>] [ParameterName] ValDef #A#main([Ljava/lang/String;):V#args Ljava/lang/String;s
[       <no-pos>] EndMethod #A#main([Ljava/lang/String;):V
[       <no-pos>] EndClass #A
[       <no-pos>] EndBlock #"""
    }
}
