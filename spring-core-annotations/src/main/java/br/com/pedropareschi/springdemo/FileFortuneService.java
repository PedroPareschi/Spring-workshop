package br.com.pedropareschi.springdemo;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Component
public class FileFortuneService implements FortuneService{

    private List<String> data = new ArrayList<>();

    private final Random random = new Random();

    @PostConstruct
    public void postConstruct() {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/main/java/br/com/pedropareschi/springdemo/fortune.txt"))){
            String line;
            while ((line = reader.readLine()) != null){
                data.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String getFortune() {
        return data.get(random.nextInt(data.size()));
    }
}
