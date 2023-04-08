package fileReader;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWriteFile {
    public List<Integer> readFile(String filePath) throws FileNotFoundException{
        List<Integer> numbers = new ArrayList<>();
        try{
            File file = new File("D:\\test.txt");
            if (!file.exists()){
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            while ((line = br.readLine()) !=null){
                numbers.add(Integer.parseInt(line));
            }
            br.close();
        } catch (Exception e){
            System.out.println("File không tồn tại hoặc lỗi");
        }
        return numbers;
    }

    public void writeFile(String filePath, int max){
        try {
            FileWriter writer = new FileWriter(filePath, true);
            BufferedWriter bufferedWriter = new BufferedWriter(writer);
            bufferedWriter.write("Giá trị lớn nhất " + max);
            bufferedWriter.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
