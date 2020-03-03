// import java.lang.reflect.Member;
import java.util.Random;

import java.util.*;

public class TestStack {
    static MyStack<Member> stack = new MyStack<Member>();
    static Member m = new Member();
    static Random rand = new Random();
    public static void main(String args[]) {


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
        // stack.pop();
        // stack.top();
        for (int i = 0; i < 10; i++) {
            m = nextMember();
            stack.push(m);
        }

        Iterator<Member> itr = stack.iterator();
        // int pos = 0;
        while(itr.hasNext()) {
            System.out.println(itr.next() + "");
        }
    }
    static Member nextMember() {
        switch (rand.nextInt(5)) {
            case 0:
                return new Member();
            case 1:
                return new Employee();
            case 2:
                return new Student();
            case 3:
                return new Faculty();
            case 4:
                return new Staff();
        }
        return new Member();
    }
}