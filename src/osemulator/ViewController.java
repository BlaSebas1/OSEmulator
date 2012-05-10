/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package osemulator;

import osemulator.experiments.*;
import osemulator.*;

/**
 *
 * @author Omar
 */
public class ViewController extends javax.swing.JPanel {

    /**
     * Creates new form MainWindow
     */
    public ViewController() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        BasicTabbedPane = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        ProcessPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        proc_max_time_basic = new javax.swing.JTextField();
        proc_max_size_basic = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        mem_max_size_basic = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        sim_time_basic = new javax.swing.JTextField();
        sim_slider_basic = new javax.swing.JSlider();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        start_sim_basic = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        firstfit_basic = new javax.swing.JRadioButton();
        bestfit_basic = new javax.swing.JRadioButton();
        worstfit_basic = new javax.swing.JRadioButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        tpa_text = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        ProcessPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Processes properties"));

        jLabel1.setText("Maximum Size (KB)");
        jLabel1.setToolTipText("Max. size for a process");

        jLabel2.setText("Maximum Process Time");
        jLabel2.setToolTipText("Max. process time for execution");

        proc_max_time_basic.setText("100");
        proc_max_time_basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_max_time_basicActionPerformed(evt);
            }
        });
        proc_max_time_basic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                proc_max_time_basicFocusLost(evt);
            }
        });

        proc_max_size_basic.setText("1024");
        proc_max_size_basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                proc_max_size_basicActionPerformed(evt);
            }
        });
        proc_max_size_basic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                proc_max_size_basicFocusLost(evt);
            }
        });

        javax.swing.GroupLayout ProcessPanelLayout = new javax.swing.GroupLayout(ProcessPanel);
        ProcessPanel.setLayout(ProcessPanelLayout);
        ProcessPanelLayout.setHorizontalGroup(
            ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(proc_max_size_basic, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(proc_max_time_basic, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        ProcessPanelLayout.setVerticalGroup(
            ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ProcessPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(proc_max_size_basic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ProcessPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(proc_max_time_basic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Memory Properties"));

        jLabel3.setText("Memory Size (KB)");
        jLabel3.setToolTipText("Memory size for simulation");

        mem_max_size_basic.setText("4096");
        mem_max_size_basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mem_max_size_basicActionPerformed(evt);
            }
        });
        mem_max_size_basic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                mem_max_size_basicFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(mem_max_size_basic, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(mem_max_size_basic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Simulation Properties"));

        jLabel8.setText("Simulation Overall Time");
        jLabel8.setToolTipText("How long is it going to run (seconds)");

        sim_time_basic.setText("5");
        sim_time_basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sim_time_basicActionPerformed(evt);
            }
        });
        sim_time_basic.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                sim_time_basicFocusLost(evt);
            }
        });

        sim_slider_basic.setMajorTickSpacing(400);
        sim_slider_basic.setMaximum(5000);
        sim_slider_basic.setMinimum(100);
        sim_slider_basic.setPaintTicks(true);
        sim_slider_basic.setValue(500);
        sim_slider_basic.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        sim_slider_basic.setInverted(true);
        sim_slider_basic.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                sim_slider_basicStateChanged(evt);
            }
        });

        jLabel10.setText("Simulation Speed:");

        jLabel4.setText("Slower");

        jLabel5.setText("Faster");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sim_slider_basic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(sim_time_basic, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sim_time_basic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sim_slider_basic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)))
        );

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder("Simulation Controls"));

        start_sim_basic.setText("Start Simulation");
        start_sim_basic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                start_sim_basicActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(start_sim_basic)
                .addGap(237, 237, 237))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(start_sim_basic)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Memory Algorithms"));

        buttonGroup1.add(firstfit_basic);
        firstfit_basic.setText("First Fit");

        buttonGroup1.add(bestfit_basic);
        bestfit_basic.setText("Best Fit");

        buttonGroup1.add(worstfit_basic);
        worstfit_basic.setText("Worst Fit");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstfit_basic)
                    .addComponent(bestfit_basic)
                    .addComponent(worstfit_basic))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstfit_basic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bestfit_basic)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(worstfit_basic)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Simulation Stats"));

        jLabel6.setText("Total Processes Attended:");

        tpa_text.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        tpa_text.setText("0");
        tpa_text.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tpa_text))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tpa_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ProcessPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(0, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProcessPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        BasicTabbedPane.addTab("Basic", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 578, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 602, Short.MAX_VALUE)
        );

        BasicTabbedPane.addTab("Advanced", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BasicTabbedPane, javax.swing.GroupLayout.DEFAULT_SIZE, 583, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BasicTabbedPane)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void proc_max_time_basicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_max_time_basicActionPerformed
        // TODO add your handling code here:
        try {
            OSConstants.PROC_MAX_TIME = Integer.parseInt(proc_max_time_basic.getText());
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_proc_max_time_basicActionPerformed

    private void mem_max_size_basicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mem_max_size_basicActionPerformed
        // TODO add your handling code here:
        try {
            OSConstants.MEM_SIZE_TEST = Integer.parseInt(mem_max_size_basic.getText());
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_mem_max_size_basicActionPerformed

    private void proc_max_size_basicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_proc_max_size_basicActionPerformed
        // TODO add your handling code here:
        try {
            OSConstants.PROC_MAX_SIZE = Integer.parseInt(proc_max_size_basic.getText());
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_proc_max_size_basicActionPerformed

    private void start_sim_basicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_start_sim_basicActionPerformed
        // TODO add your handling code here:

        if (!t.isAlive()) {
            tpa = new Thread(new TotalProcessAttended(),"TPA");
            tpa.start();

            if (firstfit_basic.isSelected()) {
                t = new Thread(new FirstFit(),"FirstFit");
                t.start();
            } else if (bestfit_basic.isSelected()) {
                t = new Thread(new BestFit(),"BestFit");
                t.start();
            } else if (worstfit_basic.isSelected()) {
                t = new Thread(new WorstFit(),"WorstFit");
                t.start();
            }
        }
    }//GEN-LAST:event_start_sim_basicActionPerformed

    private void sim_time_basicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sim_time_basicActionPerformed
        // TODO add your handling code here:
        try {
            OSConstants.SIM_TIME = Integer.parseInt(sim_time_basic.getText());
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_sim_time_basicActionPerformed

    private void proc_max_size_basicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_proc_max_size_basicFocusLost
        // TODO add your handling code here:
        try {
            OSConstants.PROC_MAX_SIZE = Integer.parseInt(proc_max_size_basic.getText());
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_proc_max_size_basicFocusLost

    private void proc_max_time_basicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_proc_max_time_basicFocusLost
        // TODO add your handling code here:
        try {
            OSConstants.PROC_MAX_TIME = Integer.parseInt(proc_max_time_basic.getText());
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_proc_max_time_basicFocusLost

    private void mem_max_size_basicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mem_max_size_basicFocusLost
        // TODO add your handling code here:
        try {
            OSConstants.MEM_SIZE_TEST = Integer.parseInt(mem_max_size_basic.getText());
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_mem_max_size_basicFocusLost

    private void sim_time_basicFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_sim_time_basicFocusLost
        // TODO add your handling code here:
        try {
            OSConstants.SIM_TIME = Integer.parseInt(sim_time_basic.getText());
        } catch (NumberFormatException ex) {
        }
    }//GEN-LAST:event_sim_time_basicFocusLost

    private void sim_slider_basicStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_sim_slider_basicStateChanged
        // TODO add your handling code here:
        int sleeptime = sim_slider_basic.getValue();
        OSConstants.SLEEP_TIME = sleeptime;

        if (OSConstants.SLEEP_TIME > OSConstants.stp && (OSConstants.SLEEP_TIME - OSConstants.stp >= 100)) {
            OSConstants.SIM_TIME += 1;
            OSConstants.stp = OSConstants.SLEEP_TIME;
        } else if (OSConstants.SLEEP_TIME < OSConstants.stp && (OSConstants.stp - OSConstants.SLEEP_TIME >= 100)) {
            OSConstants.SIM_TIME -= 1;
            OSConstants.stp = OSConstants.SLEEP_TIME;
        }
        sim_time_basic.setText(String.valueOf(OSConstants.SIM_TIME));
//        
//        System.out.println("Simtime: " + OSConstants.SIM_TIME);
//        System.out.println("Sleeptime:" + OSConstants.SLEEP_TIME);
    }//GEN-LAST:event_sim_slider_basicStateChanged
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane BasicTabbedPane;
    private javax.swing.JPanel ProcessPanel;
    private javax.swing.JRadioButton bestfit_basic;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton firstfit_basic;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JTextField mem_max_size_basic;
    private javax.swing.JTextField proc_max_size_basic;
    private javax.swing.JTextField proc_max_time_basic;
    private javax.swing.JSlider sim_slider_basic;
    private javax.swing.JTextField sim_time_basic;
    private javax.swing.JButton start_sim_basic;
    private javax.swing.JTextField tpa_text;
    private javax.swing.JRadioButton worstfit_basic;
    // End of variables declaration//GEN-END:variables
    private Thread t = new Thread();
    private Thread tpa = new Thread();

    class TotalProcessAttended implements Runnable {
        @Override
        public void run() {
            while(t.isAlive()){
                tpa_text.setText(String.valueOf(OSConstants.TOTAL_PROCESSES));
            }
        }
    }
    
    
}
