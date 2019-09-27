package com.java21days;
import java.io.*;

public class ByteReader {
    public static void main(String[] arguments) {
        try (FileInputStream file = new FileInputStream("location.gif")) {
            boolean eof = false;
            int count = 0;
            while(!eof) {
                // read() 返回读取的字节数
                int input = file.read();
                System.out.println(input + "");
                // 没有读取任何字节就到达了流的末尾 -1
                if (input == -1) {
                    eof = true;
                } else {
                    count++;
                }
            }
            file.close();
            System.out.println("\nBytes read: " + count);
        } catch (IOException e) {
            System.out.println("Error --" + e.toString());
        }
    } 
}