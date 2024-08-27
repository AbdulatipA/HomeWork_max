package org.example.abstraction;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Самолет", "Победа");
        Helicopter helicopter = new Helicopter("Вертолет", "A106", 2);
        airplane.Showtype();
        helicopter.Showtype();
        helicopter.ShowCountHelix();

//
//        System.out.println("Введите сумму и тип транспорта, который вы хотите приобрести");
//        Bicycle bicycle = new Bicycle("Велосипед", 10, "Спринтер");
//        Scooter scooter = new Scooter("Самокат", 51, "Скотт");
//        GroundTransportation[] transportation = {bicycle, scooter};
//        BuyGroundTransport(transportation);
//
//
//        WoodBoat woodBoat = new WoodBoat("Деревянная лодка", "Кайла", 5113.1);
//        System.out.println("Поздоровайся с лодкой");
//        String syHi = sc.next();
//        woodBoat.syHi(syHi);
//
//
//        Square square = new Square(10, 10);
//        int squareValue = square.square();
//        System.out.println("Площадь кватрада равна = " + squareValue + " см.");
//
//
//        Samsung samsung = new Samsung("SamsungA12", "Samsung", "Android", 2020);
//        Iphone iphone = new Iphone("Iphone 5", "Iphone", "IOS", 2012);
//        samsung.showInfo();
//        iphone.showInfo();
    }


//  Наземный транспорт
    static void BuyGroundTransport(GroundTransportation[] transportation) {
        double price = sc.nextDouble();
        String type = sc.next();
        for (GroundTransportation t : transportation) {
            if(t.type.equals(type)){
                t.BuyTransport(price, type);
            }
        }
    }
}