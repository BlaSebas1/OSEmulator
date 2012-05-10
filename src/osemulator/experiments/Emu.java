/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator.experiments;

import javax.swing.JFrame;

/**
 *
 * @author Omar
 */
public class Emu {

    public static void main(String[] args) {
        new startEmu().init();
    }
}

class startEmu {

    public void init() {
        javax.swing.JFrame frame = new javax.swing.JFrame("OS Emulator");
        frame.add(new MainWindow());
        frame.setSize(710, 510);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
