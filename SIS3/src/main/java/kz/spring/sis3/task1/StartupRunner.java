package kz.spring.sis3.task1;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartupRunner implements CommandLineRunner {
    private final EventPublisher publisher;

    public StartupRunner(EventPublisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public void run(String... args) throws Exception {
        publisher.publishEvent("Hello from Spring Events!");
    }
}
