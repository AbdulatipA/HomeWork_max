package org.example.furniture;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Table table = new Table(10, 10, 20, 123.1, "стол");
        Chair chair = new Chair(5, 5, 10, 95.6, "стул");
        Bed bed = new Bed(1, 3, 5, 56.6, "кровать");
        Kettle kettle = new Kettle(15, 30, 50, 451.9, "чайник");
        Dresser dresser = new Dresser(15, 30, 50, 451.8, "комод");

        Furniture[] arrFurniture = {table, chair, bed, kettle, dresser};
        System.out.println("Введите значение от 1 до 6, или 7 - чтобы вывести самый дорогой товар.");
        printFurniture(arrFurniture);
    }

    public static void printFurniture(Furniture[] arrFurniture) {
        String answer = sc.nextLine();

//        switch (answer) {
//            default:
//                System.out.println("Неверно введенное значение. Попробуйте еще раз.");
//                break;
//            case "1":
//                System.out.println("Весь список мебели:");
//                getFurniture(arrFurniture, "");
//                break;
//            case "2":
//                getFurniture(arrFurniture, "стол");
//                break;
//            case "3":
//                getFurniture(arrFurniture, "кровать");
//                break;
//            case "4":
//                getFurniture(arrFurniture, "комод");
//                break;
//            case "5":
//                getFurniture(arrFurniture, "стул");
//                break;
//            case "6":
//                getFurniture(arrFurniture, "чайник");
//                break;
//            case "7":
//                mostExpensiveProduct(arrFurniture);
//                break;
//        }
    }

    public static void getFurniture(Furniture[] arrFurniture, String str) {
        for (Furniture f : arrFurniture) {
            if (str.equals(f.type)) {
                System.out.println(f.type);
            } else if (str.isEmpty()) {
                System.out.println(f);
            }
        }
    }

    public static void mostExpensiveProduct(Furniture[] arrFurniture) {
        double expensive = 0;
        for (Furniture f : arrFurniture) {
            if (f.price > expensive) {
                expensive = f.price;
            }
        }
        System.out.println("Самый дорогой товар стоит: " + expensive);
    }
}