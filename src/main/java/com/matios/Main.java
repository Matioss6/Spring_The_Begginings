package com.matios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context =  new AnnotationConfigApplicationContext(ProjectConfig.class);
        var PC = context.getBean(PC.class);


        PC.printHDD();
        System.out.println(PC.getHdd());



    }


}
