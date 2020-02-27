// import java.lang.reflect.Member;
import java.util.Random;

import java.util.*;

public class TestStack {
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
        MyStack<String> stack = new MyStack<String>();
        // Member m = new Member();

        // lst.addToFront("straight steeeeez");
        // lst.addToFront("fdas");
        // lst.addToFront("ass");
        // lst.addToFront("fuck");
        // lst.addToFront("fuck2");
        // lst.addToFront("fuck3");
        // //first one is fuck4
        // lst.addToFront("fuck4");
        // lst.addToRear("fuck5");
        // //last one is fuck6
        // lst.addToRear("fuck6");
        // lst.removeRear();
        // lst.removeFront();        
        // lst.add(s = new Student().add);
        // stack.push("blah blah");
        // stack.push("yeet");
        // stack.push("top");
        stack.pop();
        // stack.top();

        Iterator<String> itr = stack.iterator();
        // int pos = 0;
        while(itr.hasNext()) {
            System.out.println(itr.next() + "");
        }
    }
}