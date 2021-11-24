package com.andrew.types;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

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
        assertEquals(expArr, sortedArr);
    }

    @Test
    public void arithmeticMean() {
    }

    @Test
    public void max() {
    }

    @Test
    public void min() {
    }

    @Test
    public void plus() {
    }

    @Test
    public void minus() {
    }

    @Test
    public void mul() {
    }

    @Test
    public void div() {
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