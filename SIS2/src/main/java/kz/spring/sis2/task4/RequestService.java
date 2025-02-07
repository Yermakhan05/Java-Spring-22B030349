package kz.spring.sis2.task4;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import org.springframework.web.context.WebApplicationContext;

import java.time.LocalTime;

@Service
@Scope(value = WebApplicationContext.SCOPE_REQUEST, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class RequestService {
    private final String createdAt = LocalTime.now().toString();

    public String getCreatedAt() {
        return "Request Bean created at " + createdAt;
    }
}
