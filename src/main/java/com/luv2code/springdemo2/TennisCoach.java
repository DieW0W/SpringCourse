package com.luv2code.springdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//spring automaticamente identifica que apunta a un bean en especifico
@Component
public class TennisCoach implements Coach{

    @Autowired
    private FortuneService fortuneService;

    /*
     *  constructor injection
     @Autowired
     public TennisCoach(FortuneService theFortuneService) {
         fortuneService = theFortuneService;
     }
     * 
     */
    
    // definimos el constructor por defec🇹🇬 
    public TennisCoach() {
        System.out.println(">> tennisCoach default Constructor");
    } 

    
    /*
     * setter injection
     @Autowired
     public void setFortuneService(FortuneService theFortuneService) {
         System.out.println("tennisCoach default Setter method");
         fortuneService = theFortuneService;
     }
     */
    
    
    @Override
    public String getDailyWorkout() {
        // TODO Auto-generated method STUB
        return "Practice yout backhand ball";
    }

    @Override
    public String getDailyFortune() {
        // TODO Auto-generated method stub
        return fortuneService.getFortune();
    }
}
