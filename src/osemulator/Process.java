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
    /**
     * Cada proceso consta de minimo las sig caracteristicas:
     * Tamaño (aleatorios y parametrizables)
     * Tiempo Total de Ejecucion (aleatorios y parametrizables)
     * ID Unico o PID
     */
    private int size;
    private int execTime;
    private int pid;
    HashMap<Integer,Integer> pids = new HashMap<Integer,Integer>();
    
    Process(){
        size = sizeAlloc();
        execTime = timeAlloc();
        pid = idAlloc();
    }
    
    private int sizeAlloc(){
        int i = 0;
        Random rand = new Random();
        while(i % 2 != 0){
            i = rand.nextInt(OSConstants.PROC_MAX_SIZE) + 1;
        }
        return i;
    }
    private int timeAlloc(){
        int i = 0;
        Random rand = new Random();
        while(i % 5 != 0 || i % 2 != 0){
            i = rand.nextInt(OSConstants.PROC_MAX_TIME);
        }
        return i;
    }
    private int idAlloc(){
        int i = 1;
        while(pids.containsValue(i))
            i++;
        return i;
    }
    
    public int getSize(){
        return this.size;
    }
    public int getTime(){
        return this.execTime;
    }
    public int getPID(){
        return this.pid;
    }
    public void setTime(int time){
        this.execTime = time;
    }
    public void adjustTime(int time){
        this.execTime -= time;
    }
}
