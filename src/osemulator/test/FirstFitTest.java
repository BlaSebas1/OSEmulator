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
        
        //First Run of memory
        /*
        while(main.getSize() >= 10){  //Whilst we have memory left
            main.cpuTime(); //Is this necesary on the first memory allocation?
            Process x = new Process();
            System.out.println("*****Process: " + x.getProcessSize());
            try{
                main.addProcess(x,0);
            }catch(ProcessTooBigException ex){
                System.out.println("MemoryBlock/Process was too big. Sent to queue.");
                queue.addLast(x);
            }
            System.out.println("MAIN MEMORY:: Total/Remaining: " + main.getTotalSize() + "/" + main.getSize());
        }
        */
    }
    public void startAlgorithm(){
        long startTime = System.currentTimeMillis();
        while(true){//System.currentTimeMillis() - startTime < 10000
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
            main.displayProcesses();
            try {
                Thread.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(FirstFit.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}