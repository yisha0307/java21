package com.java21days;
import java.io.*;

public class PrimeReader {
    public static void main(String[] arguments) {
        try(FileInputStream file = new FileInputStream("400primes.dat");BufferedInputStream buff = new BufferedInputStream(file);DataInputStream data = new DataInputStream(buff)) {
            try {
                while (true) {
                    int in = data.readInt();
                    System.out.print(in + " ");
                }
                // 读到结尾会触发EOFException
            } catch(EOFException eof) {
                buff.close();
            }
        } catch (IOException err) {
            System.out.println("err--" + err.toString());
        }
    }
}