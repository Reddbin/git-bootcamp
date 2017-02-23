package com.pieloth;

/**
 * Created by oli on 09.01.2017.
 */
public class PickupTruck extends Cars{
    private double ladeFlaeche;
    private boolean hasAddition;

    public PickupTruck(String name,double ladeFlaeche) {
        super(2.0, 30.0, name, "Pickup", "1234567", true, 80.0, 2, 3, false, 6, 6.0, 12.0,false);
        this.ladeFlaeche = ladeFlaeche;
        this.hasAddition = false;
    }

    public double getLadeFlaeche() {
        return ladeFlaeche;
    }

    public boolean isHasAddition() {
        return hasAddition;
    }
}
