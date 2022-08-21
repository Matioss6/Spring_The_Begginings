package com.matios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {

        var context =  new AnnotationConfigApplicationContext(ProjectConfig.class);
        var PC1 = context.getBean("pc1",PC.class);
        var PC2 = context.getBean("pc2",PC.class);


        System.out.println(PC1);
        System.out.println(PC2);



    }


}
