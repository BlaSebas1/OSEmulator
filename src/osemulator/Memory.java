/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator;

import java.util.ArrayList;

/**
 *
 * @author Omar
 */
public class Memory {
    //Memory contains a size defined by the user with a top of 10MB
    private int size;
    private int totalSize;
    ArrayList<MemoryBlock> memBlocks = new ArrayList<MemoryBlock>();
    
    Memory(){
        
    }
    public Memory(int size){
        if(size <= OSConstants.MEM_MAX_SIZE){
            this.totalSize  = size;
            this.size       = size;
        }
        else
            System.out.println("Couldn't assign memory");
    }
    public void addMemoryBlock(MemoryBlock mb)throws MemoryBlockTooBigException{
        if(this.size >= mb.getBlockSize()){ //Its ok to add a new memory block
            memBlocks.add(mb);              //Add block to the list
            subSize(mb.getBlockSize());     //Remove the size
        }else{
            throw new MemoryBlockTooBigException();
        }
    }
    public void cpuTime(){
        for(MemoryBlock mb : memBlocks){
            if(!mb.isEmpty()){
                mb.getProcess().adjustTime(OSConstants.MEM_PROC_TIME);
                if(mb.getProcess().getTime() < 0){
                    mb.setProcess(null);
                }
            }
        }
    }
    
    public int getSize(){
        return this.size;
    }
    public int getTotalSize(){
        return this.totalSize;
    }
    private void subSize(int size){
        if(this.size >= size)
            this.size -= size;
        else
            System.out.println("Can't assign size");
    }
    
}
