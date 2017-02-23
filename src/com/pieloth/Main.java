package com.pieloth;

public class Main {

    public static void main(String[] args) {
        Cars someCar = new Cars(2.0,12.0, "Henrietta",250.0,4,6,4,10.0,8.0,false);
        someCar.changeGears(1);
        someCar.accelerate(5.0);
        someCar.steering(-1);
        someCar.move();
    }
}
