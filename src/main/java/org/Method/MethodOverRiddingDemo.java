package org.Method;

public class MethodOverRiddingDemo {
    public static void main(String args[]){
        Vehicle vehicle = new Vehicle();
        System.out.println(vehicle.func());

        Bike bike = new Bike();
        System.out.println(bike.func());

        Car car = new Car();
        System.out.println(car.func());




    }

}
