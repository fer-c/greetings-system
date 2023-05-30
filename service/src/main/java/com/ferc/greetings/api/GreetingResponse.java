package com.ferc.greetings.api;

import com.ferc.greetings.core.Greeting;

public record GreetingResponse(Long greetingId, String greetingMessage) {
    public GreetingResponse(Greeting greeting) {
        this(greeting.id(), greeting.message());
    }
}
