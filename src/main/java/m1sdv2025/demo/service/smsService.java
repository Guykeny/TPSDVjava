package m1sdv2025.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("sms")
public class smsService implements MessageService {
    @Override
    public String getMessage() {
        return "Message par SMS";
    }
}
