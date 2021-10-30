package com.company;

public class ReverseStr {
    public void reversing(String text) {
        char[] arrayConvertingFromString = text.toCharArray();
        String rev = "";
        for (char number : arrayConvertingFromString) {
            System.out.println(number);
        }
        for (int i = arrayConvertingFromString.length - 1; i >= 0; i--) {
            rev += arrayConvertingFromString[i];
        }
        System.out.println(rev);
    }
}
