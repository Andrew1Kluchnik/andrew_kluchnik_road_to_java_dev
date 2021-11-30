package com.andrew.strings;

import java.util.ArrayList;

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
        StringBuilder sb = new StringBuilder();
        for (char i = 'a'; i <= 'z'; i++) {
            if (count % 2 == 0) {
                sb.append(Character.toUpperCase(i));
                count++;
            } else {
                sb.append(i);
                count++;
            }
        }
        return sb;
    }

    @Override
    public String toCamelCase(String str) {
        str = str.trim().replaceAll(" +", " ").replaceAll(",", "");
        char[] chars = str.toCharArray();
        String result = "";
        for (int i = 0; i < chars.length; i++) {
            if (i == 0 || Character.toString(chars[i - 1]).equals(" ")) {
                result += Character.toUpperCase(chars[i]);
            } else result += Character.toLowerCase(chars[i]);
        }
        result = result.replaceAll(" ","");

        return result;

    }

    @Override
    public String fromCamelCase(String camelStr) {
        char[] arrayOfString = camelStr.toCharArray();
        String result = "";
        ArrayList arrayList = new ArrayList();
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

    @Override
    public String trim(String str) {
        String result = str;
        while (result.contains("  ")) {
            result = result.trim().replaceAll(" +", " ");
        }

        return result;
    }
}
