package com.accenture.AbstractExample.Model;

public class General extends Military{

    public General(String name){
        super(name);
    }

    @Override
    public void doJob() {
        System.out.println("The job of the General " + this.getName() + " is to give strategies.");
    }
}
