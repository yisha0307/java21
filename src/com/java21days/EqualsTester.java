package com.java21days;

class EqualsTester {
    public static void main(String[] arguments) {
        String str1, str2;
        str1 = "Boy, that escalated quickly";
        str2 = str1;
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("same object? " + (str1 == str2));
        System.out.println("same value? " + str1.equals(str2));
        
        str2 = new String(str1);
        
        System.out.println("String1: " + str1);
        System.out.println("String2: " + str2);
        System.out.println("same object? " + (str1 == str2));
        System.out.println("same value? " + str1.equals(str2));
        
        boolean check1 = "Texas" instanceof String;
        
        Object obiwan = new Object();
        boolean check2 = obiwan instanceof String;
        System.out.println(check1 + ", " + check2);
    }
}