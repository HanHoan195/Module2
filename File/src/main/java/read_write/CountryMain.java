package read_write;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CountryMain {
    private static List<Country> readCountriesFromFile(String fileName){
        List<Country> countryList = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = null;
            while ((line = bufferedReader.readLine()) != null){
                String[] items = line.split(",");
                int id = Integer.parseInt(items[0]);
                Country c = new Country(id, items[1], items[2]);
                countryList.add(c);

            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return countryList;
    }
    public static void showContries(List<Country> countryList){
        for (int i = 0; i < countryList.size(); i++) {
            System.out.println(countryList.get(i));
        }
    }

    public static void main(String[] args) {
        List<Country> countryList = readCountriesFromFile("D:\\Module2\\Module2\\File\\src\\test\\java\\country.csv");
        showContries(countryList);
    }
}
