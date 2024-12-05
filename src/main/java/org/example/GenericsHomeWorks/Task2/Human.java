package org.example.GenericsHomeWorks.Task2;

public class Human {
   private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Human: " + "name = " + name;
    }
}



