package com.ferc.greetings.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ferc.greetings.core.Greeting;
import com.ferc.greetings.core.GreetingsService;

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
