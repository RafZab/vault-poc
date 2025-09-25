package pl.rafzab.sampleservice.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValueController {

    @Value("${custom.secret}")
    private String secretFromVault;

    @Value("${custom.nonsecret}")
    private String configFromConfigServer;

    @GetMapping("/secret")
    public String getSecretFromVault() {
        return secretFromVault;
    }

    @GetMapping("/nonsecret")
    public String getNonsecretFromConfigServer() {
        return configFromConfigServer;
    }
}
