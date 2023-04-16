package views;

import model.Payment;
import model.Product;
import service.PaymentService;
import service.ProductService;
import utils.ValidateUtils;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static views.Menu.*;

public class PaymentView {
    DecimalFormat format = new DecimalFormat("###,###,###" + " đ");
    Scanner scanner = new Scanner(System.in);
    PaymentService paymentService = new PaymentService();
    ProductService productService = new ProductService();
    List<Payment> list = new ArrayList<>();
    Menu menu = new Menu();
    int id1 = 0;

    int quantityPurchased = 0;

    String name;
    String phone;
    String address;
    long revenue;
    int realQuantity;
    int quantity;

    int currentQuantity;


    Product product = null;


    public PaymentView() {
    }
    public void showRevenue(){
        System.out.println("＄ Tổng doanh thu: "+ format.format(paymentService.showTotal()));
        System.out.println("══════════════════════════════════════════");
    }

    public void buy(){
        while (true) {
            System.out.println("Nhập ID sản phẩm cần mua: ");
            System.out.print("\t︻┳═一 ");
//            System.out.println();
            try {
                id1 = Integer.parseInt(scanner.nextLine());
                if (id1 > 0) {
                    if (paymentService.existProduct(id1)) {
                        product =paymentService.findProductById(id1);
                        break;
                    } else {
                        System.out.println("\t\t\t\tID này không tồn tại");
                    }

                } else {
                    System.out.println("\t\t\t\tID phải lớn hơn 0");
                    System.out.println();
                }
            } catch (Exception e){
                System.out.println("\t\t\t\tID phải là 1 số");
                System.out.println();
            }
        }

        while (true){
            System.out.println("Nhập số lượng cần mua: ");
            System.out.print("\t︻┳═一 ");
//            System.out.println();
            realQuantity = product.getQuantity();
            try {
                quantity =Integer.parseInt(scanner.nextLine());
                if (quantity >= 0) {
                    if (!(quantity > realQuantity)) {
                        currentQuantity =realQuantity - quantity;
                        quantityPurchased = quantity;
                        break;
                    } else {
                        System.out.println("\t\t\tVượt quá số lượng hàng có sẵn!");
                        System.out.println();
                    }
                } else {
                    System.out.println("Số lượng phải lớn hơn 0");
                    System.out.println();
                }
            } catch (Exception e){
                System.out.println("Số lượng phải là một số");
            }
        }

        long price = product.getPrice();
        revenue = price * quantityPurchased;
        Payment payment = new Payment(id1, quantityPurchased, revenue);
        if(list.size() == 0){
            list.add(payment);
        }else {
            boolean isUpdate = false;
            boolean isError = false;
            for (Payment payment1: list){
                int idPayment1 = payment1.getId();
                if(idPayment1 == id1){
                    if (quantityPurchased + payment1.getQuantity()> realQuantity){
                        isError = true;
                        break;
                    } else {
                        payment1.setRevenue(payment1.getQuantity() * price);
                        payment1.setQuantity(quantityPurchased + payment1.getQuantity());
                        isUpdate = true;
                    }
                }
            }
            if (isError){
                System.out.println("\t\t\t\tVuợt quá số lượng hàng có sẵn!");
                System.out.println();
                buy();
            } else if (!isUpdate) {
                list.add(payment);
            }
        }
//        option();
    }

    public void option(){
        System.out.println("\t\t\t\tNhập 1 để mua thêm sản phẩm");
        System.out.println("\t\t\t\tNhập 2 để xem tổng tiền");
        System.out.print("\t︻┳═一 ");
//        System.out.println();
        int options = -1;
        try {
            options = Integer.parseInt(scanner.nextLine());
        } catch (Exception e){
            System.out.println("Lựa chọn phải là một số!");
            System.out.println();
        }
                switch (options){
                    case 1:
                        buy();
                        break;
                    case 2:
                        showTotal();
                        break;
                    default:
                        System.out.println("Nhập không đúng vui lòng nhập lại!");
                        option();
                        break;
                }
        option();
    }

    public void showTotal(){
        System.out.println("Danh sách sản phẩm đã mua: ");
        System.out.println("═══════════════════════════");
        long sum = 0;
        for (int i= 0;i< list.size();i++){
            long total;
            total = list.get(i).getQuantity() * productService.findProductById(list.get(i).getId()).getPrice();
            System.out.printf("Tổng tiền bạn mua %s sản phẩm %s :\t %s\n",list.get(i).getQuantity(),
                    productService.findProductById(list.get(i).getId()).getName(), format.format(total));
            sum += total;
        }
        System.out.println("                            ════════════════════════════════");
        System.out.println();
        System.out.println(" ☛ Số tiền cần thanh toán: \t\t\t\t" + format.format(sum));
        System.out.println("═════════════════════════════════════════════════════════");
//        check();
    }

    public void check(){
        System.out.println("Bạn có muốn thanh toán đơn hàng này không?");
        System.out.println("Nhập 1 để thanh toán");
        System.out.println("Nhập 2 để mua lại");
        System.out.print("\t︻┳═一 ");
//        System.out.println();
        int options = -1;
        try {
            options = Integer.parseInt(scanner.nextLine());
        } catch (Exception e){
            System.out.println("Lựa chọn phải là 1 số!");
            System.out.println();
        }
            switch (options){
                case 1:
                    pay();
                    break;
                case 2:
                    list.clear();
                    buy();
                    break;
                default:
                    System.out.println("Nhập không đúng vui lòng nhập lại");
                    break;
            }
        check();

    }

    public void pay(){
        System.out.println(" ☟ Nhập thông tin cá nhân để ship hàng ☟");
        System.out.println("═══════════════════════════════════════════");
        System.out.println("Nhập họ và tên:");
        System.out.println("*Lưu ý tên phải viết hoa chữ cái đầu");
        System.out.print("\t︻┳═一 ");
//        System.out.println();
        name = scanner.nextLine();
        while (!ValidateUtils.isNameValid(name)) {
            System.out.println("Tên " + name + " không đúng định dạng." + " Vui lòng nhập lại!" );
            System.out.println("Nhập tên (vd: Hân Hoàn) ");
            System.out.print("\t︻┳═一 ");
//            System.out.println();
            name = scanner.nextLine();
        }

        System.out.println("Nhập số điện thoại:");
        System.out.println("*Lưu ý số điện thoại bắt đầu bằng số 0 và có 10 - 11 số.");
        System.out.print("\t︻┳═一 ");
//        System.out.println();
        phone = scanner.nextLine();
        while (!ValidateUtils.isPhoneValid(phone)) {
            System.out.println("Số " + phone + " của bạn không đúng định dạng. Vui lòng nhập lại! ");
            System.out.println("Nhập số điện thoại (vd: 0123456789)");
            System.out.print("\t︻┳═一 ");
//            System.out.println();
            phone = scanner.nextLine();
        }

        System.out.println("Nhập địa chỉ (vd: Huế)");
        System.out.print("\t︻┳═一 ");
//        System.out.println();
        address = scanner.nextLine();
        while (!ValidateUtils.isAddressValid(address)) {
            System.out.println("Nhập địa chỉ ");
            System.out.print("\t︻┳═一 ");
            System.out.println();
            address = scanner.nextLine();
        }

        for(Payment payment : list){
            payment.setName(name);
            payment.setPhoneNumber(phone);
            payment.setAddress(address);
        }
        paymentService.add(list);
        for (Payment u : list) {
            int a = u.getId();
            int c =u.getQuantity();
            int b = productService.getQuantity(a);
            productService.updateQuantity(a,b-c);
        }
        productService.checkExist();
        System.out.println("Đặt hàng thành công");
        System.out.println();
        afterPay();

    }
    public void afterPay() {
        System.out.println("Bạn có muốn kiểm tra lại thông tin thanh toán không?");
        System.out.println("1. Kiểm tra lại thông tin đơn hàng");
        System.out.println("2. Thanh toán");
        System.out.println("3. Đặt lại hàng ");
        System.out.println("4. Để thoát");
        System.out.print("\t︻┳═一" );
//        System.out.println();
        int options;
        try {
            options = Integer.parseInt(scanner.nextLine());
            switch (options) {
                case 1:
                    showInformation();
                    break;
                case 2:
                    pay2();
                    break;
                case 3:
                    order();
                    break;
                case 4:
                    System.out.println("∼∼∼∼∼∼∼∼∼∼See you again∽∽∽∽∽∽∽∽∽∽\n\n");
                    exit();
                    break;
                default:
                    System.out.println("Nhập không đúng! Vui lòng nhập lại");
                    check();
                    break;
            }
        } catch (Exception e) {
            System.out.println("\t ❌ lựa chọn phải là 1 số ❌");
            System.out.println();
            check();
        }
    }

        public void showInformation () {
            System.out.println("Thông tin đơn hàng");
            System.out.println("═══════════════════");
            System.out.println("Tên khách hàng: " + list.get(0).getName());
            System.out.println("Số điện thoại: " + list.get(0).getPhoneNumber());
            System.out.println("Địa chỉ: " + list.get(0).getAddress());
//            System.out.println("Sản phẩm đã mua");
            long sum = 0;
            for (int i = 0; i < list.size(); i++) {
                long total;
                total = list.get(i).getQuantity() * productService.findProductById(list.get(i).getId()).getPrice();
                System.out.printf("Sản phẩm đã mua %s ( %s sp) : %s\n",
                        productService.findProductById(list.get(i).getId()).getName(),list.get(i).getQuantity(), format.format(total));
                sum += total;

            }
            System.out.println("________________________________________");
            System.out.println("Số tiền cần thanh toán: " + format.format(sum));
            System.out.println("________________________________________\n\n");
            afterPay();
        }

        public void order(){
            buy();
            pay();
        }
        public void pay2(){
            System.out.println("Chọn hình thức thanh toán:");
            System.out.println("1.Thanh toán qua thẻ");
            System.out.println("2. COD");
            System.out.print("\t︻┳═一" );
            int choice = Integer.parseInt(scanner.nextLine());
            try {
                switch (choice){
                    case 1:
                        showTotal();
                        System.out.println("Bạn vui lòng chuyển khoản đến:");
                        System.out.println(" Agirbank \n 0123456789 \n TRAN HAN HOAN");
                        System.out.println();
                        Thread.sleep(2000);
                        System.out.println("Thanh toán thành công!");
                        System.out.println("Đơn hàng sẽ được giao trong vòng 3 - 5 ngày!");

                        System.out.println();
                        Thread.sleep(2000);
                        afterPay2();
                        break;
                    case 2:
                        System.out.println("Đặt hàng thành công! Đơn hàng sẽ được giao trong vòng 3 - 5 ngày!");
                        afterPay2();
                        break;
                    default:
                        System.out.println("Lựa chọn không đúng vui lòng chọn lại");
                }
            } catch (Exception e ){
                System.out.println("Nhập vào phải là 1 số!");
                pay2();
            }

        }

        public void afterPay2(){
            System.out.println("Bạn muốn tiếp tục không?");
            System.out.println("1. Quay lại menu");
            System.out.println("2. Thoát");
            System.out.print("\t︻┳═一" );
            int choice = Integer.parseInt(scanner.nextLine());
            try {
                switch (choice){
                    case 1:
                        customer();
                        break;
                    case 2:
                        exit();
                        break;
                    default:
                        System.out.println("Lựa chọn không đúng vui lòng nhập lại!");
                        afterPay2();
                        break;
                }
            } catch (Exception e){
                System.out.println("Nhập vào phải là một số!");
            }

        }

//    public static void main(String[] args) {
//       PaymentView paymentView = new PaymentView();
//       paymentView.order();
//    }
}
