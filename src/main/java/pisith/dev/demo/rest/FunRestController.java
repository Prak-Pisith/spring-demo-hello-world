package pisith.dev.demo.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FunRestController {

    // Inject properties (application.properties) via @Value
    @Value("${user.name}")
    private String username;
    @Value("${user.password}")
    private String password;

    // hello word
    @GetMapping("/")
    public String sayHello() {
        return "Hello World";
    }

    @GetMapping("/user-info")
    public String getUserInfo() {
        return "Username: " + username + " with Password: " + password;
    }
}
