package demo;

public class demo {
    class MyGeneric<T>{
        T obj;
        void add(T obj){
            this.obj = obj;
        }
        T get(){
            return obj;
        }
    }
}
