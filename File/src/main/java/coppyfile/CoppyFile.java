package coppyfile;

import java.io.*;

public class CoppyFile {
    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("D:\\Module2\\Module2\\File\\src\\test\\java\\sourcer.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter("D:\\Module2\\Module2\\File\\src\\test\\java\\target.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String str;
            while ((str = bufferedReader.readLine()) != null){
                bufferedWriter.write(str + "\n");
            }

            bufferedReader.close();
            bufferedWriter.close();
            fileWriter.close();
            fileReader.close();

        } catch (Exception e){
            System.err.println("File not found!");
        }
    }


}
