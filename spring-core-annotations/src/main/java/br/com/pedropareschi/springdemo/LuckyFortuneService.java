package br.com.pedropareschi.springdemo;

public class LuckyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "7 years of luck";
    }
}
