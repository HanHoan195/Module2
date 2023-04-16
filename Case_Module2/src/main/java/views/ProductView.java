package views;

import model.Payment;
import model.Product;
import model.Status;
import model.Type;
import service.ProductService;
import utils.PriceSortASC;
import utils.PriceSortDESC;

import java.text.DecimalFormat;
import java.util.List;
import java.util.Scanner;

public class ProductView {
    DecimalFormat format = new DecimalFormat("###,###,###" + "đ");
    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
      ProductService productService = new ProductService();

    public ProductView(){

    }

    //thêm sp
    public void addProduct(){
        int id;
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Nhập ID sản phẩm:");
            System.out.print("\t︻┳═一 ");

            try {
                id = input.nextInt();
                if (id>0){
                    if (productService.existProduct(id)){
                        System.out.println(" ❌ ID này đã tồn tại ❌");
                    } else {
                        break;
                    }
                } else {
                    System.out.println("❌ ID phải lớn hơn 0 ❌");
                    System.out.println();
                }
            } catch (Exception e ){
                System.err.println("\t ❌ ID phải là 1 số ❌");
                System.out.println();
            }
        }


        Type type = null;
        int choice;
        while (true){
            boolean check = false;
            menuType();
            System.out.println("Nhập loại sản phẩm ");
            System.out.print("\t ︻┳═一 ");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        type = Type.IPHONE;
                        check = true;
                        break;
                    case 2:
                        type = Type.SAMSUNG;
                        check = true;
                        break;
                    case 3:
                        type = Type.XIAOMI;
                        check = true;
                        break;
                    default:
                        System.out.println("Nhập sai thông tin vui lòng nhập lại !");
                        break;
                }
                if (check) {
                    break;
                }
            } catch (Exception e) {
                System.err.println("Nhập vào phải là 1 số!");
            }
        }

        String name;
        while (true) {
            System.out.println("Nhập tên sản phẩm: ");
            System.out.print("\t︻┳═一 ");
            String nameNew =scanner.nextLine();
            if (productService.existProdutName(nameNew)) {
                System.out.println("Sản phẩm này đã tồn tại vui lòng cập nhật số lượng!");
            } else {
                name = nameNew;
                break;
            }
        }

        int quantity;
        while (true) {
            System.out.println("Nhập số lượng sản phẩm: ");
            System.out.print("\t︻┳═一 ");
            try {
                quantity = Integer.parseInt(scanner.nextLine());
                if (quantity > 0) {
                    break;
                }
                System.out.println("Số lượng phải lớn hơn 0!");
                System.out.println();
            } catch (Exception e){
                System.out.println("Số lượng phải là một số!");
                System.out.println();
            }
        }

        long price;
        while (true) {
            System.out.println("Nhập giá sản phẩm: ");
            System.out.print("\t︻┳═一 ");
            try {
                price = Long.parseLong(scanner.nextLine());
                if (price > 0) {
                    break;
                }
                System.out.println("Giá phải lớn hơn 0!");
                System.out.println();
            } catch (Exception e) {
                System.out.println("Giá phải là một số!");
                System.out.println();
            }
        }

        System.out.println("Nhập mô tả sản phẩm: ");
        System.out.print(" \t︻┳═一 ");
        String description =scanner.nextLine();
        Status status = Status.INSTOCK;

        Product product = new Product(id, type, name, quantity, price, description, status);
        productService.add(product);
        System.out.println("✔ Bạn đã thêm sản phẩm thành công ✔\n");
        menu.manager();
    }
    public void showProduct(){
        List<Product> products = productService.getProducts();
        System.out.println("\t\t\t\t\tDanh sách sản phẩm:");
        System.out.println("\t\t\t\t╔═════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("\t\t\t\t  %-5s %-15s %-20s %-10s %-15s %-20s\n",
                "ID", "Loại sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Trạng thái");
        for (Product product:products){
            System.out.printf("\t\t\t\t  %-5s %-15s %-20s %-10s %-15s %-20s\n",
                    product.getId(),product.getType(),product.getName(),product.getQuantity(),format.format(product.getPrice()),product.getStatus());
        }
        System.out.println("\t\t\t\t╚══════════════════════════════════════════════════════════════════════════════════════╝");

    }

    public void showProductManager() {
        showProduct();
        menu.manager();
    }
     public void showProductGuest() {
           showProduct();
            menu.customer();
     }

     public void showDescription(){
         List<Product> products = productService.getProducts();
         System.out.println("\t\t\t\tMô tả sản phẩm: ");
         System.out.println("\t\t\t\t╔══════════════════════════════════════════════════════════════════════════════════════════════════════╗");
         System.out.printf("\t\t\t\t %-5s %-15s %-20s %-50s \n",
                 "ID", "Loại sản phẩm", "Tên sản phẩm", "Mô tả" );
         for(Product product:products){
             System.out.printf("\t\t\t\t %-5s %-15s %-20s %-50s \n",
                     product.getId(),product.getType(),product.getName(),product.getDescription());
         }
         System.out.println("\t\t\t\t╚═══════════════════════════════════════════════════════════════════════════════════════════════════════╝");
     }

     public void showDescriptionManager(){
        showDescription();
         menu.manager();
     }
     public void showDescriptionGuest(){
            showDescription();
         menu.customer();
     }


    public void sortASC(){
        List<Product> p = productService.getProducts();
        p.sort(new PriceSortASC());
        System.out.println("\t\t\t\t Danh sách sản phẩm:");
        System.out.println("\t\t\t\t╔══════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("\t\t\t\t  %-5s %-15s %-20s %-10s %-15s %-20s\n",
                "ID", "Loại sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Trạng thái");
        for (Product product:p){
            System.out.printf("\t\t\t\t  %-5s %-15s %-20s %-10s %-15s %-20s\n",
                    product.getId(), product.getType(), product.getName(), product.getQuantity(), format.format(product.getPrice()), product.getStatus());
        }
        System.out.println("\t\t\t\t╚═══════════════════════════════════════════════════════════════════════════════════════╝");
        menu.customer();
    }

    public void sortDESC() {
        List<Product> p = productService.getProducts();
        p.sort(new PriceSortDESC());
        System.out.println("\t\t\t\t Danh sách sản phẩm:");
        System.out.println("\t\t\t\t╔══════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("\t\t\t\t  %-5s %-15s %-20s %-10s %-15s %-20s\n",
                "ID", "Loại sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Trạng thái");
        for (Product product:p){
            System.out.printf("\t\t\t\t  %-5s %-15s %-20s %-10s %-15s %-20s\n",
                    product.getId(), product.getType(), product.getName(), product.getQuantity(), format.format(product.getPrice()), product.getStatus());
        }
        System.out.println("\t\t\t\t╚═══════════════════════════════════════════════════════════════════════════════════════╝");
        menu.customer();
    }

    public void showProductByType(){
        menuType();
        System.out.print("Nhập số tương ứng với loại sản phẩm cần tìm (1-3): ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        String type;
        switch (choice){
            case 1:
                type = "IPHONE";
                break;
            case 2:
                type = "SAMSUNG";
                break;
            case 3:
                type = "XIAOMI";
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ! Vui lòng nhập lại!");
                return;
        }
        boolean found = false;
        List<Product> products =productService.getProducts();
        System.out.println("\t\t\t\tDanh sách sản phẩm:");
        System.out.println("\t\t\t\t╔═══════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("\t\t\t\t  %-5s %-15s %-20s %-10s %-15s %-20s\n",
                "ID", "Loại sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Trạng thái");
        for (Product product:products){
            if (product.getType().equalsIgnoreCase(type)){
                System.out.printf("\t\t\t\t  %-5s %-15s %-20s %-10s %-15s %-20s\n",
                        product.getId(), product.getType(), product.getName(), product.getQuantity(), format.format(product.getPrice()), product.getStatus());

                found = true;
            }
        }
        System.out.println("\t\t\t\t╚════════════════════════════════════════════════════════════════════════════════════════╝");
        if (!found){
            System.out.println("\t\t\t\t\t ✖ Không có sản phẩm này ✖");
        }
    }

    public void findProductByTypeGuest(){
       showProductByType();
        menu.customer();
    }

    public void findProductByTypeManager(){
        showProductByType();
        menu.manager();
    }

    public void showProductByName(){
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        boolean found = false;
        List<Product> p = productService.getProducts();
        System.out.println("\t\t\t\tDanh sách sản phẩm: ");
        System.out.println("\t\t\t\t╔═════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.printf("\t\t\t\t  %-5s %-15s %-20s %-10s %-15s %-20s\n",
                "ID", "Loại sản phẩm", "Tên sản phẩm", "Số lượng", "Giá", "Trạng thái");
        for (Product product:p) {
            if (product.getName().contains(name)){
                System.out.printf("\t\t\t\t  %-5s %-15s %-20s %-10s %-15s %-20s\n",
                        product.getId(), product.getType(), product.getName(), product.getQuantity(), format.format(product.getPrice()), product.getStatus());

                found = true;
            }

        }
        System.out.println("\t\t\t\t╚═════════════════════════════════════════════════════════════════════════════════════╝");
        if (!found){
            System.out.println("\t\t\t\tKhông có sản phẩm này!");
        }
    }

    public void findProductByNameManager() {
       showProductByName();
        menu.manager();
    }public void findProductByNameGuest() {
       showProductByName();
        menu.customer();
    }
    public void updateProduct(){
        int id = 0;
        Product update = null;
        while (true){
            System.out.println("Nhập ID cần sửa:");
            System.out.print("\t︻┳═一 ");
            try {
                id = Integer.parseInt(scanner.nextLine());
                if (id > 0){
                    if(productService.existProduct(id)){
                        update =productService.findProductById(id);
                        break;
                    } else {
                        System.out.println("ID không tồn tại!");
                    }
                } else {
                    System.out.println("ID phải lớn hơn 0!");
                    System.out.println();
                }
            } catch (Exception e){
                System.err.println("ID phải là một số!");
                System.out.println();
            }
        }
        noChange();
        setType(update);


        while (true){
            System.out.println("Nhập tên cần sửa:");
            noChange();
            System.out.print("\t➺ ");
            String name = scanner.nextLine();
            if (name.equals("-1")){
                if (productService.existProdutName(name)){
                    System.out.println("Tên này đã tồn tại vui lòng cập nhật lại!");
                } else {
                    update.setName(name);
                    break;
                }
            } else{
                break;
            }
        }

        while (true){
            System.out.println("Nhập số lượng sản phẩm:");
            noChange();
            System.out.print("\t︻┳═一 ");
            try {
                int quantity =Integer.parseInt(scanner.nextLine());
                if (!(quantity == -1)){
                    if (quantity >= 0){
                        update.setQuantity(quantity);
                        break;
                    }
                    System.out.println("Số lượng phải lớn hơn 0!");
                    System.out.println();
                } else {
                    break;
                }
            } catch (Exception e ){
                System.err.println("Số lượng phải là 1 số!");
                System.out.println();
            }
        }


        while (true) {
            System.out.println("Nhập giá sản phẩm:");
            noChange();
            System.out.print("\t︻┳═一 ");
            try {
                long price = Long.parseLong(scanner.nextLine());
                if (!(price == -1 )){
                    if (price >= 0){
                        update.setPrice(price);
                        break;
                    }
                    System.out.println("Giá phải lớn hơn 0!");
                    System.out.println();
                } else {
                    break;
                }
            } catch (Exception e){
                System.err.println("Giá phải là một số!");
                System.out.println();
            }
        }

        while (true){
            System.out.println("Nhập mô tả sản phẩm:");
            noChange();
            System.out.print(" \t︻┳═一 ");
            String description = scanner.nextLine();
            if (!(description.equals(-1))){
                update.setDescription(description);
                break;
            } else {
                break;
            }
        }
        productService.update(id, update);
        System.out.println("✔ Bạn đã cập nhật sản phẩm thành công ✔\n");
        productService.checkExist();
        menu.manager();

    }

    public void noChange() {
        System.out.println(" ⦿ Nếu không thay đổi gì thì nhập: -1 ⦿ ");
    }

    public void setType(Product product){
        menuType();
        System.out.print("Chọn type: ");
        int options;
        try {
            options = Integer.parseInt(scanner.nextLine());
            switch (options){
                case -1:
                    break;
                case 1:
                    product.setType(Type.IPHONE);
                    break;
                case 2:
                    product.setType(Type.SAMSUNG);
                    break;
                case 3:
                    product.setType(Type.XIAOMI);
                    break;
                default:
                    System.out.println("Nhập không đúng vui lòng nhập lại!");
                    System.out.println();
                    break;
            }
        } catch (Exception e){
            System.err.println("Lựa chọn phải là một số!");
            setType(product);
        }

    }

    public void menuType(){
        System.out.println("╔═════TYPE══════════════╗");
        System.out.println("║    [1] IPHONE         ║ ");
        System.out.println("║    [2] SAMSUNG        ║ ");
        System.out.println("║    [3] XIAOMI         ║ ");
        System.out.println("╚═══════════════════════╝");
    }
    public void setStatus(Product product){
        System.out.println("╔═════STATUS══════════════╗");
        System.out.println("║    [1] INSTOCK          ║ ");
        System.out.println("║    [2] OUTOFSTOCK       ║ ");
        System.out.println("╚═════════════════════════╝");
        System.out.print("Chọn status: ");
        int options;
        try {
            options = Integer.parseInt(scanner.nextLine());
            switch (options){
                case -1:
                    break;
                case 1:
                    product.setStatus(Status.INSTOCK);
                    break;
                case 2:
                    product.setStatus(Status.INSTOCK);
                    break;
                default:
                    System.out.println("Nhập không đúng vui lòng nhập lại!");
                    break;
            }
        } catch (Exception e){
            System.err.println("Lựa chọn phải là một số!");
            setStatus(product);
        }

    }






}
