import java.io.IOException;
import java.util.Iterator;

public class List<T> implements Iterable<T>{  // A generic List class
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
        public void remove() {}

        public boolean empty(List list) {
            if(list.size == 0) {
                return true;
            } else {
                return false;
            }
        }

        public int size(List list) {
            List.Node temp = list.front.next;
            String first = list.front.info;
            int size = 0;

            while(temp.info != first) {
                size++;
            }

            size++;
        }

        public void insert(List list, String info) {
            Node n = new Node(obj);
            switch(list.size) {
                case 0:
                {
                    List.Node head = list.new Node(
                            info, null, null);
                    list.front = head;
                    list.size++;
                    break;
                }
                case 1: {
                    List.Node temp = list.new Node(
                            info, list.front, list.front);
                    list.front.next = temp;
                    list.front.prev = temp;
                    list.rear = temp;
                    list.size++;
                    break;
                }
                default:
                {
                    List.Node temp = list.new Node(
                            info, list.front, list.rear);
                        list.front.prev = temp;
                        list.rear.next = temp;
                        list.rear = temp;
                        list.size++;
                        break;
                }
            }
        }

        public T removeFront(int pos) {
            current.prev = null;
            size--;
            return size;
        }

        public T removeRear(int pos) {
            if(current.prev == null) {
                size--;
                return size;
            }
        }
    }
}