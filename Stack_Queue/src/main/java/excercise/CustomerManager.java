package excercise;

import java.util.*;

public class CustomerManager {
    List<Customer> customers;

    private Scanner scanner = new Scanner(System.in);

    public CustomerManager(){
        customers = new ArrayList<>();

    //long id, String fullName, String email, String address, Date createAt
    Customer customer = new Customer(1, "Trần Hân Hoàn", "hanhoan@gmail.com", "An Hòa",new Date());
     customers.add(customer);
     customers.add(new Customer(2, "Đặng Nam Quốc Pháp", "phap@gmail.com", "Chùa Thiên Mụ", new Date()));
     customers.add(new Customer(3, "Châu Văn Nghĩa", "nghia@gmail.com", "Bến Thượng Hải", new Date()));
     customers.add(new Customer(4, "Châu Văn Nghĩa", "nghia@gmail.com", "Bến Thượng Hải", new Date()));
     customers.add(new Customer(5, "Đ", "nghia@gmail.com", "Bến Thượng Hải", new Date()));

    }

    public void showList(){
        System.out.printf("%3s | %-20s | %-20s | %-20s | %-30s \n", "ID", "Name", "Email", "Address", "Date");
        for (int i =0;i<customers.size();i++){
            Customer customer = customers.get(i);
            System.out.printf("%3s | %-20s | %-20s | %-20s | %-30s \n",customer.getId(),customer.getFullName(), customer.getEmail(),
                    customer.getAddress(), customer.getCreateAt());
        }
    }

    public void showList(List<Customer> customers){
        System.out.printf("%3s | %-20s | %-20s | %-20s | %-30s \n", "ID", "Name", "Email", "Address", "Date");
        for (int i =0;i<customers.size();i++){
            Customer customer = customers.get(i);
            System.out.printf("%3s | %-20s | %-20s | %-20s | %-30s \n",customer.getId(),customer.getFullName(), customer.getEmail(),
                    customer.getAddress(), customer.getCreateAt());
        }
    }


    //thêm khách hàng
    public void addCustomer(){
        System.out.println("Nhập thông tin khách hàng: ");
        System.out.println("Nhập họ và tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        //tìm id lớn nhất
        Comparator comparator = new ComparatorById();
        customers.sort(comparator);
        long maxId = customers.get(customers.size() -1).getId();

        Customer customer = new Customer();
        customer.setId(maxId + 1);
        customer.setFullName(name);
        customer.setEmail(email);
        customer.setAddress(address);
        customer.setCreateAt(new Date());

        customers.add(customer);
        showList();
    }

    //sửa thông tin khách hàng
    public void editCustomer(){
        System.out.println("Nhập ID bạn muốn sửa: ");
        long id = Long.parseLong(scanner.nextLine());

        //nhập thông tin mới
        System.out.println("Nhập tên mới:");
        String nameNew = scanner.nextLine();
        System.out.println("Nhập email mới: ");
        String emailNew = scanner.nextLine();
        System.out.println("Nhập địa chỉ mới: ");
        String addressNew = scanner.nextLine();

        for (int i=0;i<customers.size();i++){
            if (id == customers.get(i).getId()){
                customers.get(i).setFullName(nameNew);
                customers.get(i).setEmail(emailNew);
                customers.get(i).setAddress(addressNew);
            }
        }
        showList();
    }

    //xóa khách hàng
    public void deleteCustomer(){
        System.out.println("Nhập ID khách hàng bạn muốn xóa:");
        long id = Long.parseLong(scanner.nextLine());

        for (int i=0;i< customers.size();i++){
            if (id == customers.get(i).getId()){
                customers.remove(i);
            }
        }
        showList();
    }

    //tìm theo tên
     public void searchByName(){
        System.out.println("Nhập thông tin bạn muốn tìm:");
        String name = scanner.nextLine();
        List<Customer> result = new ArrayList<>();
        for (int i = 0;i<customers.size();i++){
            if (customers.get(i).getFullName().contains(name)){
                result.add(customers.get(i));
            }
        }
        showList(result);
    }

    public void searchByEmail(){
        System.out.println("Nhập thông tin bạn muốn tìm:");
        String email = scanner.nextLine();
        List<Customer> results = new ArrayList<>();
        for (int i =0;i<customers.size();i++){
            if (customers.get(i).getEmail().contains(email)){
                results.add(customers.get(i));
            }
        }
        showList(results);

    }

    public void searchByNameOrEmail(){
        System.out.println("Nhập thông tin bạn muốn tìm:");
        String email = scanner.nextLine();
        String name = scanner.nextLine();
        List<Customer> results = new ArrayList<>();
        for (int i =0;i<customers.size();i++){
            if (customers.get(i).getEmail().contains(email)){
                results.add(customers.get(i));
            }
        }
        showList(results);
    }

    //sắp xếp theo tên
    public void sortByName(){
        customers.sort(new ComparatorByName());
        showList();
    }

    //sắp xếp theo ngày tạo
     public void sortByDate(){
        customers.sort(new ComparatorByDate());
        showList();
    }


}
