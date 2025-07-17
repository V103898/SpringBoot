package ru.netology.sringboots;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootsApplication.class, args);
    }
    @GetMapping("/")
    private String hello (){
        return "hello Volgograd";

    }
}

