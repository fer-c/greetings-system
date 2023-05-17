package com.ferc.greetings.core;

import org.springframework.stereotype.Service;

@Service
public class DefaultGreetingsService implements GreetingsService {

    private static final long DEFAULT_ID = 1L;

    @Override
    public Greeting sayGreeting() {
        return new Greeting(generateId(), "Hello %s!".formatted("there"));
    }

    private Long generateId() {
        return DEFAULT_ID;
    }
}
