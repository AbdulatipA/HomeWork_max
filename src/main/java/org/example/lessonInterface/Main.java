package org.example.lessonInterface;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus();
        Conductor conductor = new Conductor("Conductor");
        Human human = new Human("Human");
        Driver driver = new Driver("Driver");

        Passenger[] passengers = {conductor, human, driver};
        bus.getPassengers(passengers);
        bus.freeSeats();
    }
}
