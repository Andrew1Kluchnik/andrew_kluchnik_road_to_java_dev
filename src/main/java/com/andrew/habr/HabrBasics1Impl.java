package com.andrew.habr;

import java.util.Arrays;
import java.util.Random;

public class HabrBasics1Impl {

    public String MaxMinAvgOfArray() {
        String result = "";
        int avg = 0;
        int min = 30;
        int max = 0;
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) Math.round(Math.random() * 30);
            if (randomArray[i] < min) {
                min = randomArray[i];
            }
            if (randomArray[i] > max) {
                max = randomArray[i];
            }
            avg += randomArray[i];
        }
        avg /= randomArray.length;
        result += "avg = " + avg + ", min = " + min + ", max = " + max;
        return result;
    }

    public int[] RemoveSomeNumber(int[] array, int number) {
        int resultArray[] = new int[array.length];
        int countOfResult = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                resultArray[countOfResult] = array[i];
                countOfResult++;
            }


        }
        resultArray = Arrays.copyOf(resultArray, resultArray.length - (array.length - countOfResult));
        return resultArray;
    }


}
