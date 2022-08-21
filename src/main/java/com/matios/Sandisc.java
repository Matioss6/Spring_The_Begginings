package com.matios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Sandisc")
public class Sandisc extends HDD{

    Sandisc(){
        this.setName("Sandisc");
        this.setCapacity(1024);
    }

    @Override
    public String toString() {
        return "Sandisc{} - " +this.getCapacity();
    }

}
