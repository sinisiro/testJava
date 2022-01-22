package lib;

public class Node {
    Node left;
    Node right;
    int value;
    public Node (int data) {
        this.value = data;
        this.left = null;
        this.right = null;
    }

    public int getValue() {
        return value;
    }
}