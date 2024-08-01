package org.example.inheritance;

public class Main {
    public static void main(String[] args) {
        Ring ring = new Ring(481.69, "ring", 5.5);
        Ring ring2 = new Ring(555.56, "ring2", 1.3);
        Earrings earrings = new Earrings(5981.2, "earrings");
        Earrings earrings2 = new Earrings(484.6, "earrings2");


        Jewelry[] decorations = {ring, ring2, earrings, earrings2};

        double total = 0;

        for (int i = 0; i < decorations.length; i++) {
            System.out.println(decorations[i]);
            total += decorations[i].price;
        }

        System.out.println("total price: " + total);
    }
}

