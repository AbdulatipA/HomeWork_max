package org.example.compositions.composition2;

public class Main {
    public static void main(String[] args) {
        Human human1 = new Human("Alex", "Tesla");
        Human human2 = new Human("John", "Nisan");
        Human human3 = new Human("Jack", "Buggati");

        Human[] humans = {human1, human2, human3};

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i]);
        }
    }
}
