package org.factory;

class MainClass {

    public static void main(String[] args) {

        Ford ford = new Ford();
        ford.moveFront();
        ford.moveLeft();
        ford.moveRight();
        ford.Reverse();
        System.out.println("__________________________________________");
        Lada lada = new Lada();
        lada.moveFront();

    }
}







