package com.ferc.greetings.app;

import com.ferc.greetings.api.GreetingRequest;
import com.ferc.greetings.api.GreetingResponse;
import com.ferc.greetings.core.GreetingsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/greetings")
public class GreetingsController {

    private final GreetingsService greetingsService;

    @GetMapping("/")
    public GreetingResponse greetings() {
        return new GreetingResponse(greetingsService.sayGreeting());
    }

    @PostMapping
    public GreetingResponse create(@RequestBody GreetingRequest request) {
        return new GreetingResponse(0L, request.message());
    }
}
