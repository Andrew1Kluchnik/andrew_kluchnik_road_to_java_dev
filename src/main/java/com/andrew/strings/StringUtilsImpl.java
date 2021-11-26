package com.andrew.strings;

import java.nio.charset.Charset;

public class StringUtilsImpl implements StringUtils {
    @Override
    public int charCount(String str, char letter) {
        int count = -1;
        char[] arrayStr = str.toCharArray();

        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i] == letter)
                count++;
        }
        return count;
    }

    @Override
    public String reverse(String str) {
       char [] arrayStr = str.toCharArray();
        for (int i = 0; i < arrayStr.length/2; i++) {
            char letter = arrayStr[i];
            arrayStr[i] = arrayStr[arrayStr.length-i-1];
            arrayStr[arrayStr.length-i-1] = letter;
        }
        String string = new String(arrayStr);
        return string;
    }

    @Override
    public StringBuilder alphabet() {
        return null;
    }

    @Override
    public String toCamelCase(String str) {
        return null;
    }

    @Override
    public String fromCamelCase(String camelStr) {
        return null;
    }

    @Override
    public String trim(String str) {
        return null;
    }
}
