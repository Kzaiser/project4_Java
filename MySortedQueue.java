/*
    SortedQueue<T extends Comparable>  extends MyList<T>	A derived class of MyList
    // Here, we need hide some functions
    // so the non-sorted-queue operations
    // are not callables from outside.
    public constructors  // default and copy.
    public SortedQueue<T>enque( T obj ); // Keep queue sorted keys.
    public T deque( T obj);
    T front (); // return object on front or null if S.S is empty. 
*/

public class MySortedQueue<T extends Comparable> extends MyList<T> {
    public MySortedQueue<T> enque ( T obj ) {
        
        return this;
    }
    
    public T deque ( T obj ) {
        return null;
    }

    T front() {
        return null;
    }
}