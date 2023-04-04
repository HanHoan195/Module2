package bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Management {
    Scanner scanner = new Scanner(System.in);
    List<Cadres> cadres;
    public Management(){
        cadres = new ArrayList<>();

        cadres.add(new Cadres("Trần Hân Hoàn",28,"Male","An Hòa"));
        cadres.add(new Cadres("Đặng Nam Quốc Pháp",26,"Male","Chùa Thiên Mụ"));
        cadres.add(new Cadres("Bảo Thy",25,"FeMale","Huế"));
    }

    public void showCadres(){
        System.out.printf("%-20s | %-5s | %-10s | %-25s\n","FullName", "Age","Gender", "Address");
        for (int i=0;i< cadres.size();i++){
            Cadres cadres1 = cadres.get(i);
            System.out.printf("%-20s | %-5s | %-10s | %-25s\n",cadres1.getFullName(),cadres1.getAge(),cadres1.getGender(),cadres1.getAddress());
        }
    }

    public void showCadres(List<Cadres> cadres){
        System.out.printf("%-20s | %-5s | %-10s | %-25s\n","FullName", "Age","Gender", "Address");
        for (int i=0;i< cadres.size();i++){
            Cadres cadres1 = cadres.get(i);
            System.out.printf("%-20s | %-5s | %-10s | %-25s\n",cadres1.getFullName(),cadres1.getAge(),cadres1.getGender(),cadres1.getAddress());
        }
    }

    public void addCadres(){
        System.out.println("Enter infrmation new Cadres ");
        System.out.println("FullName:");
        String name = scanner.nextLine();
        System.out.println("Age:");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Gender:");
        String gender = scanner.nextLine();
        System.out.println("Address:");
        String address = scanner.nextLine();

        Cadres cadres1 = new Cadres();
        cadres1.setFullName(name);
        cadres1.setAge(age);
        cadres1.setGender(gender);
        cadres1.setAddress(address);

        cadres.add(cadres1);
        showCadres();
    }

    public void searchByName(){
        System.out.println("Enter the name you want to search?");
        String keyword = scanner.nextLine();
        List<Cadres> result = new ArrayList<>();
        for (int i=0;i< cadres.size();i++){
            if (cadres.get(i).getFullName().contains(keyword))
            result.add(cadres.get(i));
        }
        showCadres(result);
    }


    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        Management management = new Management();
        boolean checkMenu = true;

        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Show List.");
            System.out.println("2. Add Cadres.");
            System.out.println("3. Search By Name.");
            System.out.println("Enter your choice");
            int choice = Integer.parseInt(scanner1.nextLine());

            switch (choice){
                case 1:
                    management.showCadres();
                    break;
                case 2:
                    management.addCadres();
                    break;
                case 3:
                    management.searchByName();
                    break;
                default:
                    System.out.println("Invalid information");
            }
            boolean checkMenuContinue = true;
            do {

                System.out.println("Do you want to continue? Y/N");
                String choiceContinue = scanner1.nextLine();
                switch (choiceContinue){
                    case "Y":
                        checkMenuContinue = false;
                        checkMenu = true;
                        break;
                    case "N":
                        checkMenu = false;
                        checkMenuContinue = false;
                }
            }while (checkMenuContinue);
        } while (checkMenu);

    }

}
