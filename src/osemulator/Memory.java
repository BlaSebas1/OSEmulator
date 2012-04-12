/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Omar
 */
public class Memory {
    //Memory contains a size defined by the user with a top of 10MB
    private int memAvailable;
    private int totalSize;
    LinkedList<Process> processes = new LinkedList<Process>();
    
    Memory(){
        
    }
    public Memory(int size){
        if(size <= OSConstants.MEM_MAX_SIZE){
            this.totalSize  = size;
            this.memAvailable       = size;
        }
        else
            System.out.println("Couldn't assign memory");
    }
    public void cpuTime(){
        for(Process proc : processes){
            if(proc.getStatus() == 1){
                proc.adjustTime(OSConstants.PROC_CPU_TIME);
                if(proc.getTime() <= 0){//If is dead or finished
                    proc.setStatus(0);
                }
            }
        }
    }
    
    public void addProcess(Process proc, int type)throws ProcessTooBigException{
        switch(type){
            case 0: firstprocessCycle(proc); break;
            case 1: firstFit(proc); break;
            case 2: break;
            case 3: break;
        }
    }
    
    public void firstprocessCycle(Process proc) throws ProcessTooBigException{
        if(this.memAvailable >= proc.getProcessSize()){
            proc.setStatus(1);
            processes.add(proc);
            updateMemory();
        }else
            throw new ProcessTooBigException();
    }
    public void firstFit(Process proc) throws ProcessTooBigException{
        
        boolean found = false;
        boolean ex = true;
        if(this.memAvailable >= proc.getProcessSize()){
            proc.setStatus(1);
            proc.setBlockSize(proc.getProcessSize());
            processes.add(proc);
            updateMemory();
        }else{
            for (Process processInList : processes) {
                if(!found){
                    if (processInList.getStatus() != 1) {
                        if (proc.getProcessSize() <= processInList.getProcessSize()) {
                            Process.clone(processInList, proc);
                            processInList.setStatus(1);
                            updateMemory();
                            found = true;
                            ex = false;
                            break;
                        }
                    }
                }
            }
            if(ex) throw new ProcessTooBigException();
        }
    }
    public LinkedList<Process> getProcesses(){return processes;}
    public int getSize(){
        return this.memAvailable;
    }
    public int getTotalSize(){
        return this.totalSize;
    }
    private void subSize(int size){
        if(this.memAvailable >= size)
            this.memAvailable -= size;
        else
            System.out.println("Can't assign size");
    }
    private void updateMemory(){
        int memoryOccupied = 0;
        for(Process proc : processes){
            memoryOccupied += proc.getProcessSize();
        }
        memAvailable = totalSize - memoryOccupied;
    }
    
}
