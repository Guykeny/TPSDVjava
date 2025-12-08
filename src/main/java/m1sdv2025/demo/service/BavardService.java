package m1sdv2025.demo.service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class BavardService {

    private String nom="Keny";

    String getNom(){
        return " mon nom est "+ nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }
    public String parler(){
        return "Hello from "+this.getClass().getSimpleName() + " le nom est "+ nom;
    }


    @PostConstruct
    private void doSomething() {
        System.out.println("BavardService initialisé ! Le bean est prêt.");
    }
}
