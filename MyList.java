import java.io.IOException;
import java.util.Iterator;

public class MyList<T> implements Iterable<T>{  // A generic List class
    Node front = null, rear = null;
    int size = 0;

    public Iterator<T> iterator() {
        return new ListIterator(true);
    }

    public Iterator<T> iterator(boolean direction) {
        return new ListIterator( direction );
    }

    protected class Node {    // Inner class Node
        // Node Constructor, data and function members
        T data;
        Node prev = null, next = null;
        public Node ( T dt ) {
            data = dt;
        }
    }
    protected class ListIterator implements Iterator<T>{
        //         ListIterator Iterator<T>      An inner class of MyList
        //         public ListIterator( booleam dir );
        // protected Node currentNode;
        // protected bool forward;
        // public    boolean hasNext();
        // public T  next();
        // public void    remove(); // optional
        //This is done.
        Node current = null;
        boolean fwd = true;

        public boolean hasNext() {
            return current != null;
        }
        public T next() {
            T obj = current.data;
            current = fwd ? current.next : current.prev;
            return obj;
        }

        public ListIterator() { current = front; }

        public ListIterator(boolean direction) {
            fwd = direction;
            current = fwd ? front : rear;
        }

        // optional
        // public void remove() {}
    }

        public boolean empty() {
            return size == 0;
        }

        public int size() {
            return size;
        }

        public void insert(T obj, int position)  {

        }

        // public void	insert(C obj, int position);
		// public T remove( int position );
		// public List<T> addToFront ( T obj ); // Return list obj to make cascaded calls.
		// public List<T> addToRear ( T obj );
		// public T removeFront( );
        // public T removeRear( );
        public T remove( int position) {

        }

        public MyList<T> addToFront( T obj ) {

        }

        public MyList<T> addToRear(T obj) {

        }

        public T removeFront() {
            
        }

        public T removeRear() {

        }

    }
}