package com.andrew.types;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class TypeUtilsTest {

    private final TypeUtils typeUtils = new TypeUtilsImpl();

    @Test
    public void sort() {
        int[] arr = getArrayFrom(11, 10, 6, 7, 2, 4, 0, -2, 1, 5, 1);
        int[] clone = cloneArr(arr);

        int[] sortedArr = typeUtils.sort(arr);

        // make sure original array not changed
        assertArrayEquals(arr, clone);

        int[] expArr = getArrayFrom(-2, 0, 1, 1, 2, 4, 5, 6, 7, 10, 11);
        assertArrayEquals(expArr, sortedArr);
    }

    @Test
    public void arithmeticMean() {
        int[] arr = getArrayFrom(2, 0, -2, 4, 7, 1);

        float arithmeticMean = typeUtils.arithmeticMean(arr);

        assertEquals(2, (int) arithmeticMean);
    }

    @Test
    public void max() {
        int[] arr = getArrayFrom(2, 3, -2, 5, 6);

        float max = typeUtils.max(arr);

        assertEquals(6, (int) max);
    }

    @Test
    public void min() {
        int[] arr = getArrayFrom(2, 3, -2, 5, 6);

        float min = typeUtils.min(arr);

        assertEquals(-2, (int) min);
    }

    @Test
    public void plus() {
       assertEquals("0", typeUtils.plus("2", "-2"));
       assertEquals("5", typeUtils.plus("12", "-7"));
       assertEquals("-8", typeUtils.plus("-4", "-4"));
       assertEquals("100000004", typeUtils.plus("2", "100000002"));
    }

    @Test
    public void minus() {
        assertEquals("-4", typeUtils.minus("0", "4"));
        assertEquals("0", typeUtils.minus("-2", "-2"));
        assertEquals("10", typeUtils.minus("8", "-2"));
        assertEquals("200", typeUtils.minus("299", "99"));
    }

    @Test
    public void mul() {
        assertEquals("1", typeUtils.mul("1", "1"));
        assertEquals("-4", typeUtils.mul("2", "-2"));
        assertEquals("0", typeUtils.mul("100", "0"));
        assertEquals("625", typeUtils.mul("25", "25"));
    }

    @Test
    public void div() {
        try{
            typeUtils.div("1", "0");
            fail("Divide on zero not allowed");
        } catch (ArithmeticException e) { }
        assertEquals("2", typeUtils.div("4", "2"));
        assertEquals("0", typeUtils.div("0", "2"));
        assertEquals("1", typeUtils.div("2", "2"));
        assertEquals("-1", typeUtils.div("-2", "2"));
    }

    private int[] getArrayFrom(int... integers) {
        int[] arr = new int[integers.length];
        System.arraycopy(integers, 0, arr, 0, integers.length);
        return arr;
    }

    private int[] cloneArr(int[] arr) {
        int[] snapshot = new int[arr.length];
        System.arraycopy(arr, 0, snapshot, 0, arr.length);
        return snapshot;
    }
}