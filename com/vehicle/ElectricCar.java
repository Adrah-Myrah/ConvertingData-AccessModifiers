package com.vehicle;

 public class ElectricCar extends Car {
    private double batteryLevel;

    public void setBatteryLevel(double battery){
       this.batteryLevel=battery;
    }

    public double getBatteryLevel(){
        return batteryLevel;
    }

    @Override
    public void drive(int distance) {
        super.drive(distance);
        double drivenKm = distance / 1000.0;
        batteryLevel = Math.max(batteryLevel - (drivenKm*10),0);
        }

}
