package org.example.multiThreading.task4;

public class MyRuunable1 implements Runnable {
    private ShoppingMall shoppingMall;

    public MyRuunable1(ShoppingMall shoppingMall) {
        this.shoppingMall = shoppingMall;
    }

    @Override
    public void run() {
        shoppingMall.on();
    }
}
