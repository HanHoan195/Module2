public class TestStaticPropety {
    public static void main(String[] args) {
        Car car1 = new Car("Mazda3", "Skyacti3");
        System.out.println(Car.numberOfCar);
        Car car2 = new Car("Mazda6", "Skyacti6");
        System.out.println(Car.numberOfCar);
        Car car3 = new Car("e", "f");
        System.out.println(Car.numberOfCar);


    }
}
