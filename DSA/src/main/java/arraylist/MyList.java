package arraylist;

import java.util.Arrays;

public class MyList<E> {

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[] ;

    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    public MyList(int capacity){
        this.size = capacity;
        this.elements = new Object[capacity];
    }

    //tạo mảng mới vs độ dài nhân 2
    public void ensureCapacity(){
        int newSize = elements.length * 2;
        elements = Arrays.copyOf(elements, newSize);
    }

    //hiển thị size
    public int size(){
        return this.elements.length;
    }

    //contains tìm kiếm phần tử
    public boolean contains(E o){
        Object[] es = elements;
        if(o== null){
            for (int i = 0;i< elements.length;i++){
                if(es[i] == null){
                    return true;
                }
            }
        } else {
            for (int i=0;i< elements.length;i++){
                if(o.equals(es[i])){
                    return true;
                }
            }
        }
        return false;
    }

    //trả về chỉ số của giá trị
    public int indexOf(E o){
        if(contains(o)){
            for (int i=0;i<elements.length;i++){
                if (elements[i] == o){
                    return i;
                }
            }
        }
        return -1;
    }


    //thêm phần tử vào vị trí index
    public boolean add(int index, E element){
        if(index < 0 || index > size)
            return false;
        if (index == size || size == elements.length){
            ensureCapacity();
        }
        Object[] newArray = new Object[++size];
        for (int i=0;i<size;i++){
            if (i < index) {
                newArray[i] = elements[i];
            } else if (i == index) {
                newArray[i] = element;
            } else {
                newArray[i] = elements[i-1];
            }
        }
        elements = newArray;
        return true;
    }

    public void add(E e){
        if (size == elements.length){
            ensureCapacity();
        }
        elements[size++] = e;
    }

    public boolean remove(int index){
        if (index < 0 || index > size)
            return false;
        Object[] newArray = new Object[size -1];
        for (int i = 0, j = 0; i < size; i++) {
            if (i == index) continue;
            newArray[j++] = elements[i];
        }
        elements = newArray;
        return true;
    }

    public E get (int i){
        if (i>=size || i<0){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i);
        }
        return (E) elements[i];
    }

    public void clear(){
        elements = null;
    }

    @Override
    public String toString(){
        return Arrays.toString(elements);
    }
}
