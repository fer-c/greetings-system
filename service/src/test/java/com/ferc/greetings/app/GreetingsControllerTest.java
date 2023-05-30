package com.ferc.greetings.app;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ferc.greetings.api.GreetingResponse;
import com.ferc.greetings.core.Greeting;
import com.ferc.greetings.core.GreetingsService;

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
        assertEquals(new GreetingResponse(GREETING), greeting);
    }
}
