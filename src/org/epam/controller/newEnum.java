package org.epam.controller;
import java.io.Serializable;
import java.util.ArrayList;

public class newEnum<E extends newEnum<E>> implements  Comparable<newEnum>, Serializable {
    private final String name;
    private final int ordinal;
    public static final ArrayList<newEnum> values = new ArrayList<>();


    public newEnum(String name) {
        this.name = name;
        this.ordinal = values.size();
        values.add(this);
    }

    public final String name() {
        return name;
    }

    public int getOrdinal() {
        return ordinal;
    }

    public static ArrayList values() {
        return values;
    }

    public static newEnum valuesOf(String name) {
        if (name == null) {
            throw new NullPointerException();
        }

        for (newEnum element : values) {
            if (element.name().equals(name)){
                return element;
            }
        }
        throw new IllegalArgumentException();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    protected final Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    @Override
    public String toString() {
        return name;
    }



    @Override
    public int compareTo(newEnum o) {
        if (this.getClass() != o.getClass() && this.getDeclaringClass() != o.getDeclaringClass()){
            throw new ClassCastException();
        }
        return (this.ordinal - o.ordinal);
    }

    public final Class<newEnum> getDeclaringClass() {
        Class<?> thisClass = getClass();
        Class<?> superClass = thisClass.getClass();
        return (superClass == Enum.class) ? (Class<newEnum>) thisClass : (Class<newEnum>) superClass;
    }
}
