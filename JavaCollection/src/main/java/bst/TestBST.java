package bst;

public class TestBST {
    public static void main(String[] args) {
        BST<String> tree = new BST<>();
        tree.insert("Hoàn");
        tree.insert("Pháp");
        tree.insert("Nghĩa");
        tree.insert("Bằng");
        tree.insert("Đạt");
        tree.insert("Thi");
        tree.insert("Hưng");

        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
