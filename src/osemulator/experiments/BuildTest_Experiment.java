/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator.experiments;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import osemulator.OSConstants;

/**
 *
 * @author Omar
 */
public class BuildTest_Experiment {
    public static void main(String...args){
        Experiment exp = new Experiment();
    }
}
class Experiment extends JFrame{
    private JLabel proc_max_size;
        private JTextField pms;
    private JLabel proc_max_time;
        private JTextField pmt;
    private JLabel proc_cpu_time;
        private JTextField pct;
        
    private JLabel mem_size;
        private JTextField ms;
    
    
    
    public Experiment(){
        super("Simulacion de Sistema Operativo");
        setSize(600,400);
        initialize();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void initialize() {
        Container content = this.getContentPane();
        JPanel upper = new JPanel();
        upper.setLayout(new BoxLayout(upper, BoxLayout.Y_AXIS));
        upper.setAlignmentY(JPanel.LEFT_ALIGNMENT);
        
        proc_max_size   = new JLabel("Process max. size (KB)");
        proc_max_time   = new JLabel("Process max. time");
        proc_cpu_time   = new JLabel("CPU times per cycle");
        mem_size        = new JLabel("Memory size");
        
        pms = new JTextField("1024",5);
        pmt = new JTextField("100",5);
        pct = new JTextField("10",5);
        ms  = new JTextField("4096",5);
        
        pms.addActionListener(new OSConstantActionListener());
        pmt.addActionListener(new OSConstantActionListener());
        pct.addActionListener(new OSConstantActionListener());
        ms.addActionListener(new OSConstantActionListener());
        
        JPanel one = new JPanel(new FlowLayout());
        JPanel two = new JPanel(new FlowLayout());
        JPanel three = new JPanel(new FlowLayout());
        JPanel four = new JPanel(new FlowLayout());
        
        one.add(proc_max_size);
        one.add(pms);
        two.add(proc_max_time);
        two.add(pmt);
        three.add(proc_cpu_time);
        three.add(pct);
        four.add(mem_size);
        four.add(ms);
        
        upper.add(one);
        upper.add(two);
        upper.add(three);
        upper.add(four);
        
        content.add(upper, BorderLayout.NORTH);
    }
    
    class OSConstantActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try{
                if(e.getSource() == pms){
                    OSConstants.PROC_MAX_SIZE = Integer.parseInt(pms.getText());
                }else if(e.getSource() == pmt){
                    OSConstants.PROC_MAX_TIME = Integer.parseInt(pmt.getText());
                }else if(e.getSource() == pct){
                    OSConstants.PROC_CPU_TIME = Integer.parseInt(pct.getText());
                }else if(e.getSource() == ms){
                    OSConstants.MEM_SIZE_TEST = Integer.parseInt(ms.getText());
                }
            }catch(NumberFormatException nfe){
                JOptionPane.showMessageDialog(null, "Please enter an integer number",
                        "Error on parameter", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }
}
