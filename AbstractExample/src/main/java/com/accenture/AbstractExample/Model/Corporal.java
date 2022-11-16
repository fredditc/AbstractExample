package com.accenture.AbstractExample.Model;


public class Corporal extends Military{

    public Corporal(String name){
        super(name);
    }

    @Override
    public void doJob() {
        System.out.println("Corporal " + this.getName() + "'s job is to act as a liaison between recruits and soldiers.");
    }
}

