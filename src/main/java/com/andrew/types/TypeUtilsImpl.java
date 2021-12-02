package com.andrew.types;

public class TypeUtilsImpl implements TypeUtils {
    public int[] sort(int[] array) {
        int[] backArray = array.clone();

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (backArray[j] > backArray[j + 1]) {
                    int numb = backArray[j];
                    backArray[j] = backArray[j + 1];
                    backArray[j + 1] = numb;
                }
            }
        }
        return backArray;
    }

    @Override
    public float arithmeticMean(int[] array) {
        float result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        result = result / array.length;
        return result;

    }

    @Override
    public float max(int[] array) {
        float maxArray = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxArray) {
                maxArray = array[i];
            }
        }

        return maxArray;
    }

    @Override
    public float min(int[] array) {

        float minArray = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < minArray) {
                minArray = array[i];
            }
        }

        return minArray;
    }

    @Override
    public String plus(String value1, String value2) {
        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);
        return String.valueOf(val1 + val2);
    }

    @Override
    public String minus(String value1, String value2) {
        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);
        return String.valueOf(val1 - val2);
    }

    @Override
    public String mul(String value1, String value2) {
        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);
        return String.valueOf(val1 * val2);

    }

    @Override
    public String div(String value1, String value2) {

        int val1 = Integer.parseInt(value1);
        int val2 = Integer.parseInt(value2);
        if (val2 != 0) {
            return String.valueOf(val1 / val2);
        }
        throw new ArithmeticException("You can't to divide by zero!");

    }
}
