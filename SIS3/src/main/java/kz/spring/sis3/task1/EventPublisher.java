package kz.spring.sis3.task1;


import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class EventPublisher {
    private final ApplicationEventPublisher publisher;

    public EventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publishEvent(String message) {
        System.out.println("Event published: " + message);
        publisher.publishEvent(new CustomEvent(this, message));
    }
}
