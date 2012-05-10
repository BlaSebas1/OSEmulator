/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator.experiments;

import java.awt.Color;
import java.awt.Graphics;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import osemulator.Memory;
import osemulator.OSConstants;
import osemulator.Process;
import osemulator.ProcessTooBigException;

/**
 *
 * @author Omar
 */
public class Drawing_Experiment {
    public static void main(String...args){
        Drawing d = new Drawing();
        d.run();
    }
}
class Drawing{
    private int type = 1;
    private Memory main;
    private LinkedList<Process> queue;
    private JFrame frame;
    
    public void run(){
        String x = JOptionPane.showInputDialog(null, "Enter type of assignment", "1");
        type = Integer.parseInt(x);
        main = new Memory(OSConstants.MEM_SIZE_TEST);
        queue = new LinkedList<Process>();
        startAlgorithm();
        
    }
    public void startAlgorithm(){
        frame = new JFrame();
        frame.setSize(600, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawingPane dp = new DrawingPane();
        frame.add(dp);
        
        while(true){
            try {
                Thread.sleep(OSConstants.SLEEP_TIME);
            } catch (InterruptedException ex) {
                
            }
            dp.repaint();
            main.cpuTime();
            main.sanitize();
            Process x = new Process();
            Process y = new Process();
            if(!queue.isEmpty()){//If there's elements in the queue
                x = queue.pollFirst();
                try{
                    main.addProcess(x,type);
                }catch(ProcessTooBigException ex){
                    System.out.println("MemoryBlock/Process was too big. Sent to queue.");
                    queue.addLast(x);
                    try{
                        main.addProcess(y,type);
                    }catch(ProcessTooBigException ex2){
                        System.out.println("MemoryBlock/Process was too big. Sent to queue.");
                        queue.addLast(y);
                    }
                }
            }else{
                try{
                    main.addProcess(y,type);
                }catch(ProcessTooBigException ex2){
                    System.out.println("MemoryBlock/Process was too big. Sent to queue.");
                    queue.addLast(y);
                }
            }
            
        }
    }
    class DrawingPane extends JPanel{
        @Override
        public void paintComponent(Graphics g){
            LinkedList<Process> processes = main.getProcesses();
            int red     = (int)(Math.random() * 256);
            int green   = (int)(Math.random() * 256);
            int blue    = (int)(Math.random() * 256);
            
            int current = 50;
            
            if(processes.isEmpty()){
                g.setColor(Color.BLACK);
                g.fillRect(50, 200, 500, 100);
            }
            for(Process p : processes){
                int displacement = (p.getProcessSize()*500)/main.getTotalSize();
                if(p.getStatus() == 1){
                    g.setColor(new Color(red,green,blue));
                    g.fillRect(current, 200, displacement, 100);
                    current += displacement;
                }else{
                    g.setColor(Color.BLACK);
                    g.fillRect(current, 200, displacement, 100);
                    current += displacement;
                }
            }
            //g.drawRect(50, 200, 500, 100);
        }
    }
}
