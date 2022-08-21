package com.matios;

import com.matios.HDD.HDD;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.matios")
public class ProjectConfig {

    @Bean
    @Qualifier("Radeon")
    public Radeon radeon()
    {
        var r = new Radeon();
        return r;
    }

    @Bean
    @Qualifier("GeForcec")
    public GeForce geForce()
    {
        var r = new GeForce();
        return r;
    }



    @Bean
    public PC pc1(@Qualifier("Sandisc") HDD h, @Qualifier("Radeon") GraphicCard g){

        PC pc = new PC(h,g);
        return pc;
    }

    @Bean
    public PC pc2(@Qualifier("Toshiba") HDD h, @Qualifier("GeForcec") GraphicCard g){

        PC pc = new PC(h,g);
        return pc;
    }







}
