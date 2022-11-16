package com.accenture.AbstractExample.Model;

import com.accenture.AbstractExample.Interface.Employee;

public abstract class Military implements Employee {

    private String name;

    public Military(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //is not necessary that have to implemented
    public void sayHello(){
        System.out.println("say hello from military class of super class.");
    }
}
