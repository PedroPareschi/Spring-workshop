package br.com.pedropareschi.springdemo;

public class HappyFortuneService implements FortuneService{

    @Override
    public String getFortune() {
        return "Today is your luck day!";
    }
}
