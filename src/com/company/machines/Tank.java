package com.company.machines;

import com.company.Transport;

public class Tank extends Transport {
    private int impactForce= 300;

    public Tank(int fuelVolume, int maxSpeed, int amorlevel, int impactForce) {
        super(fuelVolume, maxSpeed, amorlevel);
        this.impactForce = impactForce;
    }
}
