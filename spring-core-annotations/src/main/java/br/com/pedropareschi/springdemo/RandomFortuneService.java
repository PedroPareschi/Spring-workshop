package br.com.pedropareschi.springdemo;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService{

    private final String[] data = {
            "Beware of the wolf in the sheep's clothing",
            "Diligence is the mother of good luck",
            "The journey is the reward"
    };

    private final Random random = new Random();

    @Override
    public String getFortune() {
        int index = random.nextInt(data.length);
        return data[index];
    }
}
