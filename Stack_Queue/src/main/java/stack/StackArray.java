package stack;

import java.util.Arrays;
import java.util.Stack;

public class StackArray {
    private int arr[];
    private int size;
    private int index = 0;

    public StackArray(int size){
        this.size = size;
        arr = new int[size];
    }

    //kiểm tra đầy
    public boolean isFull(){
        if(index == size){
            return true;
        }
        return false;
    }

    //kiểm tra rỗng
    public boolean isEmpty(){
        if (index == 0){
            return  true;
        }
        return false;
    }

    //thêm phần tử
    public void push(int element){
        if (isFull()){
            throw new StackOverflowError("Stack is full");
        }
        arr[index] = element;
        index++;
    }

    //xóa phần tử
    public int pop() throws Exception {
        if(isEmpty()){
            throw new Exception("Stack is null");
        }
        return arr[--index];
    }

    //lấy size stack
    public int size(){
        return index;
    }

  //  @Override
//    public String toString(){
//        return
//    }

    public static void main(String[] args) throws Exception {
        StackArray stackArray = new StackArray(3);
        stackArray.push(3);
        stackArray.push(5);
        stackArray.push(4);
//        stackArray.push(3);
        System.out.println(stackArray.size);
        System.out.println("1. Size of stack after push operations: " + stackArray.size());
        System.out.println("2. Pop elements from stack: ");

        //duyệt stack
        while (!stackArray.isEmpty()){
            System.out.printf(" %d" , stackArray.pop());
        }

        System.out.println("\n3. Size of stack pop operations: " + stackArray.size());
    }
}
