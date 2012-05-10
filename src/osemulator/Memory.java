/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator;

import java.awt.Graphics;
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
                    proc.setWasted(proc.getProcessSize());
                }
            }
        }
    }
    
    public void addProcess(Process proc, int type)throws ProcessTooBigException{
        switch(type){
            case 0: firstprocessCycle(proc); break;
            case 1: firstFit(proc); break;
            case 2: bestFit(proc);  break;
            case 3: worstFit(proc); break;
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
        int initialWastedMemory = this.totalSize;
        int wastedMemory = 0;
        if(processes.isEmpty()){
            proc.setStatus(1);
            proc.setBlockSize(totalSize);
            proc.setWasted();
            processes.add(proc);
            updateProcesses(proc);
            updateMemory();
        }else{
        for(int i = 0;i<processes.size();i++){
            if(processes.get(i).getStatus() != 1){
                if(processes.get(i).getProcessSize() >= proc.getProcessSize()){
                        wastedMemory = processes.get(i).getProcessSize()- proc.getProcessSize();
                        //if(i==1) initialWastedMemory = wastedMemory;NOT NECESSARY
                        if(wastedMemory <= initialWastedMemory){
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
            updateProcesses(processes.get(place));
            updateMemory();
        }
        }
    }
    public void worstFit(Process proc)throws ProcessTooBigException{
        
        boolean ex = false;
        if (processes.isEmpty()) {
            proc.setStatus(1);
            proc.setBlockSize(totalSize);
            proc.setWasted();
            processes.add(proc);
            updateProcesses(proc);
            updateMemory();
        } else {
            int gap = searchBiggestGap();
            if(gap != -1){
                //add process
                if(proc.getProcessSize() <= processes.get(gap).getProcessSize()){
                    Process.clone(processes.get(gap), proc);
                    processes.get(gap).setStatus(1);
                    updateProcesses(processes.get(gap));
                    updateMemory();
                }else{
                    ex = true;
                }
            }else{
                ex = true;
            }
            if (ex) {
                throw new ProcessTooBigException();
            }
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
    public void output() {
        if(processes.isEmpty()){
            System.out.format("%s,","-EMPTY-");
        }
        for(Process p : processes){
            if(p.getStatus() == 1){
                System.out.format("%07d,",p.getPID());
            }else{
                System.out.format("%s,", "-EMPTY-");
            }
        }
        System.out.println();
        if(processes.isEmpty()){
            System.out.format("%05d%s,",this.memAvailable,"KB");
        }
        for(Process p : processes){
            if(p.getStatus() == 1){
                System.out.format("%05d%s,",p.getProcessSize(),"KB");
            }else{
                System.out.format("%05d%s,",p.getProcessSize(),"KB");
            }
        }
        System.out.println();
    }
    
    
    /********************
    * FOR TESTING ONLY
    ********************/
    public void displayProcesses() {

        if(processes.isEmpty()){
            System.out.format("Block  : %07d, %s, %01d, %03d%n",1,"Empt",0,this.totalSize);
        }
        for(Process p : processes){
            int id = p.getPID();
            int stat = p.getStatus();
            String status = null;
            if(stat != 1 && id == 1){
                status = "Empt";
            }else{
                status = "Busy";
            }
            int time = p.getTime();
            String remainingTime = Integer.toString(time);
            
            int processSize = p.getProcessSize();
            //System.out.println("Process: " + id + "," + status + "," + remainingTime);
            if(stat != 1 && id == 1){
                System.out.format("Block  : %07d, %s, %01d, %03d%n",id,status,time,processSize);
            }else{
                System.out.format("Process: %07d, %s, %01d, %03d%n",id,status,time,processSize);
            }
        }
        System.out.println("********************************");
    }

    private void displayIncommingProcess(Process proc) {
        int id          = proc.getPID();
        String status   = "Not Assigned";
        int size        = proc.getProcessSize();
        int time        = proc.getTime();
        System.out.format("Incomming Process: %07d, %s, %01d, %03d%n", id, status, time, size);
        System.out.println("********************************");
    }

    private int searchBiggestGap() {
        int big = 0;
        int tmp = 0;
        int i = -1;
        for(Process p : processes){
            if(p.getStatus() != 1){
                tmp = p.getProcessSize();
                if(tmp > big){
                    i = processes.indexOf(p);
                    big = tmp;
                }
            }
        }
        return i;
    }


    
    
}
