package br.com.pedropareschi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{


    private FortuneService fortuneService;

    public TennisCoach() {
        System.out.println(">> inside default constructor");
    }

    @Autowired
    public TennisCoach(@Qualifier("randomFortuneService") FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }


//    @Autowired
//    public void doSomeCrazyStuff(FortuneService fortuneService) {
//        System.out.println(">> inside doSomeCrazyStuff() method");
//        this.fortuneService = fortuneService;
//    }

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
