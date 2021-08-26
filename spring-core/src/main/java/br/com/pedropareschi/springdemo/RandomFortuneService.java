package br.com.pedropareschi.springdemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RandomFortuneService implements FortuneService{

    private String[] fortunes = new String[]{"bad", "neutral", "good"};

    @Override
    public String getFortune() {
        return "Today is a " + fortunes[new Random().nextInt(fortunes.length)] + " day!";
    }
}
