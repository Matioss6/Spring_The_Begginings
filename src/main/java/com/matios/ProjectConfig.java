package com.matios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.matios")
public class ProjectConfig {


    @Bean
    PC pc1(@Qualifier("Sandisc") HDD t){

        PC pc = new PC(t);
        return pc;
    }

    @Bean
    PC pc2(@Qualifier("Toshiba") HDD t){

        PC pc = new PC(t);
        return pc;
    }




}
