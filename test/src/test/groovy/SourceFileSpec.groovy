import org.karaffe.compiler.base.util.SourceFile
import spock.lang.Specification

import java.nio.file.Paths

class SourceFileSpec extends Specification {

    def "SourceFile from File object"() {
        when:
        new SourceFile(new File("foo.krf"))

        then:
        thrown(UncheckedIOException)
    }

    def "SourceFile from File object(directory)"() {
        setup:
        def f = new File(".")

        expect:
        f.isDirectory()

        when:
        new SourceFile(f)

        then:
        thrown(IllegalArgumentException)
    }

    def "SourceFile#toPath is returns absolute path representation"() {
        setup:
        def f = Paths.get("tests", "test_resources", "pos", "Empty.krf")
        def s = new SourceFile(f.toFile())

        expect:
        s.toPath() == f.toAbsolutePath()
    }

    def "SourceFile#isUnknownFile is return true when SourceFile is generated by fromLiteral"() {
        setup:
        def sourceFile = SourceFile.fromLiteral("abc")

        expect:
        sourceFile.isUnknownFile()
    }

    def "Calling SourceFile#toPath throws UnsupportedOperationException if unknown SourceFile"() {
        setup:
        def sourceFile = SourceFile.fromLiteral("abc")

        when:
        sourceFile.toPath()

        then:
        thrown(UnsupportedOperationException)
    }

}