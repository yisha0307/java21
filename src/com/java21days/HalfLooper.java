package com.java21days;

class HalfLooper {
    public static void main(String[] arguments) {
        int[] denver = {1_700_000, 4_600_000, 2_100_000};
        int[] philadephia = {1_800_000, 5_000_000, 2_500_000};
        int[] total = new int[denver.length];
        int sum = 0;
        
        for (int i=0; i<denver.length; i++) {
            total[i] = denver[i] + philadephia[i];
            System.out.format((i+2012) + " production: %,d%n", total[i]);
            sum += total[i];
        }
        
        System.out.format("Average production: %,d%n", sum / denver.length);
    }
}