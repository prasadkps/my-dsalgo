package edu.kps.java.datastructures;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:shivkris@yahoo-inc.com">Krishnaprasad Shivdasan</a> Date: 11/6/13 Time: 12:04 AM
 */
public class DNode<T> {
    private  T val;
    private DNode<T> next;
    private DNode<T> prev;

    public DNode(T val) {
        this.val = val;
        next = null;
    }

    public T getVal() {
        return val;
    }

    public void setVal(T val) {
        this.val = val;
    }

    public DNode<T> getNext() {
        return next;
    }

    public void setNext(DNode<T> next) {
        this.next = next;
    }

    public DNode<T> getPrev() {
        return prev;
    }

    public void setPrev(DNode<T> prev) {
        this.prev = prev;
    }

    public String display() {
        return val.toString();
    }

    @Override
    public String toString()
    {
        return "DNode{" +
                "val=" + val +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}