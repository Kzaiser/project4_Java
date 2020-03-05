/*
    SortedQueue<T extends Comparable>  extends MyList<T>	A derived class of MyList
    // Here, we need hide some functions
    // so the non-sorted-queue operations
    // are not callables from outside.
    public constructors  // default and copy.
    public SortedQueue<T>enque( T obj ); // Keep queue sorted keys.
    public T deque( T obj);
    T head (); // return object on head or null if S.S is empty. 
*/

public class MySortedQueue<T extends Comparable> extends MyList<T> {
    public MySortedQueue() {
        super();
        this.head = this.tail = null;
        this.size = 0;
    }

    public MySortedQueue(MySortedQueue<T> mySortQueue) {
        super(mySortQueue);
        head = mySortQueue.head;
        tail = mySortQueue.tail;
        size = mySortQueue.size;
    }


    @SuppressWarnings("unchecked")

    public MySortedQueue<T> enque (T obj) {
        if(empty()) {
            addToFront((T)obj);
            return this;
        }
        if(obj.compareTo(head.data) <= 0) {
            addToFront((T)obj);
            return this;
        }
        if(obj.compareTo(tail.data) > 0) {
            addToRear((T)obj);
            return this;
        }

        Node newNode = new Node(obj);
        Node cur = null;
        for(cur = head.next; obj.compareTo(cur.data) > 0; ) cur = cur.next;
        newNode.next = cur;
        newNode.prev = cur.prev;
        cur.prev.next = newNode;
        cur.prev = newNode;
        size++;
        return this;
    }

    @SuppressWarnings("unchecked")

    public T deque(T obj) {
        Node cur = null;
        if(size == 0) {
            return null;
        }

        if(obj.compareTo(head.data) < 0 || obj.compareTo(tail.data) > 0) 
            return null;
        if(obj.compareTo(head.data) == 0) {
            removeFront();
            return obj;
        }
        if(obj.compareTo(tail.data) == 0) {
            removeRear();
            return obj;
        }
        for(cur = head.next; obj.compareTo(cur.data) > 0; cur = cur.next);
        if(obj.compareTo(cur.data) == 0){
            removeFront();
            return (T)obj;
        }
        return null;
    }

    public MySortedQueue<T> head() {
        if(head == null) {
            System.out.println(head);
            System.out.println("SQueue is empty!");
        }
        else {
            Node temp = head;
            System.out.println(temp.data);
            temp = null;
        }
        return null;
    }
}