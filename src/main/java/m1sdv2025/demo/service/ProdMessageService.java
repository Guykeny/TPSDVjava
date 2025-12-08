package m1sdv2025.demo.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Pour la production";
    }
}
