package kz.spring.sis2.task3;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
    public String getGreeting() {
        return "Hello World!";
    }
}
