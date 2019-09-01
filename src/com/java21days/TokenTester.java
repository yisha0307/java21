package com.java21days;

import java.util.StringTokenizer;

class TokenTester {
    public static void main(String[] arguments) {
        StringTokenizer str1, str2;
        String quote1 = "GOOG 530.80 -9.98";
        str1 = new StringTokenizer(quote1);
        System.out.println("Token 1: " + str1.nextToken());
        System.out.println("Token 2: " + str1.nextToken());
        System.out.println("Token 3: " + str1.nextToken());
        
        String quote2 = "RHT@75.00@22";
        str2 = new StringTokenizer(quote2, "@");
        System.out.println("\nToken1: " + str2.nextToken());
        System.out.println("Token 2: " + str2.nextToken());
        System.out.println("Token 3: " + str2.nextToken());
    }
}