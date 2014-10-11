package edu.kps.java.datastructures;

/**
 * //TODO: Write class javadoc
 *
 * @author <a href="mailto:prasad.kps@gmail.com">Krishnaprasad Shivdasan</a>
 * Date: 11/5/13
 * Time: 12:12 PM
 */
public interface Stack<T> {

    public void push(T val);
    public T peek();
    public T pop();
    public boolean isFull();
    public boolean isEmpty();
}
