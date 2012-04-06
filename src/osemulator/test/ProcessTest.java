package osemulator.test;

/* * IMPORTS * */
import osemulator.Process;

public class ProcessTest {
    public static void main(String ... args){
        //Testing the adecuate creation of processes
        Process one      = new Process();
        Process two      = new Process();
        Process three    = new Process();
        Process four     = new Process();
        Process five     = new Process();
        Process six      = new Process();
        Process seven    = new Process();
        Process eight    = new Process();
        Process nine     = new Process();
        Process ten      = new Process();
        
        //Does the process contains what it should contain?
        System.out.println("Process 1:> Size: " + one.getSize() + " ,Time: " + one.getTime());
        System.out.println("Process 2:> Size: " + two.getSize() + " ,Time: " + two.getTime());
        System.out.println("Process 3:> Size: " + three.getSize() + " ,Time: " + three.getTime());
        System.out.println("Process 4:> Size: " + four.getSize() + " ,Time: " + four.getTime());
        System.out.println("Process 5:> Size: " + five.getSize() + " ,Time: " + five.getTime());
        System.out.println("Process 6:> Size: " + six.getSize() + " ,Time: " + six.getTime());
        System.out.println("Process 7:> Size: " + seven.getSize() + " ,Time: " + seven.getTime());
        System.out.println("Process 8:> Size: " + eight.getSize() + " ,Time: " + eight.getTime());
        System.out.println("Process 9:> Size: " + nine.getSize() + " ,Time: " + nine.getTime());
        System.out.println("Process 10:> Size: " + ten.getSize() + " ,Time: " + ten.getTime());
    }
}
