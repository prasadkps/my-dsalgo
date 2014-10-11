package edu.kps.java.problems;

import edu.kps.java.datastructures.trees.TreeNode;

import java.util.Stack;

/**
 * Created with IntelliJ IDEA.
 * User: kp
 * Date: 12/5/13
 * Time: 1:58 PM
 * Tree is as follows
 *            F
 *         /    \
 *        B      G
 *      /   \     \
 *      A    D    I
 *    /   \       /
 *   C     E     H
 */

public class BSTProblems<T extends Comparable<T>> {


    public static <T> void inOrderRecursive(TreeNode root) {
        if (root == null) return;
        inOrderRecursive(root.left);
        visit(root);
        inOrderRecursive(root.right);
    }

    public static <T> void inOrderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                root = stack.pop();
                visit(root);
                root = root.right;
            }
        }
    }

    public static <T> void preOrderRecursive(TreeNode root) {
        if (root == null) return;
        visit(root);
        preOrderRecursive(root.left);
        preOrderRecursive(root.right);
    }

    public static <T> void preOrderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        while (!stack.empty() || root != null) {
            if (root != null) {
                visit(root);
                if (root.right != null) {
                    stack.push(root.right);
                    root = root.left;
                }
            } else {
                root = stack.pop();
            }
        }
    }

    public static <T> void postOrderRecursive(TreeNode root) {
        if (root == null) return;
        postOrderRecursive(root.left);
        postOrderRecursive(root.right);
        System.out.print(root.data + " ");
    }

    public static <T> void postOrderIterative(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode lastVisited = null;
        while (!stack.empty() || root != null) {
            if (root != null) {
                stack.push(root);
                root = root.left;
            } else {
                TreeNode peekNode = stack.peek();
                if(peekNode.right != null && lastVisited != peekNode.right) {
                    root = peekNode.right;
                } else {
                    stack.pop();
                    visit(peekNode);
                    lastVisited = peekNode;
                }
            }
        }
    }

    private static void visit(TreeNode node) {
        System.out.print(node.data + " ");
    }

    public static TreeNode populateSampleData() {
        TreeNode<Character> root = new TreeNode<>();
        TreeNode<Character> l1 = new TreeNode<>();
        TreeNode<Character> r1 = new TreeNode<>();
        TreeNode<Character> ll2 = new TreeNode<>();
        TreeNode<Character> lr2 = new TreeNode<>();
        TreeNode<Character> rr2 = new TreeNode<>();
        TreeNode<Character> lrl3 = new TreeNode<>();
        TreeNode<Character> lrr3 = new TreeNode<>();
        TreeNode<Character> rrl3 = new TreeNode<>();
        root.data = 'F';
        l1.data = 'B';
        r1.data = 'G';
        ll2.data = 'A';
        lr2.data = 'D';
        lrl3.data = 'C';
        lrr3.data = 'E';
        rr2.data = 'I';
        rrl3.data = 'H';
        root.left = l1;
        root.right = r1;
        l1.left = ll2;
        l1.right = lr2;
        lr2.left = lrl3;
        lr2.right = lrr3;
        r1.right = rr2;
        rr2.left = rrl3;
        return root;
    }


    public static void main(String[] args) {
        TreeNode<Character> root = populateSampleData();
//        inOrderRecursive(root);
//        System.out.println();
//        inOrderIterative(root);
//        System.out.println();
//        preOrderRecursive(root);
//        System.out.println();
//        preOrderIterative(root);
//        System.out.println();
//        postOrderRecursive(root);
//        System.out.println();
        postOrderIterative(root);
        System.out.println();

    }


}
