package osemulator.test;

import osemulator.MemoryBlock;
import osemulator.Process;

/* * IMPORTS * */
public class MemoryBlockTest {
    public static void main(String ... args){        
        //Create several different memory blocks
        MemoryBlock block1   = new MemoryBlock(new Process());
        MemoryBlock block2   = new MemoryBlock(new Process());
        MemoryBlock block3   = new MemoryBlock(new Process());
        MemoryBlock block4   = new MemoryBlock(new Process());
        MemoryBlock block5   = new MemoryBlock(new Process());
        
        //See if memory blocks are created successfully
        System.out.println("Block 1:> Size: " + block1.getBlockSize() +
                                      ", Empty: " + block1.isEmpty() +
                                      ", Process: " + block1.getProcess());
        System.out.println("Block 2:> Size: " + block2.getBlockSize() +
                                      ", Empty: " + block2.isEmpty() +
                                      ", Process: " + block2.getProcess());
        System.out.println("Block 3:> Size: " + block3.getBlockSize() +
                                      ", Empty: " + block3.isEmpty() +
                                      ", Process: " + block3.getProcess());
        System.out.println("Block 4:> Size: " + block4.getBlockSize() +
                                      ", Empty: " + block4.isEmpty() +
                                      ", Process: " + block4.getProcess());
        System.out.println("Block 5:> Size: " + block5.getBlockSize() +
                                      ", Empty: " + block5.isEmpty() +
                                      ", Process: " + block5.getProcess());
    }
}
