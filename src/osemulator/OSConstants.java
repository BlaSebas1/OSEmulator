/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator;

/**
 *
 * @author Omar
 */
public class OSConstants {
    //*******************
    //FOR PROCESSES
    public static final int PROC_MAX_SIZE   = 1025;     //Actually 1024, Size in KB
    public static final int PROC_MAX_TIME   = 101;      //Actually 100
    
    //FOR MEMORY
    public static final int MEM_MAX_SIZE    = 10240;    //Actually 10 MB of memory
    public static final int MEM_PROC_TIME   = 10;       //This is how many time units is gonna be substracted
    public static final int MEM_SIZE_TEST   = 3072;     //Actually 3 MB of memory
    
}
