package com.pieloth;

/**
 * Created by oli on 09.01.2017.
 */
public class Vehicles {
    //TODO clean up Fields and Constructor
    private double size;
    private double weight;
    private String name;
    private String model;
    private String serialNumber;
    private boolean tuefCertificate;
    private double maxSpeed;
    private int doors;
    private int windows;


    public Vehicles(double size, double weight, String name, String model, String serialNumber, boolean tuefCertificate, double maxSpeed,int doors, int windows) {
        this.size = size;
        this.weight = weight;
        this.name = name;
        this.model = model;
        this.serialNumber = serialNumber;
        this.tuefCertificate = tuefCertificate;
        this.maxSpeed = maxSpeed;
        this.doors = doors;
        this.windows = windows;

    }

    public void move(){
        System.out.println("Vehicle is moving");
    }

    public void move(double speed, String direction){
        System.out.println("Vehicle is moving " +direction + " with a speed of " + speed);
    }

    public double getSize() {
        return size;
    }

    public double getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public boolean isTuefCertificate() {
        return tuefCertificate;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

}
