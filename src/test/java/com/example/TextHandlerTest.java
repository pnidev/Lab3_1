package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class TextHandlerTest {
    @Test
    public void testFormatText() {
        TextHandler handler = new TextHandler();
        assertEquals("hello", handler.formatText("  Hello  "));
        assertEquals("None", handler.formatText(null));
    }

    @Test
    public void testCountLetters() {
        TextHandler handler = new TextHandler();
        assertEquals(5, handler.countLetters("hello!"));
        assertEquals(-1, handler.countLetters(null));
    }
}