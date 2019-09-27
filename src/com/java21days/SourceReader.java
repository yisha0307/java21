package com.java21days;
import java.io.*;

public class SourceReader {
    public static void main(String[] arguments) {
        try (FileReader file = new FileReader("SourceReader.java");
            BufferedReader buff = new BufferedReader(file)){
            boolean bof = false;
            while(!bof){
                String line = buff.readLine();
                if (line == null) {
                    bof = true;
                } else {
                    System.out.println(line);
                }
            }
            buff.close();
        }catch(IOException err) {
            System.out.println("Error---" + err.toString());
        }
    }
}