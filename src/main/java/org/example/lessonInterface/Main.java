package org.example.lessonInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Conductor conductor = new Conductor("Conductor");
        Human human = new Human("Human");
        Driver driver = new Driver("Driver");

        Passenger[] passengers = {conductor, human, driver};
        bus.addPassenger(passengers);
        bus.freeSeats();
    }
}
