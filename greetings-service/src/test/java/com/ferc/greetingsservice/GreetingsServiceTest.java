package com.ferc.greetingsservice;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.Test;

public class GreetingsServiceTest {
    @Test
    void testSayGreeting() {

        final var service = spy(new GreetingsService());
        final var result = service.sayGreeting();
        assertEquals(new Greeting(1L, "Hello there!"), result);
    }
}
