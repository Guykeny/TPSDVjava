package m1sdv2025.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {

    private MessageService messageService;
    @Autowired

    public NotificationService(MessageService messageService) {
        this.messageService = messageService;
    }
    public String  getMessageService() {
        return messageService.getMessage();
    }
    @Autowired
    public void setMessageService(@Qualifier("smsService") MessageService messageService){
        this.messageService = messageService;
    }
}
