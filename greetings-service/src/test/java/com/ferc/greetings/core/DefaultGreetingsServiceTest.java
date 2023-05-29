package com.ferc.greetings.core;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.Test;

public class DefaultGreetingsServiceTest {
    @Test
    void testSayGreeting() {

        final GreetingsService service = spy(new DefaultGreetingsService());
        final var result = service.sayGreeting();
        assertEquals(new Greeting(1L, "Hello there you!"), result);
    }
}
