/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator;

import javax.swing.JFrame;
import osemulator.experiments.MainWindow;

/**
 *
 * @author Omar
 */
public class OSEmulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new startEmu().init();
    }
}
class startEmu {

    public void init() {
        javax.swing.JFrame frame = new javax.swing.JFrame("OS Emulator");
        frame.add(new ViewController());
        frame.setSize(710, 510);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
