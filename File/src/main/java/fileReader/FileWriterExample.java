package fileReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String args[]) throws IOException {
        try {
            FileWriter fw = new FileWriter("D:\\testout.txt");
            fw.write("Welcome .");
            fw.flush();
            fw.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println("Success...");

//        FileReader fileReader = new FileReader("D:\\testout.txt");
//        int i;
//        while ((i = fileReader.read()) != -1) {
//            System.out.print((char) i);
//        }
//        fileReader.close();
//    }
    }
}