package kz.spring.sis3.task2;

import org.springframework.context.ApplicationEvent;

public class UserCreatedEvent extends ApplicationEvent {
    private final String name;

    public UserCreatedEvent(Object source, String name) {
        super(source);
        this.name = name ;
    }

    public String getName() {
        return name;
    }
}

