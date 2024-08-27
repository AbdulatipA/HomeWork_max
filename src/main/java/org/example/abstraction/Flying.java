package org.example.abstraction;

public abstract class Flying {
    String type;
    String name;

    Flying(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Летающий:" + " тип = " + type + ", название = " + name;
    }

    abstract void Showtype();
}
