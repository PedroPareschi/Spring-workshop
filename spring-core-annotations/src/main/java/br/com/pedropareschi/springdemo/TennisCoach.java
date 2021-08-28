package br.com.pedropareschi.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {


    private FortuneService fortuneService;

    @Value("${foo.email}")
    private String email;

    @Value("${foo.team}")
    private String team;

    public TennisCoach() {
        System.out.println(">> inside default constructor");
    }

    @Autowired
    public TennisCoach(@Qualifier("fileFortuneService") FortuneService fortuneService) {
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
