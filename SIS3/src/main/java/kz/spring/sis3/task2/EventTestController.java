package kz.spring.sis3.task2;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventTestController {
    private final Publisher publisher;

    public EventTestController(Publisher publisher) {
        this.publisher = publisher;
    }

    @GetMapping("/test-event")
    public String testEvent(@RequestParam String name) {
        publisher.publish(name);
        return "Event published for user: " + name;
    }
}
