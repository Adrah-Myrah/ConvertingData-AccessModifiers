package com.vehicle;

public class Car {
    private double speedKph;
    private float fuelLevel;
    private int distanceTraveled;

//setting values of a private instance use setter method

    public void setSpeed(double speed){
        this.speedKph=speed;
    }

    public void setFuelLevel(float fuel){
        this.fuelLevel=fuel;

    }

    public void drive(int distance){
        this.distanceTraveled=distance;
    }

    public double getSpeedMph(){
        return (speedKph/1.60934);
    }

    public int getDistanceKm(){
        return (distanceTraveled/1000);
    }


    public int calculateRemainingFuel(double distance){
        double fuelUsed = (distance / 1000) * 0.5/100;
        return (int) Math.max((fuelLevel - fuelUsed),0);
    //double double_getDistanceKm = (double) distance; //int to double
    //double one_mile;

    /*if(distance==1)
    {
        one_mile = 0.5/100 * this.fuelLevel;
    }
    else
    {
        one_mile = ((0.5/100)*distance) * this.fuelLevel;
    }
        return (int)one_mile;*/
    }

}
