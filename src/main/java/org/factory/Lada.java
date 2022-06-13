package org.factory;

public class Lada extends Automobiles {


    public static void moveFront() {
        int i = 1;
        while (i < 10) {
            i++;
            System.out.print("Едет прямо, ");
        }
    }
}
