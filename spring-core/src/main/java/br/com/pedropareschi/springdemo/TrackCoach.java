package br.com.pedropareschi.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class TrackCoach implements Coach, DisposableBean {
    private FortuneService fortuneService;

    public TrackCoach() {
    }

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return "Just Do It:" + fortuneService.getFortune();
    }

    public void doMyStartupStuff(){
        System.out.println("TrackCoach: inside method doMyStartupStuff");
    }

    public void doMyCleanupStuff(){
        System.out.println("TrackCoach: inside method doMyCleanupStuff");

    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TrackCoach: inside method destroy");
    }
}
