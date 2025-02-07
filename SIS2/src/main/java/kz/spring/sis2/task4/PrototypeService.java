package kz.spring.sis2.task4;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
@Scope("prototype")
public class PrototypeService {
    private final String createdAt = LocalTime.now().toString();

    public String getCreatedAt() {
        return "Prototype Bean created at " + createdAt;
    }
}
