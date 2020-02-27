// import java.lang.reflect.Member;
import java.util.Random;

import java.util.*;

public class TestQueue {
    // protected String member = "";
    // protected int n = 0;
    // protected int num = 0;
    // Random rand = new Random();
    
    // public String createMember() {
    //     num = rand.nextInt(5) + 1;
    //     switch(num) {
    //         case 1:
    //             Member m = new Member();
    //             member = m.toString();
    //             break;
    //         case 2:
    //             Student s = new Student();
    //             member = s.toString();
    //             break;
    //         case 3:
    //             Employee e = new Employee();
    //             member = e.toString();
    //             break;
    //         case 4:
    //             Faculty f = new Faculty();
    //             member = f.toString();
    //             break;
    //         case 5:
    //             Staff staff = new Staff();
    //             member = staff.toString();
    //             break;
    //         default:
    //             System.out.println("Error: No members were generated.");
    //             break;
    //     }
    //     return member;
    // }
    public static void main(String args[]) {
        MyQueue<String> queue = new MyQueue<String>();
        // Member m = new Member();

        //queue.enQueue("straight steeeeez");
        //queue.enQueue("fdas");
        //queue.enQueue("ass");
        //queue.enQueue("fuck");
        //queue.enQueue("fuck2");
        //queue.enQueue("fuck3");
        //first one is fuck4
        //queue.enQueue("fuck4");
        //queue.enQueue("fuck5");
        //last one is fuck6
        //queue.enQueue("fuck6");
        //queue.deQueue();   
        queue.front();     
        

        Iterator<String> itr = queue.iterator();
        // int pos = 0;
        while(itr.hasNext()) {
            System.out.println(itr.next() + "");
        }
    }
}