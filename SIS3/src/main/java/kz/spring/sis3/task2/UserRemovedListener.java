package kz.spring.sis3.task2;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class UserRemovedListener {

    @EventListener
    ReturnedEvent handleUserRemovedEvent(UserRemovedEvent event) {
        System.out.println("User removed: " + event.getName());
        return new ReturnedEvent();
    }

    @EventListener
    void handleReturnedEvent(ReturnedEvent event) {
        System.out.println("ReturnedEvent processed");
    }

    @EventListener(condition = "#event.name == 'reflectoring'")
    void handleConditionalListener(UserRemovedEvent event) {
        System.out.println("Conditional UserRemovedEvent handled: " + event.getName());
    }
}
