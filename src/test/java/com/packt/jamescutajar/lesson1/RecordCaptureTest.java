package com.packt.jamescutajar.lesson1;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecordCaptureTest {

    @Test
    public void testHasAGreeting() {
        InputStream sin = System.in;
        PrintStream sout = System.out;

        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintStream myPrintStream = new PrintStream(out);
        System.setOut(myPrintStream);

        byte[] buff = "Any Other City\nLife without buildings\n10\nTugboat Records Ltd.\n2000\n".getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buff);
        System.setIn(in);
        RecordCapture.main(new String[0]);

        String output = out.toString();

        System.setOut(sout);
        System.setIn(sin);

        assertNotNull(output, "Output from application should not be null");
        assertTrue(output.contains("Any Other City"), "Output from application should contain a message containing the album name");
        assertTrue(output.contains("Life without buildings"), "Output from application should contain a message containing the artist name");
        assertTrue(output.contains("10"), "Output from application should contain a message containing the total tracks");
        assertTrue(output.contains("Tugboat Records Ltd."), "Output from application should contain a message containing the record label");
        assertTrue(output.contains("2000"), "Output from application should contain a message containing the release year");
    }
}
