package fileReader;

import java.io.FileNotFoundException;
import java.util.List;

public class FindMaxVale {
    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i=0;i<numbers.size();i++){
            if (max < numbers.get(i)){
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) throws FileNotFoundException {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("test.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("result.txt ", maxValue);
    }
}
