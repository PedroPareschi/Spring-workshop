package br.com.pedropareschi.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Coach coach = context.getBean("thatSillyCoach", Coach.class);
        System.out.println(coach.getDailyWorkout());
        context.close();
    }
}
