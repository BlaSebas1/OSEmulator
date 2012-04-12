/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator;

import java.util.LinkedList;
import java.util.Random;

/**
 *
 * @author Omar
 */
public class Core {
    private LinkedList<Memory> memory;
    private LinkedList<Process> processes;
    /*
    public Core(){
        memory = new LinkedList<Memory>();
        processes = new LinkedList<Process>();
        initialize();
    }

    public long startEmu(){
        long time = System.currentTimeMillis();
        while(System.currentTimeMillis() - time < 3000){
            allocateProcess();
            cleanMemory();
        }
        return time;
    }
    
    private void initialize(){
        createMemory();
        addProcesses(10);
    }
    
    
    private void cleanMemory(){
        for(Memory m : memory){
            if(m.getProcess().getTime() <= 0)
                m = new Memory(m.getSize());
        }
    }
    private void allocateProcess(){
        //Search based on algorithm
        for(int i=0; i<memory.size(); i++){
            if( !memory.get(i).isOccupied()
                && memory.get(i).getSize() >= processes.peekFirst().getSize()){
                memory.get(i).setProcess(processes.peekFirst()); //At this point the process will run for MEM_PROC_TIME units of time
                processes.peekFirst().adjustTime(OSConstants.MEM_PROC_TIME);    System.out.println("Process running.." + processes.peekFirst().getPID());
                try {Thread.sleep(OSConstants.MEM_PROC_TIME);} catch (InterruptedException ex) {}
                processes.addLast(processes.getFirst());
            }
        }
    }
    private void createMemory(){
        //Create 100 blocks of memory
        for(int i=0;i<100;i++){
            int x = new Random().nextInt(OSConstants.MEM_MAX_SIZE) + 1;
            if((x & -x) != x){
                i--; continue;
            }
            memory.add(new Memory(x));
        }
    }
    private void addProcesses(int n){
        for(int i=0;i<n;i++){
            createProcess();
        }
    }
    private void createProcess(){
        //Crear un proceso nuevo y agregarlo a la cola
        Process x = new Process();
        processes.add(x);
    }
    */
}
