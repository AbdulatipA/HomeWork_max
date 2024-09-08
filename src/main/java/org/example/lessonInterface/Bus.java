package org.example.lessonInterface;

import java.util.ArrayList;
import java.util.Arrays;

public class Bus {
    Passenger[] busPassengers = new Passenger[20];

//        void getPassengers(Passenger[] passenger) {
//        for (int i = 0; i < passenger.length; i++) {
//            busPassenger[i] = passenger[i];
//        }
//        System.out.println(Arrays.toString(passenger));
//    }


    void addPassenger(Passenger[] passenger){
        int size = 0;

        for(Passenger p : passenger){
            busPassengers[size] = p;
            size++;
        }
        System.out.println(Arrays.toString(busPassengers));
    }

    //    void addPassenger(Passenger passenger){
//        ArrayList<Passenger> passengersArr = new ArrayList<>();
//        passengersArr.add(passenger);
//        for(Passenger p : passengersArr){
//            busPassengers[size] = p;
//        }
//        size++;
//    }

    void freeSeats(){
        int count = 0;
        for (int i = 0; i < busPassengers.length; i++) {
            if(busPassengers[i] == null) {
                count++;
            }
        }
        System.out.println("Свободных мест в астобусе осталось: " + count);
    }
}





