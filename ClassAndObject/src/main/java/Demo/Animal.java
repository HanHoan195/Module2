//package Demo;
//                    // đơn kế thừa
//public class Animal {
//
//    void eat() {
//        System.out.println("eating...");
//    }
//}
//class Dog extends Animal {
//    void bark() {
//        System.out.println("barking...");
//    }
//}
//public class TestInheritance1 {
//    public static void main(String args[]) {
//        Dog d = new Dog();
//        d.bark();
//        d.eat();
//    }
//}
//            // kế thừa nhiều cấp
//
//            class Animal {
//                void eat() {
//                    System.out.println("eating...");
//                }
//            }
//class Dog extends Animal {
//    void bark() {
//        System.out.println("barking...");
//    }
//}
//class BabyDog extends Dog {
//    void weep() {
//        System.out.println("weeping...");
//    }
//}
//public class TestInheritance2 {
//    public static void main(String args[]) {
//        BabyDog d = new BabyDog();
//        d.weep();
//        d.bark();
//        d.eat();
//    }
//}
//            // kế thừa thứ bậc
//
//            class Animal {
//                void eat() {
//                    System.out.println("eating...");
//                }
//            }
//
//class Dog extends Animal {
//    void bark() {
//        System.out.println("barking...");
//    }
//}
//
//class Cat extends Animal {
//    void meow() {
//        System.out.println("meowing...");
//    }
//}
//
//public class TestInheritance3 {
//    public static void main(String args[]) {
//        Cat c = new Cat();
//        c.meow();
//        c.eat();
//        // c.bark(); // compile error
//    }
//}

            // overriding

//            public class Geometric {
//                public String getName(){
//                    return "I am a Geometricobject";
//                }
//            }
//            public class Rectangle extends Geometric {
//                @Override
//                public String getName(){
//                    return "I am a Rectangle object";
//                }
//            }

import java.util.Arrays;

//toString
    class  Animal{
        public static void main(String[]args){
            int[] arr = {1,4,5,7};
            System.out.println(Arrays.toString(arr));
        }
    }


