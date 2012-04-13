/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator;

import java.util.HashMap;
import java.util.Random;

/**
 *
 * @author Omar
 */
public class Process {

    static void clone(Process processInList, Process proc) {
        //processInList.blockSize; Remains the same due to its basically a block
        processInList.execTime      = proc.execTime;
        processInList.pid           = proc.pid;
        processInList.processSize   = proc.processSize;
        processInList.status        = proc.status;
        processInList.wastedSpace   = processInList.blockSize - proc.processSize;
    }
    /**
     * Cada proceso consta de minimo las sig caracteristicas:
     * Tamaño (aleatorios y parametrizables)
     * Tiempo Total de Ejecucion (aleatorios y parametrizables)
     * ID Unico o PID
     */
    private int processSize;
    private int blockSize;
    private int execTime;
    private int pid; //Temporalmente no en uso
    private int wastedSpace;
    private int status;
    private static HashMap<Integer,Integer> pids = new HashMap<Integer,Integer>();
                //0 - Dead
                //1 - Alive
                //-1 - Inactive
    
    public Process(){
        processSize = sizeAlloc();
        blockSize = processSize;
        execTime = timeAlloc();
        pid = allocatePID(); //Temporald
        
    }
    public Process(int block){
        this.blockSize = block;
        processSize = block;
        execTime = 0;
        pid = pid + 1;
    }
    
    private int sizeAlloc(){
        int i = 1;
        Random rand = new Random();
        i = rand.nextInt(OSConstants.PROC_MAX_SIZE) + 1;
        while(i <= 10){
            i = rand.nextInt(OSConstants.PROC_MAX_SIZE) + 1; //Indica que regresa un entero entre 0 y PROC_MAX_SIZE
        }
        return i;
    }
    private int timeAlloc(){
        int i = 1;
        Random rand = new Random();
        while(i % 5 != 0 || i % 2 != 0){
            i = rand.nextInt(OSConstants.PROC_MAX_TIME);
        }
        return i;
    }
    
    public int getStatus(){
        return this.status;
    }
    public int getProcessSize(){
        return this.processSize;
    }
    public int getTime(){
        return this.execTime;
    }
    public void setBlockSize(int size){
        this.blockSize = size;
    }
    public void setStatus(int stat){
        this.status = stat;
    }
    public void setTime(int time){
        this.execTime = time;
    }
    public void adjustTime(int time){
        this.execTime -= time;
    }

    public int getWastedSpace() {
        return wastedSpace;
    }

    void update() {
        this.blockSize = this.processSize;
    }

    void setWasted() {
        this.wastedSpace = this.blockSize - this.processSize;
    }

    private int allocatePID() {
        int pid = (int) (Math.random() * 100000 + 1);
        while(pids.containsValue(Integer.valueOf(pid))){
            pid = (int) (Math.random() * 100000 + 1);
        }
        return pid;
    }

}
