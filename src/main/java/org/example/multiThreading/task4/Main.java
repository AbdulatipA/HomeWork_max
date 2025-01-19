package org.example.multiThreading.task4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
     ShoppingMall shoppingMall = new ShoppingMall();
     MyRuunable1 myRuunable1 = new MyRuunable1(shoppingMall);
     MyRuunable2 myRuunable2 = new MyRuunable2(shoppingMall);


     Thread t1 = new Thread(myRuunable1);
     Thread t2 = new Thread(myRuunable2);

     t1.start();
     t2.start();

//        try {
//            t1.join();
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        shoppingMall.printArr();
    }
}
