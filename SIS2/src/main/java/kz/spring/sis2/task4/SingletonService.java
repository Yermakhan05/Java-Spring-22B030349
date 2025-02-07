package kz.spring.sis2.task4;

import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class SingletonService {
    private final String createdAt = LocalTime.now().toString();

    public String getCreatedAt() {
        return "Singleton Bean created at " + createdAt;
    }
}
