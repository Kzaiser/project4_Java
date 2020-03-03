import java.util.Iterator;
import java.util.Random;

public class testCopyConstructor {
    static Random rand = new Random();
    public static void main(String args[]) {
        Member m = null, memberCopy = null, updated = null;
        for (int i = 0; i < 25; i++) {
            m = nextMember();
            memberCopy = makeCopy(m);
            updated = makeCopy(m);

            System.out.printf("\t Original Member:  %s \n From Copy Constructor: %s \n\t Changed copy: %s\n\n",
             m.toString(true), memberCopy.toString(true), updated.toString(true));
        }
        // MyList<String> myList = new MyList<String>();
        // Iterator<String> itr = myList.iterator();
        // while(itr.hasNext()) {
        // this.addToRear(new.itr.next().getClass().getName()); can't do this
        // call the make function?
        // you have to use a switch statement similar to the rest class that was given
        // to us.
        //

    }

    static Member makeCopy(Member m) {
        switch (m.getClass().getName()) {
            case "Member":
                return new Member(m);
            case "Student":
                return new Student((Student) m);
            case "Employee":
                return new Employee((Employee) m);
            case "Staff":
                return new Staff((Staff) m);
            case "Faculty":
                return new Faculty((Faculty) m);
        }
        return new Member(m);
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
