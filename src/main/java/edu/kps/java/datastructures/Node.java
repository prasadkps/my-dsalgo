package edu.kps.java.datastructures;

/**
 * // Linked List Node.
 *
 * @author <a href="mailto:prasad.kps@gmail.com">Krishnaprasad Shivdasan</a>
 * Date: 11/5/13
 * Time: 7:37 PM
 */
public class Node<T> {
    private  T val;
    private Node<T> next;

    public Node(T val) {
        this.val = val;
        next = null;
    }

    public T getVal()
    {
        return val;
    }

    public void setVal(T val)
    {
        this.val = val;
    }

    public Node<T> getNext()
    {
        return next;
    }

    public void setNext(Node<T> next)
    {
        this.next = next;
    }

    public String display() {
        return val.toString();
    }

    @Override
    public String toString()
    {
        return "Node{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
    public String printList() {
        Node<T> cur = this;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        do {
            sb.append(cur.getVal()).append(",");
        }while((cur = cur.getNext()) != null);
        sb.setCharAt(sb.length() - 1, ']');
        return sb.toString();
    }
}