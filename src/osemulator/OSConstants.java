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
    public static int PROC_MAX_SIZE   = 1025;     //Actually 1024, Size in KB
    public static int PROC_MAX_TIME   = 101;      //Actually 100
    public static int PROC_CPU_TIME   = 10;       //Can be adjusted in real time
    
    //FOR MEMORY
    public static int MEM_MAX_SIZE    = 10240;    //Actually 10 MB of memory
    public static int MEM_SIZE_TEST   = 4096;     //Actually 3 MB of memory
    public static int MEM_ALGORITHM   = 0;
    
    public static int SLEEP_TIME      = 500;
        public static int stp         = 500;
    public static int SIM_TIME        = 5;       //Secs
    public static long startTime      = 0;
    
    /*Statistics*/
    public volatile static int TOTAL_PROCESSES   = 0;
    public static int AVG_MEM_AVAIL     = 0;
    
    
}
