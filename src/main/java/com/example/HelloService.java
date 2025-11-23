
package com.example;

public class HelloService {
    public String getGreeting(String name) {
        if (name == null || name.isBlank()) {
            name = "World";
        }
        return "Hello from " + name + "!";
    }
}
