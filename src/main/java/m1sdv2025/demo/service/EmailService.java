package m1sdv2025.demo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("email")
public class EmailService implements MessageService {

    @Override
    public String getMessage() {
        return "Message Envoyé par Mail";
    }

}
