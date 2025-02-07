package kz.spring.sis3.task2;

import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class Publisher {
    private final ApplicationEventPublisher publisher;

    public Publisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void publish(final String name) {
        publisher.publishEvent(new UserCreatedEvent(this, name));
        publisher.publishEvent(new UserRemovedEvent(name));
    }
}
