package org.example.GenericsHomeWorks.Task2;

public class Robot {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Robot(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Robot: " + "id = " + id;
    }
}


