package kz.spring.sis3.task2;

import org.springframework.boot.context.event.SpringApplicationEvent;
import org.springframework.context.ApplicationListener;

public class SpringBuiltInEventsListener implements ApplicationListener<SpringApplicationEvent> {
    @Override
    public void onApplicationEvent(SpringApplicationEvent event) {
        System.out.println("Spring built-in event: " + event.getClass().getSimpleName());
    }
}
