package com.accenture.AbstractExample.Model;

public class Soldier extends Military{

    public Soldier(String name){
        super(name);
    }

    @Override
    public void doJob() {
        System.out.println("Soldier " + this.getName() + "'s work is on the battlefield.");
    }
}
