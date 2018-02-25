package org.karaffe.compiler.tree.v2.statements;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.karaffe.compiler.pos.Position;
import org.karaffe.compiler.tree.v2.api.StatementType;
import org.karaffe.compiler.tree.v2.api.TypeDefMember;
import org.karaffe.compiler.tree.v2.api.TypeDefStatement;
import org.karaffe.compiler.tree.v2.names.SimpleName;

public class ClassDef extends AbstractTypeDefStatement {

    public ClassDef(SimpleName typeName, SimpleName superClassName) {
        super(typeName, superClassName);
    }

    public ClassDef(SimpleName typeName, SimpleName superClassName, List<? extends SimpleName> interfaces) {
        super(Position.noPos(), typeName, superClassName, interfaces);
    }

    public ClassDef(SimpleName typeName, SimpleName superClassName, List<? extends SimpleName> interfaces, List<? extends TypeDefMember> members) {
        super(typeName, superClassName, interfaces, members);
    }

    public ClassDef(SimpleName typeName, TypeDefMember... members) {
        super(typeName, SimpleName.rootClass(), new ArrayList<>(0), new ArrayList<>(Arrays.asList(members)));
    }

    public ClassDef(Position position, SimpleName typeName, SimpleName superClassName) {
        super(position, typeName, superClassName);
    }

    public ClassDef(Position position, SimpleName typeName, SimpleName superClassName, List<? extends SimpleName> interfaces) {
        super(position, typeName, superClassName, interfaces);
    }

    public ClassDef(Position position, SimpleName typeName, SimpleName superClassName, List<? extends SimpleName> interfaces, List<? extends TypeDefMember> members) {
        super(position, typeName, superClassName, interfaces, members);
    }

    public ClassDef(TypeDefStatement otherTypeDef) {
        super(otherTypeDef.getPosition(), otherTypeDef.getName(), otherTypeDef.getSuperClassName(), otherTypeDef.getInterfaceNames(), otherTypeDef.getBody());
    }

    @Override
    public StatementType getStatementType() {
        return StatementType.CLASS_DEF;
    }

    @Override
    public boolean isInterfaceDecl() {
        return false;
    }

    @Override
    public boolean isClassDecl() {
        return true;
    }

    @Override
    public String toString() {
        return String.format("class %s extends %s%s {\n"
                + "%s\n"
                + "}",
                this.getName(),
                this.getSuperClassName(),
                this.getInterfaceNames().isEmpty() ? "" : "implements " + String.join(", ", this.getInterfaceNames()),
                String.join(";\n", this.getBody().stream().map(TypeDefMember::toString).collect(Collectors.toList())));
    }

}
