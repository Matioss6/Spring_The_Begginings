package com.matios;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Toshiba")
@Primary
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
