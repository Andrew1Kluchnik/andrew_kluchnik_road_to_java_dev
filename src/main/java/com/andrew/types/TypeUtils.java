package com.andrew.types;

public interface TypeUtils {
    /**
     * Метод возвращает отсортированный массив, от меньшего к большему, который подается на вход, при этом исходный массив не должен быть изменен.
     *
     * @param array
     * @return
     */
    int[] sort(int[] array);


    /**
     * Метод расчитывает среднее арифметическое значений всех элементов массива, при этом исходный массив не должен быть изменен.
     *
     * @param array
     * @return
     */
    float arithmeticMean(int[] array);

    /**
     * Метод ищет максимальное число в массиве, при этом исходный массив не должен быть изменен.
     * @param array
     * @return
     */
    float max(int[] array);

    /**
     * Метод ищет минимальное число в массиве, при этом исходный массив не должен быть изменен.
     * @param array
     * @return
     */
    float min(int[] array);


    /**
     * Метод сложения двух чисел произвольного типа и произвольной размерности.
     *
     * @param value1
     * @param value2
     * @return
     */
    String plus(String value1, String value2);

    /**
     * Метод вычитания двух чисел произвольного типа и произвольной размерности.
     *
     * @param value1
     * @param value2
     * @return
     */
    String minus(String value1, String value2);

    /**
     * Метод умножения двух чисел произвольного типа и произвольной размерности.
     *
     * @param value1
     * @param value2
     * @return
     */
    String mul(String value1, String value2);

    /**
     * Метод деления двух чисел произвольного типа и произвольной размерности.
     *
     * @param value1
     * @param value2
     * @return
     */
    String div(String value1, String value2);
}
