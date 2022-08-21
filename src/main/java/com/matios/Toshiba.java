package com.matios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Toshiba")
public class Toshiba extends HDD{

    Toshiba(){
        this.setName("Toshiba");
        this.setCapacity(512);
    }

    @Override
    public String toString() {
        return "Toshiba{} - " +this.getCapacity();
    }
}
