package org.example.lessonInterface;

import java.util.Arrays;

public class Bus {
    Passenger[] busPassenger = new Passenger[20];

    void getPassengers(Passenger[] passenger) {
        for (int i = 0; i < passenger.length; i++) {
            busPassenger[i] = passenger[i];
        }
        System.out.println(Arrays.toString(passenger));
    }

    void freeSeats(){
        int count = 0;
        for (int i = 0; i < busPassenger.length; i++) {
            if(busPassenger[i] == null) {
                count++;
            }
        }
        System.out.println("Свободных мест в астобусе осталось: " + count);
    }
}
