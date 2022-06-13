package org.factory;

class MainClass {

    public static void main(String[] args) throws InterruptedException {

        VehiclesFactory factory = new VehiclesFactory();



        Automobiles ford = factory.getVehicle("ford");
        ford.moveFront();



        Automobiles lada = factory.getVehicle("lada");
        lada.moveFront();



        Automobiles reno = factory.getVehicle("reno");
        reno.moveFront();


    }
}







