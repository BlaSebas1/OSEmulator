/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.util.LinkedList;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Omar
 */
public class WorstFit implements Runnable {

    Memory main;
    LinkedList<Process> queue;
    private JFrame frame;

    @Override
    public void run() {
        initialize();
        startAlgorithm();
    }

    public WorstFit() {
    }

    private void initialize() {
        main = new Memory(OSConstants.MEM_SIZE_TEST); //4MB of memory
        queue = new LinkedList<Process>(); //Queue to handle not fitting processes
        OSConstants.TOTAL_PROCESSES = 0;
    }

    private void startAlgorithm() {
        frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(575,175);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        DrawingPane dp = new DrawingPane();
        frame.add(dp);
        
        frame.setLocation(Toolkit.getDefaultToolkit().getScreenSize().width / 2, Toolkit.getDefaultToolkit().getScreenSize().height / 2);
        
        OSConstants.startTime = System.currentTimeMillis();
        while (((System.currentTimeMillis() - OSConstants.startTime) / 1000) < OSConstants.SIM_TIME) {
            try {
                Thread.sleep(OSConstants.SLEEP_TIME);
            } catch (InterruptedException ex) {
            }
            dp.repaint();
            main.cpuTime();
            main.sanitize();
            main.output();
            Process x = new Process();
            Process y = new Process();
            if (!queue.isEmpty()) {//If there's elements in the queue
                x = queue.pollFirst();
                try {
                    main.addProcess(x, 3);
                    OSConstants.TOTAL_PROCESSES += 1;
                } catch (ProcessTooBigException ex) {
                    System.out.println("MemoryBlock/Process was too big. Sent to queue.");
                    queue.addLast(x);
                    try {
                        main.addProcess(y, 3);
                        OSConstants.TOTAL_PROCESSES += 1;
                    } catch (ProcessTooBigException ex2) {
                        System.out.println("MemoryBlock/Process was too big. Sent to queue.");
                        queue.addLast(y);
                    }
                }
            } else {
                try {
                    main.addProcess(y, 3);
                    OSConstants.TOTAL_PROCESSES += 1;
                } catch (ProcessTooBigException ex2) {
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
            int red = 255;
            int green = 255;
            int blue = 255;
            
            int current = 25;
            
            if(processes.isEmpty()){
                g.setColor(Color.BLACK);
                g.fillRect(25, 25, 500, 100);
            }
            for(Process p : processes){
                int displacement = (p.getProcessSize()*500)/main.getTotalSize();
                if(p.getStatus() == 1){
                    g.setColor(new Color(red,green,blue));
                    g.fillRect(current, 25, displacement, 100);
                    current += displacement;
                    g.setColor(Color.RED);
                    g.fillRect(current, 25, 1, 100);
                    current += 1;
                }else{
                    g.setColor(Color.BLACK);
                    g.fillRect(current, 25, displacement, 100);
                    current += displacement;
                    g.setColor(Color.RED);
                    g.fillRect(current, 25, 1, 100);
                    current += 1;
                }
            }
        }
    }
}
