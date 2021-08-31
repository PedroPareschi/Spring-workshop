package br.com.pedropareschi.springdemo;

public class BoxingCoach implements Coach{

    private FortuneService fortuneService;

    public BoxingCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "punch people";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
