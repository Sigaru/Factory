package org.factory;

public class Lada extends Automobiles {


    public  void moveFront() {
        int i = 1;
        while (i < 10) {
            i++;
            System.out.print("Едет прямо, ");
        }
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }

    @Override
    public void Reverse() {

    }
}
