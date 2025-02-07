package kz.spring.sis2;

import kz.spring.sis2.task1.Store;
import kz.spring.sis2.task2.NotificationService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Sis2Application {

    public static void main(String[] args) {
        SpringApplication.run(Sis2Application.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            Store store = ctx.getBean(Store.class);
            store.displayItem();
        };
    }

    @Bean
    CommandLineRunner runner(ApplicationContext ctx) {
        return args -> {
            NotificationService notificationService = ctx.getBean(NotificationService.class);
            notificationService.sendNotification();
        };
    }
}
