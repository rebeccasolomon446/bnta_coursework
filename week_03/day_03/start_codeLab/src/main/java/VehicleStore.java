import products.Product;
import vehicles.*;
import vehicles.air.Helicopter;
import vehicles.land.Bicycle;
import vehicles.land.Car;
import vehicles.land.Motor;
import vehicles.land.water.Kayak;
import vehicles.land.water.SpeedBoat;

import java.util.ArrayList;
import java.util.List;

public class VehicleStore {
    private static List<IVehicle> vehicles;

    public static void main(String[] args) {
        vehicles = new ArrayList<>();
        // create a bike using composition, and call methods from its components
        Bicycle bike1 = new Bicycle(10, 20, new Product("BMX", 350, 6));
        vehicles.add(bike1);

        System.out.println(bike1.getWheelCount());
        System.out.println(bike1.getTitle());
        System.out.println(bike1.getInventory());

        // create a car using composition, and call methods from its multiple components
        Car car1 = new Car(200, 120, new Product("2015 Dacia Duster", 10000, 3),
        new Engine(100, 150));
        vehicles.add(car1);

        car1.startEngine();
        System.out.println(car1.getFuel());
        System.out.println(car1.getPrice());

        // lab tests (water vehicle related)...
        Kayak kayak1 = new Kayak(400,200, new Product("kayakone", 10000, 3));
        vehicles.add(kayak1);

        System.out.println(kayak1.getHullType());

        SpeedBoat speedboat1 = new SpeedBoat(300, 100, new Product("speedboatone", 20000, 12), new Motor(123, 222));
        vehicles.add(speedboat1);

        System.out.println(speedboat1.getHp());

        Helicopter helicopter1 = new Helicopter(234,456, new Product("HELICOPTERHELICOPTER",778899, 56),
                new Engine(22, 87));
        vehicles.add(helicopter1);
        helicopter1.startEngine();
        System.out.println(helicopter1.getMaxCapacity());



    }
}
