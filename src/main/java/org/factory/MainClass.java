package org.factory;

class MainClass {

    public static void main(String[] args) {
        VehiclesFactory factory = new VehiclesFactory();

        Automobiles ford = factory.getVehicle("ford");
        ford.moveFront();
        ford.moveLeft();
        ford.moveRight();
        ford.Reverse();
        System.out.println("__________________________________________");

        Automobiles lada = factory.getVehicle("lada");
        lada.moveFront();

    }
}







