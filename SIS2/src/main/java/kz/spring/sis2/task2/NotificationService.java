package kz.spring.sis2.task2;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final MessageService messageService;

    public NotificationService(@Qualifier("emailService") MessageService messageService) {
        this.messageService = messageService;
    }

    public void sendNotification() {
        System.out.println("Task 2: " + messageService.getMessage());
    }
}
