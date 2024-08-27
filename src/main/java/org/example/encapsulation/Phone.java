package org.example.encapsulation;

import org.example.furniture.Furniture;

import java.util.Arrays;

public class Phone {
    String model;
    String PhoneNumber;
    String[] outgoingСallsArr = new String[2];

    void call(String phone){
        if(phone.length()!=11){  ///почему скобки где length?
            System.out.println("В номере должно быть 11 символов");
        } else {
            System.out.println("Идет звонок на данный номер...");
            System.out.println("Звонок идет с номера: " + PhoneNumber + " на номер " + phone);
        }
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