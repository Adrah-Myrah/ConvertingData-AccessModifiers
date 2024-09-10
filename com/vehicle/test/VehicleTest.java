package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
    public static void main (String[]args){
        Car car1 = new Car();
        car1.setSpeed(90.0);
        car1.setFuelLevel(80.0f);
        car1.drive(10000000);
        car1.drive(car1.getDistanceKm());

        ElectricCar electric1 =new ElectricCar();
        electric1.setSpeed(95.0);
        electric1.setBatteryLevel(85);
        electric1.drive(800000);

        System.out.println("Speed:"+ car1.getSpeedMph() );
        System.out.println("Distance in Km:"+ car1.getDistanceKm() );
        System.out.println("Remaining Fuel:"+ car1.calculateRemainingFuel(car1.getDistanceKm()) );

        System.out.println("The battery level after driving is:" + electric1.getBatteryLevel());


    }

}
