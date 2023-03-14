package demobientrongjava;

public class Car {
    //biến static
//   public static String firm = "Audi";
//   public static int price = 4000;
//
//    public static void main(String[] args) {
//        System.out.printf("Hãng xe: %s \n", Car.firm);
//        System.out.printf("Giá xe: %s", Car.price);
//    }


    // biến instance
//    public String firm;
//    public double price;
//    public Car(String firm, double price){
//        this.firm = firm;
//        this.price = price;
//    }
//    public void showCar(){
//        System.out.printf("Hãng :" + firm);
//        System.out.printf("\nGiá :" + price);
//    }
//
//    public static void main(String[] args) {
//        Car car = new Car("Audi", 4000);
//        car.showCar();
//    }


    //biến local
    public void showPrice(){
        double P = 4000;
        System.out.printf("Giá là: " + P);
    }

    public static void main(String[] args) {
        Car p = new Car();
        p.showPrice();
    }

}
