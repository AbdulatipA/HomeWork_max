package org.example.OOP.abstraction;

public abstract class GroundTransportation {
    String type;
    double price;
    String name;

    public GroundTransportation(String type, double price, String name) {
        this.type = type;
        this.price = price;
        this.name = name;
    }


    void BuyTransport(double price, String type) {
        if(price >= this.price && type.equals(this.type)) {
            System.out.println("Да, вы можете купить этот транспорт, он стоит " + this.price + " рублей");
        }
        if(price < this.price && type.equals(this.type)) {
            double countMoney = this.price - price;
            System.out.println("Увы, у вас не хватает " + countMoney + " рублей");
        }
    }
}
