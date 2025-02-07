package kz.spring.sis2.task4;

import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.time.LocalTime;

@Service
@SessionScope
public class SessionService {
    private final String createdAt = LocalTime.now().toString();

    public String getCreatedAt() {
        return "Session Bean created at " + createdAt;
    }
}
