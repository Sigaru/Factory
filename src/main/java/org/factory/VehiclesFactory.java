package org.factory;

public class VehiclesFactory {

    public Automobiles getVehicle(String name){

        if("ford".equalsIgnoreCase(name)) {
            return new Ford();
        }

        if("lada".equalsIgnoreCase(name)) {
            return new Lada();
        }

        return null;
    }
}
