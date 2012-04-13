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
            case 2: bestFit(proc);  break;
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
        if(processes.isEmpty()){
            proc.setStatus(1);
            proc.setBlockSize(totalSize);
            proc.setWasted();
            processes.add(proc);
            updateProcesses(proc);
            updateMemory();
        }else{
            for (Process processInList : processes) {
                if(!found){
                    if (processInList.getStatus() != 1) {
                        if (proc.getProcessSize() <= processInList.getProcessSize()) {
                            Process.clone(processInList, proc);
                            processInList.setStatus(1);
                            updateProcesses(processInList);
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
    public void bestFit(Process proc) throws ProcessTooBigException{
        boolean ex = true;
        int place = 0;
        int initialWastedMemory = 0;
        int wastedMemory = 0;
        if(this.memAvailable >= proc.getProcessSize()){
            proc.setStatus(1);
            proc.setBlockSize(proc.getProcessSize());
            processes.add(proc);
            updateMemory();
        }else{
        for(int i = 0;i<processes.size();i++){
            if(processes.get(i).getStatus() != 1){
                if(processes.get(i).getProcessSize() >= proc.getProcessSize()){
                        wastedMemory = processes.get(i).getProcessSize()- proc.getProcessSize();
                        if(i==0) initialWastedMemory = wastedMemory;
                        if(wastedMemory<initialWastedMemory){
                            initialWastedMemory = wastedMemory;
                            place = i;
                            ex = false;
                        }
                }
            }
        }
        if(ex){
            throw new ProcessTooBigException();
        }else{
            Process.clone(processes.get(place), proc);
            processes.get(place).setStatus(1);
            updateMemory();
        }
        }
    }
    public void worstFit(Process proc){
        
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
            if(proc.getStatus() == 1)
                memoryOccupied += proc.getProcessSize();
        }
        memAvailable = totalSize - memoryOccupied;
    }

    private void updateProcesses(Process processInList) {
        Process temp = new Process(processInList.getWastedSpace());
        processInList.update();
        processes.add(processes.indexOf(processInList) + 1, temp);

    }

    public void sanitize() {
        for(int i=0; i<processes.size() - 1; i++){
            Process current = processes.get(i);
            Process next    = processes.get(i + 1);
            if( (current.getStatus() == 0) && (next.getStatus() == 0) ){//IF the current block and the next to it is empty
                Process temp = new Process(current.getProcessSize() + next.getProcessSize());
                processes.set(i, temp);
                processes.remove(next);
                i--;
            }
        }
        updateMemory();
    }
    
}
