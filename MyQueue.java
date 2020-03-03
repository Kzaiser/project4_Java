public class MyQueue<T> extends MyList<T> {

    public MyQueue() {
        head = tail = null;
        size = 0;
    }

    public MyQueue(MyQueue<T> myQueue) {
        myQueue.head = myQueue.tail = null;
        myQueue.size = 0;
    }
    public MyQueue<T> enQueue(T obj) {
        //addToRear(obj);
        Node node = new Node(obj);
        if(tail == null) {
            head = node;
            tail = node;
        }
        else {
            tail.next = node;
            tail = node;
        }
        return this;
    }

    public MyQueue<T> deQueue() {
        //removeFront();
        if(head == null) {
            System.out.println("Queue is empty!");
        }
        else {
            Node temp = head;
            head = temp.next;
            //head.prev = null;
            temp = null;
        }
        return null;
    }

    public MyQueue<T> display() {
        if(head == null) {
            System.out.println("Queue is empty!");
        }
        else {
            Node temp = head;
            while(temp.next != null) {
                System.out.println(temp.data);
            }
        }
        return this;
    }

    public MyQueue<T> front() {
        if(head == null) {
            System.out.println(head);
            System.out.println("Queue is empty!");
        }
        else {
            Node temp = head;
            System.out.println(temp.data);
            temp = null;
        }
        return this;
    }
}