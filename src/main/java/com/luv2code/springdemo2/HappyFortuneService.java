package com.luv2code.springdemo2;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
    
    @Override
    public String getFortune() {
        // TODO Auto-generated method stub
        return "Today is a lucky day";
    }

}
