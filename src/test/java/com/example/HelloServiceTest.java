
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HelloServiceTest {
    @Test
    void greetingDefaultsToWorld() {
        HelloService svc = new HelloService();
        assertEquals("Hello from World!", svc.getGreeting(""));
    }

    @Test
    void greetingIncludesName() {
        HelloService svc = new HelloService();
        assertEquals("Hello from Hackathon!", svc.getGreeting("Hackathon"));
    }
}
