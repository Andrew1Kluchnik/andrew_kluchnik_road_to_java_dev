package com.andrew.strings;

import java.util.ArrayList;

public class StringUtilsImpl implements StringUtils {
    @Override
    public int charCount(String str, char letter) {
        int count = 0;
        char[] arrayStr = str.toCharArray();

        for (int i = 0; i < arrayStr.length; i++) {
            if (arrayStr[i] == letter)
                count++;
        }
        if (count == 0) {
            return -1;
        }
        return count;
    }

    @Override
    public String reverse(String str) {
        char[] arrayStr = str.toCharArray();
        for (int i = 0; i < arrayStr.length / 2; i++) {
            char letter = arrayStr[i];
            arrayStr[i] = arrayStr[arrayStr.length - i - 1];
            arrayStr[arrayStr.length - i - 1] = letter;
        }
        String string = new String(arrayStr);
        return string;
    }

    @Override
    public StringBuilder alphabet() {
        int count = 0;
        StringBuilder result = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            if (count % 2 != 0) {
                result.append(Character.toUpperCase(i));
                count++;
            } else {
                result.append(i);
                count++;
            }
        }
        return result;
    }

    @Override
    public String toCamelCase(String str) {
        if (str != null) {
            str = str.trim().replaceAll(" +", " ").replaceAll(",", "");
            char[] chars = str.toCharArray();
            String result = "";
            for (int i = 0; i < chars.length; i++) {
                if (i == 0 || Character.toString(chars[i - 1]).equals(" ")) {
                    result += Character.toUpperCase(chars[i]);
                } else result += Character.toLowerCase(chars[i]);
            }
            result = result.replaceAll(" ", "");
            return result;
        }
        return "";

    }

    @Override
    public String fromCamelCase(String camelStr) {
        if (camelStr != null) {
            char[] arrayOfString = camelStr.toCharArray();
            String result = "";
            for (int i = 0; i < arrayOfString.length; i++) {
                if (Character.isUpperCase(arrayOfString[i]) && i > 1) {
                    result += " ";
                    result += Character.toLowerCase(arrayOfString[i]);
                } else {
                    result += arrayOfString[i];
                }
            }
            return result;
        }

        return "";
    }

    @Override
    public String trim(String str) {
        String result = str;
        while (result.contains("  ")) {
            result = result.trim().replaceAll(" +", " ");
        }

        return result;
    }
}
