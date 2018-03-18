package org.karaffe.compiler.tree.v2.statements;

import java.util.Objects;
import java.util.Optional;

import org.karaffe.compiler.pos.Position;
import org.karaffe.compiler.tree.v2.api.AbstractTree;
import org.karaffe.compiler.tree.v2.api.Expression;
import org.karaffe.compiler.tree.v2.api.NameRef;
import org.karaffe.compiler.tree.v2.api.Statement;
import org.karaffe.compiler.tree.v2.expressions.ExpressionName;
import org.karaffe.compiler.tree.v2.names.SimpleName;
import org.karaffe.compiler.tree.v2.names.TypeName;
import org.karaffe.compiler.types.v2.states.InferState;
import org.karaffe.compiler.types.v2.states.InferStateType;
import org.karaffe.compiler.types.v2.states.Resolved;

public abstract class LetDef extends AbstractTree implements Statement, NameRef {

    private final SimpleName name;
    private final Optional<TypeName> typeName;
    private Optional<Expression> initializer;

    public LetDef(SimpleName fieldName, Expression initializer) {
        this(Position.noPos(), fieldName, null, initializer);
    }

    public LetDef(SimpleName fieldName, TypeName typeName) {
        this(Position.noPos(), fieldName, typeName, null);
    }

    public LetDef(SimpleName fieldName, TypeName typeName, Expression initializer) {
        this(Position.noPos(), fieldName, typeName, initializer);
    }

    public LetDef(Position position, SimpleName fieldName, Expression initializer) {
        this(position, fieldName, null, initializer);
    }

    public LetDef(Position position, SimpleName fieldName, TypeName typeName) {
        this(position, fieldName, typeName, null);
    }

    public LetDef(Position position, SimpleName fieldName, TypeName typeName, Expression initializer) {
        super(position);
        this.name = Objects.requireNonNull(fieldName);
        this.typeName = Optional.ofNullable(typeName);
        this.initializer = Optional.ofNullable(initializer);
        if (!this.typeName.isPresent() && !this.initializer.isPresent()) {
            throw new IllegalArgumentException("this.typeName.isEmpty() && this.initializer.isEmpty()");
        }
    }

    public LetDef(LetDef other) {
        super(other.getPosition());
        this.name = other.name;
        this.typeName = other.getTypeName();
        this.initializer = other.getInitializer();
    }

    public SimpleName getName() {
        return this.name;
    }

    public boolean hasTypeName() {
        return this.getTypeName().isPresent();
    }

    public Optional<TypeName> getTypeName() {
        return this.typeName;
    }

    public Optional<Expression> getInitializer() {
        return this.initializer;
    }

    public boolean hasInitializer() {
        return this.getInitializer().isPresent();
    }

    public void replaceInitializer(Expression expression) {
        this.initializer = Optional.ofNullable(expression);
    }

    @Override
    public boolean isNormalizable() {
        return this.initializer.map(expr -> expr.isNormalizable()).orElse(false);
    }

    @Override
    public Optional<ExpressionName> asExprName() {
        return Optional.of(new ExpressionName(this.getName().toString()));
    }

    @Override
    public String toString() {
        String typeNameString;
        if (this.hasInferState()) {
            InferState state = this.getInferState();
            if (state.getInferStateType().equals(InferStateType.RESOLVED)) {
                Resolved resolved = (Resolved) state;
                typeNameString = resolved.getSuitableType().getCanonicalName();
            } else {
                typeNameString = state.toString();
            }
        } else {
            typeNameString = this.typeName.map(TypeName::toString).orElse("");
        }
        return String.format("let %s%s%s",
                this.name,
                typeNameString.isEmpty() ? "" : " : " + typeNameString,
                this.initializer.map(e -> " = " + e).orElse(""));
    }

}