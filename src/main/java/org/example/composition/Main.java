package org.example.composition;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Aragorn", "Narsil");
        Human human2 = new Human("Gandalf", "Glamdring");

        System.out.println(human1);
        System.out.println(human2);
    }
}
