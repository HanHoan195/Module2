package arraylist_linkedlist;

import java.util.*;

public class ProductManager {
    //List<Product> products;
    LinkedList<Product> products;
    private Scanner scanner = new Scanner(System.in);

    public ProductManager(){
        products = new LinkedList<>();

        products.add(new Product(1,"Truyện","Conan",10000));
        products.add(new Product(2,"Sách","Đắc nhân tâm",50000));
        products.add(new Product(3,"Báo","Tuổi trẻ",30000));

    }

    public void showProduct(){
        System.out.printf("%-3s | %-10s | %-20s | %-10s\n", "ID", "Name", "Information", "Price");
        for (int i=0;i< products.size();i++){
            Product product = products.get(i);
            System.out.printf("%-3s | %-10s | %-20s |%-10s\n", product.getId(), product.getProductName(), product.getProdcutInformation(),product.getPrice());
        }
    } public void showProduct(LinkedList<Product> products){
        System.out.printf("%-3s | %-10s | %-20s | %-10s\n", "ID", "Name", "Information", "Price");
        for (int i=0;i< products.size();i++){
            Product product = products.get(i);
            System.out.printf("%-3s | %-10s | %-20s |%-10s\n", product.getId(), product.getProductName(), product.getProdcutInformation(),product.getPrice());
        }
    }


    public void addProduct(){
        System.out.println("Nhập thông tin sản phẩm");
        System.out.println("Nhập tên sản phẩm:");
        String name = scanner.nextLine();
        System.out.println("Nhập thông tin sp:");
        String information = scanner.nextLine();
        System.out.println("Nhập giá:");
        double price = Double.parseDouble(scanner.nextLine());

        Comparator comparator = new ComparatorById();
        products.sort(comparator);
        long maxId = products.get(products.size()-1).getId();

        Product product = new Product();
        product.setId((int) (maxId+1));
        product.setProductName(name);
        product.setProdcutInformation(information);
        product.setPrice(price);

         products.add(product);

         showProduct();

    }

    public void editProduct(){
        System.out.println("Nhập ID bạn muốn sữa");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên mới:");
        String nameNew = scanner.nextLine();
        System.out.println("Nhập thông tin mới:");
        String informationNew = scanner.nextLine();
        System.out.println("Nhập giá mới:");
        double priceNew = Double.parseDouble(scanner.nextLine());

        for (int i=0;i<products.size();i++){
            if(id == products.get(i).getId()){
                products.get(i).setProductName(nameNew);
                products.get(i).setProdcutInformation(informationNew);
                products.get(i).setPrice(priceNew);
            }
        }
        showProduct();

    }

    public void deleteProduct(){
        System.out.println("Nhập ID bạn muốn xóa:");
        int id = Integer.parseInt(scanner.nextLine());

        for (int i=0;i< products.size();i++){
            if(id == products.get(i).getId()){
                products.remove(i);
            }
        }
        showProduct();
    }

    public void searchByName(){
        System.out.println("Nhập tên bạn muốn tìm kiếm:");
        String name = scanner.nextLine();
        List<Product> result = new ArrayList<>();
        for (int i=0;i< products.size();i++){
            if(products.get(i).getProductName().contains(name)){
                result.add(products.get(i));
            }
        }
        showProduct((LinkedList<Product>) result);
    }

    public void sortByName(){
        products.sort(new ComparatorByName());
        showProduct();
    }

    public void sortByPrice(){
        products.sort(new ComparatorByPrice());
        showProduct();
    }



    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        ProductManager productManager = new ProductManager();
        boolean checkMenu = true;

        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm sp vào danh sách");
            System.out.println("3. Xóa sản phẩm");
            System.out.println("4. Sửa sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm theo tên");
            System.out.println("7. Sắp xếp sản phẩm theo giá");
            System.out.println("Nhập mục bạn muốn:");
            int actionMenu = Integer.parseInt(scanner1.nextLine());

            switch (actionMenu){
                case 1:
                    productManager.showProduct();
                    break;
                case 2:
                    productManager.addProduct();
                    break;
                case 3:
                    productManager.deleteProduct();
                    break;
                case 4:
                    productManager.editProduct();
                    break;
                case 5:
                    productManager.searchByName();
                    break;
                case 6:
                    productManager.sortByName();
                    break;
                case 7:
                    productManager.sortByPrice();
                    break;
                default:
                    System.out.println("Không đúng! Nhập lại.");
            }

            boolean checkMenuContinue = true;
            do {
                System.out.println("Bạn muốn tiếp tục không: Y/N");
                String actionMenuContinue = scanner1.nextLine();
                switch (actionMenuContinue){
                    case "Y":
                        checkMenuContinue = false;
                        checkMenu = true;
                        break;
                    case "N":
                        checkMenuContinue = false;
                        checkMenu = false;
                }
            } while (checkMenuContinue);

        } while (checkMenu);

    }

}
