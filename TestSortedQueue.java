// import java.lang.reflect.Member;
import java.util.Random;

import java.util.*;

public class TestSortedQueue {
    public static void main(String args[]) {
        MySortedQueue<Integer> sQueue = new MySortedQueue<Integer>();
        // Member m = new Member();

        sQueue.enque(3);
        sQueue.enque(2);
        sQueue.enque(1);
        //queue.enQueue("fuck");
        sQueue.enque(4);
        sQueue.deque(3);
        // sQueue.head();
        //queue.enQueue("fuck3");
        //first one is fuck4
        //queue.enQueue("fuck4");
        //queue.enQueue("fuck5");
        //last one is fuck6
        //sQueue.deque("1");
        //queue.deQueue();   
        //sQueue.front();     
        

        Iterator<Integer> itr = sQueue.iterator();
        // int pos = 0;
        while(itr.hasNext()) {
            System.out.println(itr.next() + "");
        }
    }
}