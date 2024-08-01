package org.example.aggregation;

public class Main {
    public static void main(String[] args) {
        Sword sword = new Sword("untitle");
        Human human1 = new Human("Aragorn", sword);
        Human human2 = new Human("Gandalf", sword);

        System.out.println(human1);
        System.out.println(human2);
    }
}
