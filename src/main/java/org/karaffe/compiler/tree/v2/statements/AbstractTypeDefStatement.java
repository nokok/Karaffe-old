package org.karaffe.compiler.tree.v2.statements;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.karaffe.compiler.pos.Position;
import org.karaffe.compiler.tree.v2.api.AbstractTree;
import org.karaffe.compiler.tree.v2.api.TypeDefMember;
import org.karaffe.compiler.tree.v2.api.TypeDefStatement;
import org.karaffe.compiler.tree.v2.names.SimpleName;

public abstract class AbstractTypeDefStatement extends AbstractTree implements TypeDefStatement {
    private final SimpleName typeName;
    private final SimpleName superClassName;
    private final List<SimpleName> interfaces;
    private final List<TypeDefMember> members;

    public AbstractTypeDefStatement(SimpleName typeName, SimpleName superClassName) {
        this(Position.noPos(), typeName, superClassName);
    }

    public AbstractTypeDefStatement(SimpleName typeName, SimpleName superClassName, List<? extends SimpleName> interfaces) {
        this.typeName = Objects.requireNonNull(typeName);
        this.superClassName = Objects.requireNonNull(superClassName);
        this.interfaces = new ArrayList<>(interfaces);
        this.members = new ArrayList<>();
    }

    public AbstractTypeDefStatement(SimpleName typeName, SimpleName superClassName, List<? extends SimpleName> interfaces, List<? extends TypeDefMember> members) {
        this.typeName = Objects.requireNonNull(typeName);
        this.superClassName = Objects.requireNonNull(superClassName);
        this.interfaces = new ArrayList<>(interfaces);
        this.members = new ArrayList<>(members);
    }

    public AbstractTypeDefStatement(Position position, SimpleName typeName, SimpleName superClassName) {
        this(position, typeName, superClassName, new ArrayList<>(0));
    }

    public AbstractTypeDefStatement(Position position, SimpleName typeName, SimpleName superClassName, List<? extends SimpleName> interfaces) {
        super(position);
        this.typeName = Objects.requireNonNull(typeName);
        this.superClassName = Objects.requireNonNull(superClassName);
        this.interfaces = new ArrayList<>(interfaces);
        this.members = new ArrayList<>();
    }

    public AbstractTypeDefStatement(Position position, SimpleName typeName, SimpleName superClassName, List<? extends SimpleName> interfaces, List<? extends TypeDefMember> members) {
        super(position);
        this.typeName = Objects.requireNonNull(typeName);
        this.superClassName = Objects.requireNonNull(superClassName);
        this.interfaces = new ArrayList<>(interfaces);
        this.members = new ArrayList<>(members);
    }

    @Override
    public SimpleName getName() {
        return this.typeName;
    }

    @Override
    public SimpleName getSuperClassName() {
        return this.superClassName;
    }

    @Override
    public List<? extends SimpleName> getInterfaceNames() {
        return new ArrayList<>(this.interfaces);
    }

    @Override
    public List<? extends TypeDefMember> getBody() {
        return new ArrayList<>(this.members);
    }

    public void addMember(TypeDefMember member) {
        this.members.add(Objects.requireNonNull(member));
    }
}
