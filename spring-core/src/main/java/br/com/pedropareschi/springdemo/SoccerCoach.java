package br.com.pedropareschi.springdemo;

import org.springframework.beans.factory.DisposableBean;

public class SoccerCoach implements Coach, DisposableBean {
    @Override
    public String getDailyWorkout() {
        return "score some goals";
    }

    @Override
    public String getDailyFortune() {
        return "Lucky day";
    }

    public void doWarmUp(){
        System.out.println("do warm up");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("do stretching");
    }
}
