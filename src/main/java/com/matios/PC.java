package com.matios;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class PC {


    private final HDD hdd;

    @Autowired
    PC (HDD hdd){
        this.hdd = hdd;
    }

    public void printHDD()
    {
        System.out.println(hdd);
    }

    public HDD getHdd() {
        return hdd;
    }


}
