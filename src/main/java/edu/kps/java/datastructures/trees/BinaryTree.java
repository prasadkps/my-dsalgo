package edu.kps.java.datastructures.trees;

/**
 * Created with IntelliJ IDEA.
 * User: kp
 * Date: 11/28/13
 * Time: 6:03 PM
 */
public class BinaryTree<T extends Comparable<T>> {

    Node<T> root;

    class Node<T extends Comparable<T>> {
        T data;
        Node<T> left;
        Node<T> right;

        public Node(T data) {
            this.data = data;
        }

    }

    public BinaryTree() {
        root = null;
    }

    public void insert(T data) {
        Node<T> node = new Node<>(data);
        if (root == null) {
            root = node;
            return;
        }
        Node cur = root;
        while (cur != null) {
            if (root.left == null) {
                root.left = node;
                break;
            } else if (root.right == null) {
                root.right = node;
                break;
            }
            cur = cur.left;
        }

    }


}
