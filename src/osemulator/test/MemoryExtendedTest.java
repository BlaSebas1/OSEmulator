package osemulator.test;

/* * IMPORTS * */
import osemulator.Process;
import osemulator.*;

public class MemoryExtendedTest {
    public static void main(String ... args){
        //Create a memory, size of 1 MB
        Memory main = new Memory(1024);
        
        while(main.getSize() > 0){  //Whilst we have memory left
            main.cpuTime(); //Is this necesary on the first memory allocation?
            Process x = new Process();
            System.out.println("*****Process: " + x.getProcessSize());
            try{
                main.addProcess(x,0);
            }catch(ProcessTooBigException ex){
                System.out.println("MemoryBlock/Process was too big. Ignore.");
            }
            System.out.println("MAIN MEMORY:: Total/Remaining: " + main.getTotalSize() + "/" + main.getSize());
        }
        /**
         * When the main memory is full now we start doing the algorithms of First, Best or Worst allocation.
         * Algorithm for this goes:
         * 
         * For all the time of the simulation do:
         * Subtract time for all processes inside the main memory
         * Check FIFO list if there is a process waiting to be assigned
         *      IF there's a process on list try to fit it inside the main memory
         *          using one of the First,Best,Worst algorithms and remove it from
         *          the FIFO list.
         *          If the process doesn't fits the memory keep on FIFO list.
         *      IF there's not a process on the FIFO list CREATE a new process and
         *          try to fit it inside the main memory using one of the
         *          First,Best,Worst algorithms
         *          It the created process doesn't fits inside the main memory
         *          send to the back of the FIFO list.
         * 
         */
    }
}
