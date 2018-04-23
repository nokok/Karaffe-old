import org.antlr.v4.runtime.ANTLRInputStream
import org.antlr.v4.runtime.CommonTokenStream
import org.karaffe.compiler.frontend.karaffe.antlrautogenerated.KaraffeLexer
import org.karaffe.compiler.frontend.karaffe.antlrautogenerated.KaraffeParser
import org.karaffe.compiler.frontend.karaffe.listener.ASTBuilder
import spock.lang.Specification
import spock.lang.Unroll

public class ASTSpec extends Specification {

    def astBuilder = new ASTBuilder()

    @Unroll
    def "整数値をパースするとIntLiteralノードを生成する #source -> #expected"() {
        setup:
        def lexer = new KaraffeLexer(new ANTLRInputStream(source))
        lexer.removeErrorListeners()
        def parser = new KaraffeParser(new CommonTokenStream(lexer))
        parser.removeErrorListeners()
        parser.removeParseListeners()
        parser.addParseListener(astBuilder)
        parser.addErrorListener(astBuilder)
        parser.compilationUnit()

        expect:
        hasElement == astBuilder.hasElementInStack()
        if (!hasElement) {
            return
        }
        !astBuilder.hasError()
        def cp = astBuilder.stackPeek
        expected == cp.toString()

        where:

        source || hasElement || expected
        "0"    || true       || "Int.<init>(0)"
        "1"    || true       || "Int.<init>(1)"
        "10"   || true       || "Int.<init>(10)"
        "b"    || false      || ""
    }

    @Unroll
    def "整数値 演算子 整数値 の形式で式を組み立てることができる"() {
        setup:
        def lexer = new KaraffeLexer(new ANTLRInputStream(source))
        lexer.removeErrorListeners()
        def parser = new KaraffeParser(new CommonTokenStream(lexer))
        parser.removeErrorListeners()
        parser.removeParseListeners()
        parser.addParseListener(astBuilder)
        parser.addErrorListener(astBuilder)
        parser.compilationUnit()

        expect:
        hasElement == astBuilder.hasElementInStack()
        if (!hasElement) {
            return
        }
        !astBuilder.hasError()
        def cp = astBuilder.stackPeek
        expected == cp.toString()

        where:

        source      || hasElement || expected
        "1 + 2"     || true       || "Int.<init>(1).+(Int.<init>(2))"
        "1 + 2 * 3" || true       || "Int.<init>(1).+(Int.<init>(2).*(Int.<init>(3)))" //1 + (2 * 3)
        "1 - 2 + 3" || true       || "Int.<init>(1).-(Int.<init>(2)).+(Int.<init>(3))" //(1 + 2) + 3
        "2 * 3 / 4" || true       || "Int.<init>(2).*(Int.<init>(3))./(Int.<init>(4))" //(2 * 3) / 4
    }
}