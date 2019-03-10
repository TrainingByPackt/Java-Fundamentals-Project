package com.packt.jamescutajar.lesson1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SayHelloTest {

    @Test
    public void testHasAGreeting() {
        SayHello sayHello = new SayHello();
        InputStream sin = System.in;
        PrintStream sout = System.out;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream myPrintStream = new PrintStream(out);
        System.setOut(myPrintStream);

        byte[] buff = "James".getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buff);
        System.setIn(in);
        SayHello.main(new String[0]);
        String output = out.toString();

        System.setOut(sout);
        System.setIn(sin);

        assertNotNull(output, "Output from application should not be null");
        assertTrue(output.toLowerCase().contains("enter"), "Output from application should contain a message asking to enter for name, for example \"Enter your name, please\"");
        assertTrue(output.toLowerCase().contains("name"), "Output from application should contain a message asking to enter for name, for example \"Enter your name, please\"");
        assertTrue(output.toLowerCase().contains("hello"), "Greeting should contain Hello, for example \"Hello James!\"");
        assertTrue(output.contains("James"), "Greeting should contain input name, for example \"Hello James!\"");
        assertTrue(output.contains("5"), "Output from application should contain the name length, for example \"Your name is 5 characters long\"");
    }
}
