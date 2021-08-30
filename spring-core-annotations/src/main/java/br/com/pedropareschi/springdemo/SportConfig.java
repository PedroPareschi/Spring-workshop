package br.com.pedropareschi.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("br.com.pedropareschi.springdemo")
public class SportConfig {

    @Bean
    public FortuneService sadFortuneService(){
        return new SadFortuneService();
    }

    @Bean
    public SwimCoach swimCoach(){
        return new SwimCoach(sadFortuneService());
    }
}
