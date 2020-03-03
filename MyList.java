import java.io.IOException;
import java.util.Iterator;

public class MyList<T> implements Iterable<T> { // A generic List class
    Node head = null, tail = null;
    int size = 0;

    public Iterator<T> iterator() {
        return new ListIterator(true);
    }

    public Iterator<T> iterator(boolean direction) {
        return new ListIterator(direction);
    }

    public MyList() {
        head = tail = null;
        size = 0;
    }

    // the list object is pointed to head, tail, and size.
    // I believe this is the correct way to do the copy constructor.
    public MyList(MyList<T> myList) {
        myList.head = myList.tail = null;
        myList.size = 0;

    }
    // protected MyList(Node head, Node tail, int size) {
    // this.head = head;
    // this.tail = tail;
    // this.size = size;
    // }
    // Copy Constructor
    // public MyList (MyList<T> myList) {
    // this.head = myList.head;
    // this.tail = myList.tail;
    // this.size = myList.size;
    // }

    // /* Constructor for MyList */

    protected class Node { // Inner class Node
        // Node Constructor, data and function members
        T data;
        Node prev = null, next = null;

        public Node(T dt) {
            data = dt;
        }
    }

    protected class ListIterator implements Iterator<T> {
        // ListIterator Iterator<T> An inner class of MyList
        // public ListIterator( booleam dir );
        // protected Node currentNode;
        // protected bool forward;
        // public boolean hasNext();
        // public T next();
        // public void remove(); // optional
        // This is done.
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

        public ListIterator() {
            current = head;
        }

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

    public void insert(T obj, int position) {
        switch (size) {
            case 0: {
                addToFront(obj);
                break;
            }
            case 1: {
                addToRear(obj);
                break;
            }
            default: {
                Node temp = new Node(obj);
                if (position == 0) {
                    // node.next = head;
                    // head.prev = node;
                    // head = node;
                    addToFront(obj);
                } else if (position == size) {
                    // node.prev = tail;
                    // tail.next = node;
                    // tail = node;
                    addToRear(obj);
                } else {
                    if (position < 0 || position >= size) {
                        throw new IndexOutOfBoundsException();
                    } else {
                        Node current = head;
                        for (int i = 0; i < position; i++) {
                            current = current.next;
                        }
                        Node previous = current.prev;
                        previous.next = temp;

                        temp.prev = previous;
                        temp.next = current;
                        current.prev = temp;
                    }
                }
                size++;
                break;
            }
        }

    }

    // public void insert(C obj, int position);
    // public T remove( int position );
    // public List<T> addToFront ( T obj ); // Return list obj to make cascaded
    // calls.
    // public List<T> addToRear ( T obj );
    // public T removeFront( );
    // public T removeRear( );
    // public T remove( int position) {

    // }

    public MyList<T> addToFront(T obj) {
        // Allocate new node.
        Node node = new Node(obj);
        // Make next of new node as head and previous as null.
        // node.next = head;
        node.prev = null;
        // Change of previous of head node to new node
        if (head != null) {
            // head.prev = node;
            node.next = head;
            head.prev = node;
            head = node;
        } else {
            node.prev = null;
            node.next = null;
            head = node;
        }
        // move the head to point to the new node
        size++;
        return this;
    }

    public MyList<T> addToRear(T obj) {
        // Allocate Node
        // Insert the Data
        Node node = new Node(obj);
        Node last = head; // going to use later, but not too sure how yet.
        // Created node is going to be the last so make next of that node equal to null.
        node.next = null;
        // If the linked list is empty, then make the new node as head
        if (head == null) {
            node.prev = null;
            head = node;
            return this;
        }
        // Else traverse until the last node.
        while (last.next != null) {
            last = last.next;
        }
        // Change the next of last node
        last.next = node;
        // Make last node as previous of new node
        node.prev = last;

        return this;
    }

    public T removeFront() {
        // Check if List is empty
        if (!empty()) {
            Node temp = head;
            // head = null;
            // head = temp;
            if (temp.prev == null && temp.next == null) {
                // temp.next = null;
                // head.prev = null;
                // temp = null;
                head = null;
                temp = null;
            } else {
                head = temp.next;
                head.prev = null;
                temp = null;
            }
            size--;
        } else {
            System.out.println("List is empty!");
        }

        return null;

    }

    public T removeRear() {
        // Check if List is empty
        if (!empty()) {
            // Create temp node to maintain nodes
            Node temp = head;
            // Check if there is only 1 node and delete it
            if (temp.prev == null && temp.next == null) {
                head = null;
                temp = null;
            }
            // else traverse list until the end and delete
            else {
                while (temp.next != null) {
                    temp = temp.next;
                }
                temp.prev.next = null;
                temp = null;
            }
            size--;
        } else {
            System.out.println("List is empty!");
        }

        return null;
    }

}
