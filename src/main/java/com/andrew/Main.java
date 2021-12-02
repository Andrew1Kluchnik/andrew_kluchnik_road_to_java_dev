package com.andrew;

import com.andrew.types.TypeUtilsImpl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] testArray = {11, 10, 6, 7, 2, 4, 0, -2, 1, 5, 1};
        TypeUtilsImpl test = new TypeUtilsImpl();
        Arrays.stream(test.sort(testArray)).forEach(System.out::println);
        System.out.println(test.max(testArray));
        System.out.println(test.min(testArray));
        System.out.println(test.arithmeticMean(testArray));
        System.out.println(test.div("2","0"));
    }
}
