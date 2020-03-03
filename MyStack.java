public class MyStack<T> extends MyList<T> {
    // Stack's function members and overriding List's insert() and
    // remove member functions so that the two functions will not be
    // called form my stack. All other functions will be inherited here.
    // Don't define inner classes, and related functions, they're inherited.
    /*
    MyStack<T>    MyList<T>       A derived class of MyList 
    //How to hide all insert, remove, add... and remove...
    // so that only puch() pup() top(), empty() size() 
    // can be called from Stack.
    public constructor(s)  // default and copy constructors.
	MyList<T> push( T obj );
	T pop();
	T top(); // return object on top without removing it
    */
    
    // public MyStack(Node head, Node tail, int size) {
    //     this.head = head;
    //     this.tail = tail;
    //     this.size = size;
    // }

    public MyStack() {
        super();
    }

    public MyStack(MyStack<T> myStack) {
        super(myStack);
    }

    // Add the object (Node) to the top
    
    MyList<T> push (T obj) {
        // top in this case = head
        // create new node temp and allocate memory 
        Node node = new Node(obj);
        // check if stack (heap) is full. Then inserting an 
        // element would lead to stack overflow
        if(head == null) {
            node.next = null;
        } else {
            node.next = head;
        }
        head = node;
        // initialize data into temp data field 
        // put top reference into temp link 
        // update top reference 

        return this;
    }

    // These are copy constructors. I'm actually not really sure what these are.

    // Remove object (Node) from the top
    T pop() {
        if (head == null) {
            System.out.println(head);
            System.out.println("Stack is already empty!");
        } else {
            Node temp = head;
            head = temp.next;
            temp = null;
        }
        return null;
    }
    // 
    T top() {
        if (head == null) {
            System.out.println(head);
            System.out.println("Stack is empty!");
        } else {
            Node temp = head;
            System.out.println(temp.data);
            temp = null;
        }
        return null;
    }
    
}