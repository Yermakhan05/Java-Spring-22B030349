package kz.spring.sis2.task1;


import org.springframework.stereotype.Component;

@Component
public class Book implements Item {
    @Override
    public String getName() {
        return "Makhabat kyzyk mol zhyldar (Azilkhan Nurshaiykov)";
    }
}
