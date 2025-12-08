package m1sdv2025.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "message pour les dev";
    }
}
