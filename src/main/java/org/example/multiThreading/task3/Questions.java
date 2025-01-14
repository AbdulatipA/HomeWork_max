package org.example.multiThreading.task3;

import java.util.Scanner;

public class Questions {
    Machine machine = new Machine();
    Scanner sc = new Scanner(System.in);

    void questions(){
        System.out.println("--------------------");
            System.out.print("Выберите цифру: \n");
            System.out.println("1. Запустить станок");
            System.out.println("2. Проверить количество произведенного товара");
            System.out.println("3. Остановить станок после 20 изготовлений");
            System.out.println("4. Остановить станок");
            System.out.println("5. Состояние станка");
            System.out.println("6. Выход");
        System.out.println("-------------------- \n");
    }

    void answer(){
        String text = sc.nextLine();
        switch(text){
            case "1": machine.start();
                        break;
            case "2": machine.printCount();
                        break;
            default: System.out.println("Введите указанные цифры");
        }
    }
}
