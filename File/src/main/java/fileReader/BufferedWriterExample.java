package fileReader;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterExample {
    public static void main(String[] args) throws Exception {
        FileWriter writer = new FileWriter("D:\\testout.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("Welcome to java.\n");
        buffer.write("Trần Hân Hoàn");
        buffer.newLine();
        buffer.write("Quốc Pháp");

        buffer.close();
        System.out.println("Success...");
    }
}