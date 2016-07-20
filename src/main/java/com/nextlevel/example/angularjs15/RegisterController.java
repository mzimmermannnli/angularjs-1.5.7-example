package com.nextlevel.example.angularjs15;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {
	
    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
