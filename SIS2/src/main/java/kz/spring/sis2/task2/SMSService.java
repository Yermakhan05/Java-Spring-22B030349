package kz.spring.sis2.task2;

import org.springframework.stereotype.Service;

@Service
public class SMSService implements MessageService {
    @Override
    public String getMessage() {
        return "SMS sent successfully!";
    }
}
