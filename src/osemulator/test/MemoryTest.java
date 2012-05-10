package osemulator.test;

/* * IMPORTS * */
import osemulator.Memory;

public class MemoryTest {
    public static void main(String ... args){
        //Create several different memories
        Memory fivetwelve   = new Memory(512);
        Memory onemega      = new Memory(1024);
        Memory tenmegas     = new Memory(10240);
        Memory exceed       = new Memory(30720);
        Memory main         = new Memory(3072);
        
        //See if memory was created successfully
        System.out.println("512KB memory:> " + fivetwelve.getSize());
        System.out.println("1MB memory:> " + onemega.getSize());
        System.out.println("10MB memory:> " + tenmegas.getSize());
        System.out.println("exceed memory:> " + exceed.getSize());
        System.out.println("Main memory:> " + main.getSize());
        

    }
}
