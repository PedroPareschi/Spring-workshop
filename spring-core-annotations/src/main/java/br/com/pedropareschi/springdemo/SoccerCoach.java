package br.com.pedropareschi.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SoccerCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "score some goals";
    }
}
