package com.ferc.greetingsservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class GreetingsController {

    GreetingsService greetingsService;

    @GetMapping("/greetings/")
    public Greeting greetings() {
        return greetingsService.sayGreeting();
    }
}
