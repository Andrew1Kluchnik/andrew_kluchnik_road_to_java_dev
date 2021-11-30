package com.andrew.strings;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {


    private final StringUtils stringUtils = new StringUtilsImpl();

    @Test
    public void charCount() {
        assertEquals(2, stringUtils.charCount("abca", 'a'));
        assertEquals(-1, stringUtils.charCount("abc2", '1'));
        assertEquals(-1, stringUtils.charCount("", 'a'));
        assertEquals(-1, stringUtils.charCount("a", 'a'));
    }

    @Test
    public void reverse() {
        assertEquals("", stringUtils.reverse(""));
        assertEquals("bbb", stringUtils.reverse("bbb"));
        assertEquals("rfdcB", stringUtils.reverse("Bcdfr"));
    }

    @Test
    public void alphabet() {
        String expected = "aBcDeFgHiJkLmNoPqRsTuVwXyZ";

        assertEquals(expected, stringUtils.alphabet().toString());
    }

    @Test
    public void toCamelCase() {
        assertEquals("MyNameIsRadik", stringUtils.toCamelCase("my name Is RADIK"));
        assertEquals("WhatAreYouDoing?", stringUtils.toCamelCase("what,   are, you doing?"));
        assertEquals("", stringUtils.toCamelCase(null));
        assertEquals("", stringUtils.toCamelCase(""));
    }

    @Test
    public void fromCamelCase() {
        assertEquals("camel case text", stringUtils.fromCamelCase("camelCaseText"));
        assertEquals("Up and down", stringUtils.fromCamelCase("UpAndDown"));
        assertEquals("", stringUtils.fromCamelCase(null));
        assertEquals("", stringUtils.fromCamelCase(""));
    }

    @Test
    public void trim() {
        assertEquals("Андрей топ джавист !",stringUtils.trim(" Андрей   топ джавист  ! "));
    }
}