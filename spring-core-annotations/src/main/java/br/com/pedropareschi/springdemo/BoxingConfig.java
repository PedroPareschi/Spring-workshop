package br.com.pedropareschi.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoxingConfig {

    @Bean
    public FortuneService luckyFortuneService(){
        return new LuckyFortuneService();
    }

    @Bean
    public BoxingCoach boxingCoach(){
        return new BoxingCoach(luckyFortuneService());
    }
}
