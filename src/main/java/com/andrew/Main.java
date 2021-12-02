package com.andrew;

import com.andrew.strings.StringUtilsImpl;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello!");
        StringUtilsImpl s = new StringUtilsImpl();
        System.out.println(s.reverse("1234567rt"));
    }
}
