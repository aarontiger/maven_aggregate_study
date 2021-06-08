package cn.e3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Gat1400ServiceApp {
    public static void main(String[] args) {
        SpringApplication.run(Gat1400ServiceApp.class, args);
    }
}
