package org.factory;

public class Ford extends Automobiles {

    public void moveFront() {
        System.out.print("Едет прямо, ");
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    public void moveLeft() {
        System.out.println("Едет на лево");
    }

    public void moveRight() {
        System.out.print("Едет на право, ");
    }

    public void Reverse() {
        System.out.println("Едет обратно.");
    }
}