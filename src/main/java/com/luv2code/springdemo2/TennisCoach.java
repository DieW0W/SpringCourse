package com.luv2code.springdemo2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//spring automaticamente identifica que apunta a un bean en especifico
@Component
//@Scope("prototype")
public class TennisCoach implements Coach{

    // se encarga de hacer las conexiones con las clases con la @annotacion @Autowired
    @Autowired
    @Qualifier("randomFortuneService")
    private FortuneService fortuneService;

    /*
     *  constructor injection
     @Autowired
     public TennisCoach(FortuneService theFortuneService) {
         fortuneService = theFortuneService;
     }
     * 
     */
    
    // definimos el constructor por defec🇹o
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
    @PostConstruct
    public void domyStartupStuff() {
        System.out.println(">> TennisCoach: inside startup");
    }
    @PreDestroy
    public void domyCleanUpStuff() {
        System.out.println(">> TenisCoach: inside cleaner ");
    }
    
    
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
