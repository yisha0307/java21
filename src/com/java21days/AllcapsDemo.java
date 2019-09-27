package com.java21days;
import java.io.*;
import java.nio.file.*;

public class AllcapsDemo {
    public static void main(String[] arguments) {
        if(arguments.length < 1) {
            System.out.println("You must specify a filename");
            System.exit(-1);
        }
        AllCaps cap = new AllCaps(arguments[0]);
        cap.convert();
    }
}
class AllCaps {
    String sourcename;
    AllCaps(String sourceArg) {
        sourcename = sourceArg;
    }
    void convert() {
        try {
            FileSystem fs = FileSystems.getDefault();
            Path source = fs.getPath(sourcename);
            Path temp = fs.getPath("tmp_" + sourcename);
            // create input stream
            FileReader fr = new FileReader(source.toFile());
            BufferedReader in = new BufferedReader(fr);
            // create output stream
            FileWriter fw = new FileWriter(temp.toFile());
            BufferedWriter out = new BufferedWriter(fw);
            
            boolean eof = false;
            int inChar;
            do {
                inChar = in.read();
                if (inChar != -1) {
                    char outChar = Character.toUpperCase((char) inChar);
                    out.write(outChar);
                } else {
                    eof = true;
                }
            } while (!eof);
            in.close();
            out.close();
            Files.delete(source);
            Files.move(temp, source);
        }catch(IOException | SecurityException se) {
            System.out.println("Err --- " + se.toString());
        }
    }
}