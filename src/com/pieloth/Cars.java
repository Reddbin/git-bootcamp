package com.pieloth;

/**
 * Created by oli on 09.01.2017.
 */
public class Cars extends Vehicles {
    private int wheels;
    private double currentSpeed;
    private int currentGear;
    private String direction;
    private double accelerationSpeedMax;
    private double brakeSpeedMax;
    private boolean isAutomatic;

    public Cars(double size, double weight, String name, String model, String serialNumber, boolean tuefCertificate, double maxSpeed, int doors, int windows, boolean isAutomatic, int wheels, double accelerationSpeedMax, double brakeSpeedMax, boolean isAutomatic1) {
        super(size, weight, name, model, serialNumber, tuefCertificate, maxSpeed, doors, windows);
        this.wheels = wheels;
        this.accelerationSpeedMax = accelerationSpeedMax;
        this.brakeSpeedMax = brakeSpeedMax;
        this.direction = "forward";
        this.currentSpeed =0.0;
        this.currentGear = 0;
    }

    public Cars(double size, double weight, String name, double maxSpeed, int doors, int windows, int wheels, double accelerationSpeedMax, double brakeSpeedMax, boolean isAutomatic) {
        super(size, weight, name, "default", "12345678", true, maxSpeed, doors, windows);
        this.wheels = wheels;
        this.accelerationSpeedMax = accelerationSpeedMax;
        this.brakeSpeedMax = brakeSpeedMax;
        this.isAutomatic = isAutomatic;
    }

    public void steering(int direction){
        if(direction == 0){
            this.direction = "forward";
        }
        else if(direction < 0){
            this.direction = "left";
        }
        else {
            this.direction = "right";
        }
    }

    public void changeGears(int change){
        this.currentGear += change;
    }

    public void accelerate(double accelerationSpeed){
        this.accelerate(accelerationSpeed,10);
    }

    public void accelerate(double accelerationSpeed,int time){

        for(int i=0;i<time;i++){
            if(accelerationSpeed <0){
                System.out.println("no negative acceleration please");
                break;
            }
            this.currentSpeed += this.currentGear * accelerationSpeed;
            if(this.currentSpeed >= this.getMaxSpeed()){
                System.out.println("Car reached max Speed");
                this.currentSpeed = this.getMaxSpeed();
                break;
            }
        }
    }

    public void brake(double brakeSpeed){
        this.accelerate(brakeSpeed,10);
    }

    public void brake(double brakeSpeed,int time){
        for(int i=0;i<time;i++){
            if(brakeSpeed <0){
                System.out.println("no negative acceleration please");
                break;
            }
            this.currentSpeed -=  brakeSpeed;
            if(this.currentSpeed <= 0.0){
                System.out.println("Car stopped moving");
                this.currentSpeed = 0.0;
                break;
            }
        }
    }

    @Override
    public void move() {
        super.move(currentSpeed, direction);
    }

    public int getWheels() {
        return wheels;
    }

    public double getAccelerationSpeedMax() {
        return accelerationSpeedMax;
    }

    public double getBrakeSpeedMax() {
        return brakeSpeedMax;
    }
}
