package org.factory;

public class Ford extends Automobiles {

    public static void moveFront() {
        System.out.print("Едет прямо, ");
    }

    public static void moveLeft() {
        System.out.println("Едет на лево");
    }

    public static void moveRight() {
        System.out.print("Едет на право, ");
    }

    public static void Reverse() {
        System.out.println("Едет обратно.");
    }
}