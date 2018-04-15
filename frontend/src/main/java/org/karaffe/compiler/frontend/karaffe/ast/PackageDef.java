package org.karaffe.compiler.frontend.karaffe.ast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

import org.karaffe.compiler.base.pos.Position;
import org.karaffe.compiler.frontend.karaffe.ast.api.AbstractTree;
import org.karaffe.compiler.frontend.karaffe.ast.api.ImportStatement;
import org.karaffe.compiler.frontend.karaffe.ast.api.TypeDefStatement;
import org.karaffe.compiler.frontend.karaffe.ast.names.PackageName;

public class PackageDef extends AbstractTree {
    private final PackageName packageName;
    private final Set<ImportStatement> importStatements;
    private final List<TypeDefStatement> typeDefStatements;

    public PackageDef() {
        this(PackageName.ofRoot());
    }

    public PackageDef(TypeDefStatement... typeDefStatements) {
        this(PackageName.ofRoot(), new HashSet<>(0), Arrays.asList(typeDefStatements));
    }

    public PackageDef(Set<? extends ImportStatement> imports, PackageName packageName) {
        this(packageName, imports, new ArrayList<>());
    }

    public PackageDef(Set<ImportStatement> importStatements, TypeDefStatement... typeDefStatements) {
        this(PackageName.ofRoot(), importStatements, Arrays.asList(typeDefStatements));
    }

    public PackageDef(PackageName packageName, ImportStatement... importStatements) {
        this(packageName, new HashSet<>(Arrays.asList(importStatements)), new ArrayList<>());
    }

    public PackageDef(
            PackageName packageName,
            Set<? extends ImportStatement> importStatements,
            List<? extends TypeDefStatement> typeDefStatements) {
        this.packageName = Objects.requireNonNull(packageName);
        this.importStatements = new LinkedHashSet<>(Objects.requireNonNull(importStatements));
        this.typeDefStatements = new ArrayList<>(Objects.requireNonNull(typeDefStatements));
    }

    public PackageDef(Position position) {
        this(position, PackageName.ofRoot());
    }

    public PackageDef(Position position, PackageName packageName) {
        this(position, packageName, new ArrayList<>(), new ArrayList<>());
    }

    public PackageDef(Position position, PackageName packageName, ImportStatement... importStatements) {
        this(position, packageName, Arrays.asList(importStatements), new ArrayList<>());
    }

    public PackageDef(List<? extends ImportStatement> imports, List<? extends TypeDefStatement> types) {
        this(Position.noPos(), PackageName.ofRoot(), imports, types);
    }

    public PackageDef(Position position, PackageName packageName, List<? extends ImportStatement> importStatements, List<? extends TypeDefStatement> typeDefStatements) {
        super(position);
        this.packageName = Objects.requireNonNull(packageName);
        this.importStatements = new LinkedHashSet<>(Objects.requireNonNull(importStatements));
        this.typeDefStatements = new ArrayList<>(Objects.requireNonNull(typeDefStatements));
    }

    public PackageDef(PackageDef other) {
        this(other.getPosition(), other.getPackageName(), other.getImports(), other.getTypeDefStatements());
    }

    public <T extends ImportStatement> void addImportStatement(T importStatement) {
        if (!this.importStatements.add(Objects.requireNonNull(importStatement))) {
            throw new IllegalStateException("duplicate Import");
        }
    }

    public boolean hasChild() {
        return !(this.importStatements.isEmpty() && this.typeDefStatements.isEmpty());
    }

    public boolean containsImport(ImportStatement importStatement) {
        return this.importStatements.contains(importStatement);
    }

    public <T extends TypeDefStatement> void addTypeDefStatement(T typeDefStatement) {
        this.typeDefStatements.add(Objects.requireNonNull(typeDefStatement));
    }

    public PackageName getPackageName() {
        return new PackageName(this.packageName);
    }

    public List<? extends ImportStatement> getImports() {
        return new ArrayList<>(this.importStatements);
    }

    public List<? extends TypeDefStatement> getTypeDefStatements() {
        return new ArrayList<>(this.typeDefStatements);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof PackageDef) {
            PackageDef other = (PackageDef) obj;
            return this.packageName.equals(other.packageName);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.packageName, this.importStatements, this.typeDefStatements);
    }

    @Override
    public String toString() {
        List<String> lines = new ArrayList<>();
        lines.add("package " + this.packageName + " {");
        this.importStatements.stream().map(ImportStatement::toString).forEach(lines::add);
        this.typeDefStatements.stream().map(TypeDefStatement::toString).forEach(lines::add);
        lines.add("}");
        return String.join("\n", lines);
    }

}