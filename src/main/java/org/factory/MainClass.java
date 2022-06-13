package org.factory;

class MainClass {

    public static void main(String[] args) throws InterruptedException {

        VehiclesFactory factory = new VehiclesFactory();


        long m = System.currentTimeMillis();
        Automobiles ford = factory.getVehicle("ford");
        ford.moveFront();
        long v = System.currentTimeMillis() - m;
        System.out.println(v);


        long w = System.currentTimeMillis();
        Automobiles lada = factory.getVehicle("lada");
        lada.moveFront();
        long c = System.currentTimeMillis() - w;
        System.out.println(c);


        long e = System.currentTimeMillis();
        Automobiles reno = factory.getVehicle("reno");
        reno.moveFront();
        long z = System.currentTimeMillis() - e;
        System.out.println(z);

        if (v > c) {
        if (v > z)
            System.out.println("Ford впереди");
        }
        if (c > v) {
        if (c > z)
            System.out.println("Lada впереди");
        }
        if (z > v) {
        if (z > c)
            System.out.println("Reno впереди");
        }
    }
}








