package kz.spring.sis3;

import kz.spring.sis3.task2.SpringBuiltInEventsListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class Sis3Application {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(Sis3Application.class);
        springApplication.addListeners(new SpringBuiltInEventsListener());
        springApplication.run(args);
    }

}
