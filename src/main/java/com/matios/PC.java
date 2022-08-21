package com.matios;


import com.matios.HDD.HDD;

public class PC {


    private final HDD hdd;
    private final GraphicCard graphicCard;

    PC (HDD hdd, GraphicCard graphicCard){
        this.hdd = hdd;
        this.graphicCard = graphicCard;
    }


    @Override
    public String toString() {
        return "This PC contains " +
                "{  hdd=" + hdd +" }  AND " + "  { GraphicCard=" +
                graphicCard +" }";
    }
}
