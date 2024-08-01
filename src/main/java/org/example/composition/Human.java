package org.example.composition;

public class Human {
        String name;
        Sword sword;


        public Human(String name, String sword) {
        this.name = name;
        this.sword = new Sword(sword);
    }

        @Override
        public String toString() {
        return "Human { name = " + name + ", sword = " + sword.title + " }";
    }
}
