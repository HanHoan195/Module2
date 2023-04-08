package bai12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Manager {
    Scanner scanner = new Scanner(System.in);

    //tạo list
    List<RoadTransport> roadTransports;

    //tạo đối tượng
    public Manager(){
        roadTransports = new ArrayList<>();//tạo array list

        //tạo các đối tượng mặc định

        roadTransports.add(new RoadTransport(1,"Ferrari",2020,1000000,"Red"));
        roadTransports.add(new RoadTransport(2,"Ducati",2023,1300000,"Blue"));
        roadTransports.add(new RoadTransport(3,"Benz",2000,900000,"Black"));

    }

    //show
    public void showRoadTransport(){
        System.out.printf("%-3s | %-15s | %-5s | %-15s | %-10s\n", "ID", "Manufacture","Year","Price", "Color");
        for (int i=0;i< roadTransports.size();i++){//duyệt qua mảng rồi lấy tuofg giá trị
            RoadTransport roadTransport = roadTransports.get(i);//tạo đối tượng mới của phương thức
            System.out.printf("%-3s | %-15s | %-5s | %-15s | %-10s\n",
                    roadTransport.getId(),roadTransport.getManufacture(),roadTransport.getYearOfManufacture(),
                    roadTransport.getPrice(),roadTransport.getColor());


        }
    }
     public void showRoadTransport(List<RoadTransport> roadTransports){//showw vs tham số là list
        System.out.printf("%-3s | %-15s | %-5s | %-15s | %-10s\n", "ID", "Manufacture","Year","Price", "Color");
        for (int i=0;i< roadTransports.size();i++){//duyệt qua mảng rồi lấy tuofg giá trị
            RoadTransport roadTransport = roadTransports.get(i);//tạo đối tượng mới của phương thức
            System.out.printf("%-3s | %-15s | %-5s | %-15s | %-10s\n",
                    roadTransport.getId(),roadTransport.getManufacture(),roadTransport.getYearOfManufacture(),
                    roadTransport.getPrice(),roadTransport.getColor());
        }
    }

    public void addRoadTransport(){
        System.out.println("Nhập thông tin:");
        System.out.println("Nhập hãng:");
        String company = scanner.nextLine();
        System.out.println("Nhập năm sản xuất:");
        int year = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập giá:");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập màu:");
        String color = scanner.nextLine();

        //tìm max id
        Comparator comparator = new ComparatorById();
        roadTransports.sort(comparator);//sắp xếp id
        int maxId = roadTransports.get(roadTransports.size()-1).getId();//tạo maxId

        RoadTransport roadTransport = new RoadTransport();//đối tượng ko tham số để add mới
        // cập nhât giá trị thêm mới
        roadTransport.setId(maxId+1);
        roadTransport.setManufacture(company);
        roadTransport.setYearOfManufacture(year);
        roadTransport.setPrice(price);
        roadTransport.setColor(color);

        //add vào list
        roadTransports.add(roadTransport);

        showRoadTransport();
    }

    public void removeRoadTransport(){
        System.out.println("Nhập ID bạn muốn xóa?");
        int id = Integer.parseInt(scanner.nextLine());
        //duyệt qua danh sách
        for (int i=0;i< roadTransports.size();i++){
            if (id == roadTransports.get(i).getId()){
                roadTransports.remove(i);
            }
        }
        showRoadTransport();
    }

    public void searchByManufacture(){
        System.out.println("Nhập hãng bạn muốn tìm?");
        //cho 1 kw
        String kw = scanner.nextLine();
        //tọa list mới
        List<RoadTransport> result = new ArrayList<>();
        for (int i=0;i< roadTransports.size();i++){
            //so sánh vs kw
            if (roadTransports.get(i).getManufacture().contains(kw)){
                result.add(roadTransports.get(i));
            }
        }
        showRoadTransport(result);
    }
    public void searchByColor(){
        System.out.println("Nhập màu bạn muốn tìm?");
        //cho 1 kw
        String kw = scanner.nextLine();
        //tọa list mới
        List<RoadTransport> result = new ArrayList<>();
        for (int i=0;i< roadTransports.size();i++){
            //so sánh vs kw
            if (roadTransports.get(i).getColor().contains(kw)){
                result.add(roadTransports.get(i));
            }
        }
        showRoadTransport(result);
    }
}
