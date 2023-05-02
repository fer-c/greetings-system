package com.ferc.greetingsservice;

import org.springframework.stereotype.Service;

@Service
public class GreetingsService {

    private static final long DEFAULT_ID = 1L;

    public Greeting sayGreeting() {
        return new Greeting(generateId(), "Hello %s!".formatted("there"));
    }

    private Long generateId() {
        return DEFAULT_ID;
    }
}
