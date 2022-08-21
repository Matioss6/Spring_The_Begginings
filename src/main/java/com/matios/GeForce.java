package com.matios;



public class GeForce extends GraphicCard{

    GeForce(){
        this.setName("GeForce");
        this.setPower(1024);
    }

    @Override
    public String toString() {
        return "GeForce - " +this.getPower();
    }
}
