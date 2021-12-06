package com.andrew;

import com.andrew.habr.HabrBasics1Impl;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] array = new int[] {1,2,3,4,7,8,9,0,3,4};
        HabrBasics1Impl habrBasics1 = new HabrBasics1Impl();
        System.out.println("Hello!");
        System.out.println(habrBasics1.MaxMinAvgOfArray());
        System.out.println(Arrays.toString(habrBasics1.RemoveSomeNumber(array, 3)));

    }
}
