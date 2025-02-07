package kz.spring.sis3.task2;

import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncListener {
    @Async
    @EventListener
    public void handleEvent(String event) {
        System.out.println("Async event processed: " + event);
    }
}
