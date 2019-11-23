package com.company.soldiers;

import com.company.Soldiers;

public class Sniper extends Soldiers {
    private int impactForce= 50;

    public Sniper(int health, int speed, int amorlevel, int impactForce) {
        super(health, speed, amorlevel);
        this.impactForce = impactForce;


}

    }
