package org.example.multiThreading.task4;

public class MyRuunable2 implements Runnable {
    private ShoppingMall shoppingMall;

    public MyRuunable2(ShoppingMall shoppingMall) {
        this.shoppingMall = shoppingMall;
    }


    @Override
    public void run() {
        shoppingMall.off();
    }
}
