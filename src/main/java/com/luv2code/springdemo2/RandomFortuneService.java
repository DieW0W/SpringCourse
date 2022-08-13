package com.luv2code.springdemo2;

import org.springframework.stereotype.Component;

import java.util.Random;

// es
@Component
public class RandomFortuneService implements FortuneService {

     // creamos el array de strings
    private String[] data = {
            "Beware of Wolf´s",
             "Diligence of mother",
             "The Journey´s reward"
    };

    // creando un numero al azar
    private Random myrandom = new Random();
    @Override
    public String getFortune() {
        //regresara un numero al azar dependiendo del array
        int index = myrandom.nextInt(data.length);

        return data[index];
    }
}
