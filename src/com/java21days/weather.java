package com.java21days;
public class weather {
    public static void main(String[] arguments) {
        float fah = 86;
        System.out.println(fah + " degrees Fahrenheit is ...");
        fah = fah - 32;
        fah = fah / 9;
        fah = fah * 5;
        System.out.println(fah + " degree Celsius\n");
        
        float cel = 33;
        System.out.println(cel + " degrees Celsius is ...");
        cel = cel * 9;
        cel = cel / 5;
        cel = cel + 32;
        System.out.println(cel + " degrees Fahrenheit");
        
        float y = 6 + 4/2;
        System.out.println(y + " is y.");
    }
}