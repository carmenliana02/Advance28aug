package Advance28aug;

import Exercitii.Bike;
import Exercitii.Car;
import Exercitii.Truck;
import Exercitii.Vehicle;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
animal.eat();
Cat cat = new Cat();
cat.makeSoud();

        Car car = new Car();
        System.out.println(car.getIdentity());
        Vehicle truck = new Truck();
        System.out.println(truck.getIdentity());
        Vehicle bike = new Bike();
        System.out.println(bike.getIdentity("MountainBike"));

        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=bike;
        vehicles[1]=car;
        vehicles[2]=truck;

        for (Vehicle vehicle : vehicles ){
            System.out.println(vehicle.getIdentity());
        }
    }
}
