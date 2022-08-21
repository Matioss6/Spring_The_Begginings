package com.matios;


public class Radeon extends GraphicCard{

    Radeon(){
        this.setName("Radeon");
        this.setPower(1024);
    }

    @Override
    public String toString() {
        return "Radeon - " +this.getPower();
    }
}
