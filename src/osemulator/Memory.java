/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator;

/**
 *
 * @author Omar
 */
public class Memory {
    //La memoria contiene valores como su tamaño que es variable
    private int size;
    private boolean occupied;
    private Process process;
    
    Memory(){
        
    }
    Memory(int size){
        this.size = size;
        this.occupied = false;
    }
    
    public int getSize(){
        return this.size;
    }
    public boolean isOccupied(){
        return this.occupied;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }
    
}
