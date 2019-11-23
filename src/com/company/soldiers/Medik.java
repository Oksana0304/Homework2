package com.company.soldiers;

import com.company.Soldiers;

public class Medik extends Soldiers {
private int treatment =50;

    public Medik(int health, int speed, int amorlevel, int treatment) {
        super(health, speed, amorlevel);
        this.treatment = treatment;
    }
}
