package m1sdv2025.demo;

import m1sdv2025.demo.service.MessageService;
import m1sdv2025.demo.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import m1sdv2025.demo.service.BavardService;

@SpringBootApplication
@RestController
public class DemoApplication {


    private BavardService bavardService;
    private NotificationService notificationService;

    public DemoApplication(BavardService bavardService, NotificationService notificationService) {
        this.bavardService = bavardService;
        this.notificationService = notificationService;
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @GetMapping(path={"hello","Bonjour"})
    public String hello() {
        return "Hello World!";

    }

    @GetMapping("bavard")
    public String bavard() {
        return bavardService.parler();

    }
    @GetMapping("Message")
    public String message(){
        return notificationService.getMessageService();
    }




}
