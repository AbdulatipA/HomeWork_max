package org.example.aggregation2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine("Tesla");
        Human human1 = new Human("Alex", machine);
        Human human2 = new Human("John", machine);
        Human human3 = new Human("Jack", machine);

        Human[] humans = {human1, human2, human3};

        for (int i = 0; i < humans.length; i++) {
            System.out.println(humans[i]);
        }
    }
}
