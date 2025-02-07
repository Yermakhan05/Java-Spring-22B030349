package kz.spring.sis3.task2;

public class UserRemovedEvent {
    private final String name;

    UserRemovedEvent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
