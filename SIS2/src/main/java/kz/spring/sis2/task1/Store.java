package kz.spring.sis2.task1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Store {
    private final Item item;

    @Autowired
    public Store(Item item) {
        this.item = item;
    }

    public void displayItem() {
        System.out.println("Task 1: " + item.getName());
    }

}
