package org.factory;

import java.util.HashMap;
import java.util.Map;

class MainClass {

    public static void main(String[] args) throws InterruptedException {

        VehiclesFactory factory = new VehiclesFactory();
        /* Создаем таблицу с рейтингом авто по результатам заездов */
        Map<String, Integer> rating = new HashMap<>();

        /* Автомобили прибывают на старт гонки */
        Automobiles ford = factory.getVehicle("ford");
        Automobiles lada = factory.getVehicle("lada");
        Automobiles reno = factory.getVehicle("reno");
        System.out.println("-=Гонки начинаются=-");
        /* Начало заездов */
        rating.put(ford.getBrandName(), ford.moveFront());//первым едет форд и в таблицу записывается его результат
        rating.put(lada.getBrandName(), lada.moveFront());//...
        rating.put(reno.getBrandName(), reno.moveFront());

        System.out.println("-=Результаты заезда=-");
        /* По результатам заезда сортируем таблицу с результатами */
        rating.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        System.out.println("-------------------");
    }
}







