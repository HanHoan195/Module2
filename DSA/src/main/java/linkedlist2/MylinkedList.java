package linkedlist2;

public class MylinkedList<E> {
    private Node head;
    private int numberNode = 1;

    public MylinkedList(Object data){
        head = new Node(data);
    }
    private class Node{
        private Node next;
        private Object data;

        public Node (Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
        @Override
        public String toString(){
            return "[" + data +"]";
        }
    }

    public int size(){
        return this.numberNode;
    }

    public void add(int index, Object data){
        Node temp = head;
        Node holder;
        for(int i = 0;i<index -1 && temp.next != null;i++){
            temp = temp.next;
        }

        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numberNode++;
    }

    public void addFirst(Object data){
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numberNode++;
    }

    public void addLast(Object data){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = new Node(data);
        numberNode++;
    }

    public Object removeAtPosition(int index){
        Node temp = head;
        for (int i=0;i<index -1 ;i++){
            temp = temp.next;
        }
        numberNode--;
        if (index == 0) return head = temp.next;
        return temp.next = temp.next.next;
    }

    public int indexOf(Object e){
        int index = 0;
        if(e == null){
            for (Node x = head; x != null; x = x.next){
                if (x.data == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = head; x != null; x=x.next){
                if (e.equals(x.data))
                    return index;
                index++;
            }
        }
        return -1;
    }

    public boolean contains(Object e){
        return indexOf(e) >= 0;
    }

    public boolean remove(Object e){
        if (contains(e)){
            removeAtPosition(indexOf(e));
            return true;
        }
        return false;
    }

    public Node get(int index){
        Node temp = head;
        for (int i = 0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    public Node getFirst(){
        return head;
    }

    public Node getLast(){
        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        return temp;
    }
    public void printList(){
        Node temp = head;
        String result = "[";
        do {
            result+=temp.next == null? temp.data: temp.data + ",";
            temp = temp.next;
        } while (temp != null);
        result +="]";
        System.out.println(result);
    }


}
