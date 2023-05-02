package com.ferc.greetingsservice;

import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GreetingsControllerTest {

    private static final Greeting GREETING = new Greeting(10000L, "Hello there!");

    @Mock
    GreetingsService greetingsService;

    @Test
    public void testGreetings() {
        final var controller = new GreetingsController(greetingsService);
        when(greetingsService.sayGreeting()).thenReturn(GREETING);
        var greeting = controller.greetings();
        assertSame(GREETING, greeting);
    }
}
