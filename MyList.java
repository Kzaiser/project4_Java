import java.io.IOException;
import java.util.Iterator;

public class MyList<T> implements Iterable<T> {   // A generic List class
    Node head = null, tail = null;
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

        public ListIterator() { current = head; }

        public ListIterator(boolean direction) {
            fwd = direction;
            current = fwd ? head : tail;
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
            switch(size) {
                case 0: {
                addToFront(obj);
                break;
                }
                case 1: {
                    addToRear(obj);
                    break;
                }
                default: {
                    break;
                }
            }

        }

        // public void	insert(C obj, int position);
		// public T remove( int position );
		// public List<T> addToFront ( T obj ); // Return list obj to make cascaded calls.
		// public List<T> addToRear ( T obj );
		// public T removeFront( );
        // public T removeRear( );
        // public T remove( int position) {

        // }

        public MyList<T> addToFront( T obj ) {
            // Allocate new node.
            Node node = new Node(obj);
            //Make next of new node as head and previous as null.
            node.next = head;
            node.prev = null;
            //Change of previous of head node to new node
            if (head != null) {
                head.prev = node;
            }
            // move the head to point to the new node 
            head = node;
            size++;
            return this;
        }

        public MyList<T> addToRear(T obj) {
            //Allocate Node
            //Insert the Data
            Node node = new Node(obj);
            Node last = head; // going to use later, but not too sure how yet.
            //Created node is going to be the last so make next of that node equal to null.
            node.next = null;
            //If the linked list is empty, then make the new node as head
            if(head == null) {
                node.prev = null;
                head = node;
                return this;
            }
            //Else traverse until the last node.
            while (last.next != null) {
                last = last.next;
            }
            //Change the next of last node
            last.next = node;
            //Make last node as previous of new node
            node.prev = last;

            return this;
        }

        public T removeFront() {
            // Check if List is empty
            if(!empty()) {
                Node temp = head.next;
                head = null;
                head = temp;
                if (head != null || tail != null) {
                    temp.next = null;                   
                    head.prev = null;
                    temp = null;
                }
            }
            else { System.out.println("List is empty!"); }
            
            return null;
            
        }

        public T removeRear() {
            return null;
        }

}
