package org.usefullibs.greeter.impl;

import org.junit.jupiter.api.Test;
import org.usefullibs.greeter.Greeter;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HelloWorldTest {
    @Test
    public void testGreet() {
        Greeter greeter = new HelloWorld();
        String actual = greeter.greet();
        String expected = "Hello world!";
        assertEquals(expected, actual);
    }
}
