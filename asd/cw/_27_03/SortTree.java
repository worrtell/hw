package asd.cw._27_03;

import java.util.function.Consumer;
// для количества шагов новую переменную
public class SortTree {
    private Node root;

    public static void main(String[] args) {
        SortTree a = new SortTree();
        a.root = new Node(7);
        a.root.left = new Node(5);
        a.root.right = new Node(10);

        a.add(new Node(3), a.root);
        a.add(new Node(11), a.root);
        a.showReccurentl1(a.root,node -> System.out.println(node.value));
    }

    public void add(Node temp, Node node) {
        if (temp.value <= node.value) {
            System.out.println("left");
            if (node.left == null) {
                node.left = temp;
                return;
            }
            add(temp,node.left);
        }
        else {
            if (node.right == null) {
                node.right = temp;
                return;
            }
            add(temp,node.right);
        }
    }

    public void showReccurentl1(Node node, Consumer<Node> consumer) {
        if (node.left != null) showReccurentl1(node.left, consumer);
        consumer.accept(node);
        if (node.right != null) showReccurentl1(node.right, consumer);
    }

    public static class Node {
        Node left;
        Node right;
        int value;
        public Node(int value) {
            this.value = value;
        }
    }
}
