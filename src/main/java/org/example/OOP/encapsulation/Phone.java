package org.example.OOP.encapsulation;

import org.example.furniture.Furniture;

import java.util.Arrays;

public class Phone {
    String model;
    String PhoneNumber;
    String[] outgoingСallsArr = new String[2];

    void call(String phone){
        System.out.println("Идет звонок на данный номер...");
        System.out.println("Звонок идет с номера: " + PhoneNumber + " на номер " + phone);
        saveNumberPhone(phone);
    }

    void saveNumberPhone(String number){
        for (int i = 0; i < outgoingСallsArr.length; i++) {
            if(this.outgoingСallsArr[i] == null) {
                this.outgoingСallsArr[i] = number;
                break;
            }
        }
    }

    public Phone(String model, String PhoneNumber) {
        this.model = model;
        this.PhoneNumber = PhoneNumber;
    }

    @Override
    public String toString() {
        return "Phone: " + "модель = " + model + ", номер телефона = " + PhoneNumber + ", исходящие звонки = "
                + Arrays.toString(outgoingСallsArr);
    }
}