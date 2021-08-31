package br.com.pedropareschi.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PracticeApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BoxingConfig.class);
        Coach coach = context.getBean("boxingCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        System.out.println(coach.getDailyFortune());
        context.close();
    }
}
