package com.company;

import com.company.machines.Tank;
import com.company.machines.Vehicle;
import com.company.soldiers.Medik;
import com.company.soldiers.Sniper;

public class Main {

    public static void main(String[] args) {

       Medik medik = new Medik(100, 50, 30, 50);
        Sniper sniper = new Sniper( 100, 75, 60, 50);

    Tank tank = new Tank( 1200, 90, 200, 300);
    Vehicle vehicle = new Vehicle(150, 180, 140);



    }
}