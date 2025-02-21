package com.example.jenkinsdemo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JenkinsDemoApplicationTests {

    @Test
    public void testHelloMessage() {
        String message = "Hello from Jenkins Deployed App!";
        assertEquals("Hello from Jenkins Deployed App!", message);
    }
}
