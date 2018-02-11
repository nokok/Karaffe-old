package unittests;

import static org.junit.Assert.assertEquals;

import java.util.Optional;

import org.junit.Test;
import org.karaffe.compiler.resolvers.PackageResolver;

public class PackageResolverTest {

    @Test
    public void testPackageResolver() {
        Optional<Package> packageOpt = PackageResolver.findPackage("java.lang");
        assertEquals("java.lang", packageOpt.get().getName());
    }
}
