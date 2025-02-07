package kz.spring.sis3.task2;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class UserCreatedListener implements ApplicationListener<UserCreatedEvent> {
    @Override
    public void onApplicationEvent(UserCreatedEvent event) {
        System.out.println("User created: " + event.getName());
    }
}
