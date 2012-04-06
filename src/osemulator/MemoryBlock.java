package osemulator;

/* * IMPORTS * */
public class MemoryBlock {
    private int blockSize;
    private Process process;
    private boolean empty;
    
    public MemoryBlock(Process proc){
        this.process = proc;
        this.blockSize = proc.getSize();
        this.empty = false;
    }

    public int getBlockSize() {
        return blockSize;
    }

    public void setBlockSize(int blockSize) {
        this.blockSize = blockSize;
    }

    public boolean isEmpty() {
        return empty;
    }

    public void setEmpty(boolean empty) {
        this.empty = empty;
    }

    public Process getProcess() {
        return process;
    }

    public void setProcess(Process process) {
        this.process = process;
    }
    
    
    
}
