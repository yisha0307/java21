package com.java21days;
import java.io.*;

public class PrimeWriter {
    public static void main(String[] arguments) {
        int[] primes = new int[400];
        int numPrimes = 0;
        // candidate: the number that might be prime
        int candidate = 2;
        while (numPrimes < 400) {
            if (isPrime(candidate)) {
                primes[numPrimes] = candidate;
                numPrimes++;
            }
            candidate++;
        }
        // write the first 400 primes
        try (FileOutputStream file = new FileOutputStream("400primes.dat"); BufferedOutputStream buff = new BufferedOutputStream(file); DataOutputStream data = new DataOutputStream(buff);) {
            for (int i = 0; i < 400; i++) {
                data.writeInt(primes[i]);
            }
            data.close();
        } catch(IOException err) {
            System.out.println("Error--" + err.toString());
        }
    }
    public static boolean isPrime(int checkNumber) {
        double root = Math.sqrt(checkNumber);
        for(int i =2; i<=root; i++) {
            if (checkNumber % i == 0) {
                return false;
            }
        }
        return true;
    }
}