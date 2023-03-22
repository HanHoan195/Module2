package List;

import java.util.Arrays;

public class Mylist<E>{
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    //hàm khởi tạo
    public Mylist(){
        elements = new Object[DEFAULT_CAPACITY];
    }

    //tăng gấp đôi kích thước mảng
    private void ensureCapa(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //phương thức thêm phần tử
    public void add(E e){
        if (size == elements.length){
            ensureCapa();
        }
        elements[size++] = e;
    }

    //get(): trả về phần tử ở vị trí i
    public E get(int i){
        if (i >= size || i < 0){
            throw new IndexOutOfBoundsException("Index: " + i + "Size: " + i);
        }
        return (E) elements[i];
    }

}
