package br.com.pedropareschi.springdemo;

public class SoccerCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "score some goals";
    }

    @Override
    public String getDailyFortune() {
        return null;
    }
}
