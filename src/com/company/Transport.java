package com.company;

public abstract class Transport {
    private int fuelVolume;
    private int maxSpeed;
    private int amorlevel;

    public Transport ( int fuelVolume, int maxSpeed, int amorlevel){

        this.fuelVolume= fuelVolume;
        this.maxSpeed= maxSpeed;
        this.amorlevel= amorlevel;

    }

}
