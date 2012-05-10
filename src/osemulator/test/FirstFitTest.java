/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator.test;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import osemulator.Memory;
import osemulator.OSConstants;
import osemulator.Process;
import osemulator.ProcessTooBigException;


/**
 *
 * @author Omar
 */
public class FirstFitTest {
    public static void main(String ... args){
        FirstFit ff = new FirstFit();
        ff.initialize();
        ff.startAlgorithm();
    }
}
class FirstFit{
    Memory main;
    LinkedList<Process> queue;
    
    public void initialize(){
        main    = new Memory(OSConstants.MEM_SIZE_TEST); //4MB of memory
        queue   = new LinkedList<Process>(); //Queue to handle not fitting processes
    }
    public void startAlgorithm(){
        long startTime = System.currentTimeMillis();
        while(true){
            try {
                Thread.sleep(OSConstants.SLEEP_TIME);
            } catch (InterruptedException ex) {
                Logger.getLogger(FirstFit.class.getName()).log(Level.SEVERE, null, ex);
            }
            main.output();
            main.cpuTime();
            main.sanitize();
            Process x = new Process();
            Process y = new Process();
            if(!queue.isEmpty()){//If there's elements in the queue
                x = queue.pollFirst();
                try{
                    main.addProcess(x,1);
                }catch(ProcessTooBigException ex){
                    System.out.println("MemoryBlock/Process was too big. Sent to queue.");
                    queue.addLast(x);
                    try{
                        main.addProcess(y,1);
                    }catch(ProcessTooBigException ex2){
                        System.out.println("MemoryBlock/Process was too big. Sent to queue.");
                        queue.addLast(y);
                    }
                }
            }else{
                try{
                    main.addProcess(y,1);
                }catch(ProcessTooBigException ex2){
                    System.out.println("MemoryBlock/Process was too big. Sent to queue.");
                    queue.addLast(y);
                }
            }
            
            
            //System.out.println("MAIN MEMORY:: Total/Remaining: " + main.getTotalSize() + "/" + main.getSize());
        }
    }
}