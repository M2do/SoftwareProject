/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mathu;
import java.util.Scanner;
import java.util.*;
import java.io.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;

/**
 *
 * @author Papun Gandha
 */
public class SocioNet extends javax.swing.JFrame {

    /**
     * Creates new form SocioNet
     */
    public SocioNet() {
        initComponents();
        Scanner scanner;
        try
        {
            scanner = new Scanner(new File("People.txt"));
            String[] peoplesname = new String[200];
            int counter = 0;
            Container c= new JFrame().getContentPane();
            c.setLayout(null);
            while(scanner.hasNext())
            {
                peoplesname[counter++]=scanner.next();
                //System.out.println(peoplesname[counter-1]+" ");
                /*
                JButton people = new JButton();
                people.setBounds(100,100,100,100);
                people.setVisible(true);
                people.setText(peoplesname[counter-1]);
                c.add(people);*/
                
            }
        }catch(Exception e)
        {
            System.out.println("Sorry can't open");
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Mlogout = new javax.swing.JButton();
        MMathuraTudu = new javax.swing.JButton();
        MPapunGandha = new javax.swing.JButton();
        MSachinKumar = new javax.swing.JButton();
        MDhirajTandi = new javax.swing.JButton();
        MVinaySingh = new javax.swing.JButton();
        MKuldeepSingh = new javax.swing.JButton();
        MRamdasMajhi = new javax.swing.JButton();
        MBikashMohanto = new javax.swing.JButton();
        MBiswajeetBehera = new javax.swing.JButton();
        MSatyajeetSahu = new javax.swing.JButton();
        MRamHansdah = new javax.swing.JButton();
        MRishabhPrakash = new javax.swing.JButton();
        MMyprofile = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 0));
        jLabel1.setText("Silver Spring Club Information System");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 0));
        jLabel2.setText("YOU   HAVE   SUCCESSFULLY    LOGED IN");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("People in This Club");

        Mlogout.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        Mlogout.setForeground(new java.awt.Color(0, 0, 102));
        Mlogout.setText("LOG OUT");
        Mlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MlogoutActionPerformed(evt);
            }
        });

        MMathuraTudu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MMathuraTudu.setForeground(new java.awt.Color(0, 102, 51));
        MMathuraTudu.setText("Mathura Tudu");
        MMathuraTudu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMathuraTuduActionPerformed(evt);
            }
        });

        MPapunGandha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MPapunGandha.setForeground(new java.awt.Color(0, 102, 51));
        MPapunGandha.setText("Papun Gandha");
        MPapunGandha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MPapunGandhaActionPerformed(evt);
            }
        });

        MSachinKumar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MSachinKumar.setForeground(new java.awt.Color(0, 102, 51));
        MSachinKumar.setText("Sachin Kumar");
        MSachinKumar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSachinKumarActionPerformed(evt);
            }
        });

        MDhirajTandi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MDhirajTandi.setForeground(new java.awt.Color(0, 102, 51));
        MDhirajTandi.setText("Dhiraj Tandi");
        MDhirajTandi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDhirajTandiActionPerformed(evt);
            }
        });

        MVinaySingh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MVinaySingh.setForeground(new java.awt.Color(0, 102, 51));
        MVinaySingh.setText("Vinay Singh");
        MVinaySingh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MVinaySinghActionPerformed(evt);
            }
        });

        MKuldeepSingh.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MKuldeepSingh.setForeground(new java.awt.Color(0, 102, 51));
        MKuldeepSingh.setText("Kuldeep Singh");
        MKuldeepSingh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MKuldeepSinghActionPerformed(evt);
            }
        });

        MRamdasMajhi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MRamdasMajhi.setForeground(new java.awt.Color(0, 102, 51));
        MRamdasMajhi.setText("Ramdas Majhi");
        MRamdasMajhi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRamdasMajhiActionPerformed(evt);
            }
        });

        MBikashMohanto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MBikashMohanto.setForeground(new java.awt.Color(0, 102, 51));
        MBikashMohanto.setText("Bikash Mohanto");
        MBikashMohanto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBikashMohantoActionPerformed(evt);
            }
        });

        MBiswajeetBehera.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MBiswajeetBehera.setForeground(new java.awt.Color(0, 102, 51));
        MBiswajeetBehera.setText("Biswajeet Behera");
        MBiswajeetBehera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MBiswajeetBeheraActionPerformed(evt);
            }
        });

        MSatyajeetSahu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MSatyajeetSahu.setForeground(new java.awt.Color(0, 102, 51));
        MSatyajeetSahu.setText("Satyajeet Sahu");
        MSatyajeetSahu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSatyajeetSahuActionPerformed(evt);
            }
        });

        MRamHansdah.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MRamHansdah.setForeground(new java.awt.Color(0, 102, 51));
        MRamHansdah.setText("Ram Hansdah");
        MRamHansdah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRamHansdahActionPerformed(evt);
            }
        });

        MRishabhPrakash.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        MRishabhPrakash.setForeground(new java.awt.Color(0, 102, 51));
        MRishabhPrakash.setText("Risabh Prakash");
        MRishabhPrakash.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MRishabhPrakashActionPerformed(evt);
            }
        });

        MMyprofile.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        MMyprofile.setForeground(new java.awt.Color(0, 102, 0));
        MMyprofile.setText("My Profile");
        MMyprofile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MMyprofileActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 0));
        jLabel5.setText("Search members by name");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 0));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 0));
        jButton2.setText("Available Facilities");

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 102, 0));
        jButton3.setText("Renew Membership ");

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(0, 102, 0));
        jButton4.setText("Update Membership");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(51, 102, 0));
        jButton5.setText("Indoor sports stadium");

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setForeground(new java.awt.Color(51, 102, 0));
        jButton6.setText("Outdoor sports stadium");

        jButton7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton7.setForeground(new java.awt.Color(51, 102, 0));
        jButton7.setText("Transportation service");

        jButton8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(51, 102, 0));
        jButton8.setText("Catering/canteen service");

        jButton9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(51, 102, 0));
        jButton9.setText("Theater hall");

        jButton11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton11.setForeground(new java.awt.Color(51, 102, 0));
        jButton11.setText("Community hall ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(207, 207, 207)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 716, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90)
                        .addComponent(Mlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(536, 536, 536))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(MMyprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(266, 266, 266)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MPapunGandha, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(MRamHansdah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MSatyajeetSahu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MBiswajeetBehera, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MBikashMohanto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MRamdasMajhi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MKuldeepSingh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MVinaySingh, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MDhirajTandi, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MSachinKumar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(MRishabhPrakash, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(MMathuraTudu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(255, 255, 255))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(MMyprofile, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MMathuraTudu, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(MPapunGandha, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MSachinKumar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MDhirajTandi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MVinaySingh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MKuldeepSingh)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(MRamdasMajhi)
                            .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(MBikashMohanto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MBiswajeetBehera)
                        .addGap(14, 14, 14)
                        .addComponent(MSatyajeetSahu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MRamHansdah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(MRishabhPrakash)))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MlogoutActionPerformed
        // TODO add your handling code here:
        new FirstPage().setVisible(true);
        close();
    }//GEN-LAST:event_MlogoutActionPerformed

    private void MKuldeepSinghActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MKuldeepSinghActionPerformed
        // TODO add your handling code here:
        new KuldeepSingh().setVisible(true);
        close();
    }//GEN-LAST:event_MKuldeepSinghActionPerformed

    private void MRishabhPrakashActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRishabhPrakashActionPerformed
        // TODO add your handling code here:
        new RishabhPrakash().setVisible(true);
    }//GEN-LAST:event_MRishabhPrakashActionPerformed
    public void close(){
        WindowEvent winCloseEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winCloseEvent);
    }
    private void MMathuraTuduActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMathuraTuduActionPerformed
        // TODO add your handling code here:
        new MathuraTudu().setVisible(true);
        close();
    }//GEN-LAST:event_MMathuraTuduActionPerformed

    private void MPapunGandhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MPapunGandhaActionPerformed
        // TODO add your handling code here:
        new PapunGandha().setVisible(true);
        close();
    }//GEN-LAST:event_MPapunGandhaActionPerformed

    private void MSachinKumarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSachinKumarActionPerformed
        // TODO add your handling code here:
        new SachinKumar().setVisible(true);
        close();
    }//GEN-LAST:event_MSachinKumarActionPerformed

    private void MDhirajTandiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDhirajTandiActionPerformed
        // TODO add your handling code here:
        new DhirajTandi().setVisible(true);
        close();
    }//GEN-LAST:event_MDhirajTandiActionPerformed

    private void MVinaySinghActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MVinaySinghActionPerformed
        // TODO add your handling code here:
        new VinaySingh().setVisible(true);
        close();
        
    }//GEN-LAST:event_MVinaySinghActionPerformed

    private void MRamdasMajhiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRamdasMajhiActionPerformed
        // TODO add your handling code here:
        new RamdasMajhi().setVisible(true);
        close();
    }//GEN-LAST:event_MRamdasMajhiActionPerformed

    private void MBikashMohantoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBikashMohantoActionPerformed
        // TODO add your handling code here:
        new BikashMohanto().setVisible(true);
        close();
    }//GEN-LAST:event_MBikashMohantoActionPerformed

    private void MBiswajeetBeheraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MBiswajeetBeheraActionPerformed
        // TODO add your handling code here:
        new BiswajeetBehera().setVisible(true);
        close();
    }//GEN-LAST:event_MBiswajeetBeheraActionPerformed

    private void MSatyajeetSahuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSatyajeetSahuActionPerformed
        // TODO add your handling code here:
        new SatyjeetSahu().setVisible(true);
        close();
    }//GEN-LAST:event_MSatyajeetSahuActionPerformed

    private void MRamHansdahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MRamHansdahActionPerformed
        // TODO add your handling code here:
        new RamHansdah().setVisible(true);
        close();
    }//GEN-LAST:event_MRamHansdahActionPerformed

    private void MMyprofileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MMyprofileActionPerformed
        // TODO add your handling code here:
        EnterLogin fromlogin = new EnterLogin();
        String username = fromlogin.getUserName();
        //System.out.println(" name = "+username);
        Scanner scann;
        String[] details = new String[6];
        try
        {
            
            
            scann= new Scanner(new File(username));
            while(scann.hasNext())
            {
                details[0]=scann.next();
                details[1]=scann.next();
                details[2]=scann.next();
                details[3]=scann.next();
                details[4]=scann.next();
                details[5]=scann.next();
            }
            
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Unable To Open","Error Message",JOptionPane.INFORMATION_MESSAGE);
        }
        MathuraTudu myprofile = new MathuraTudu();
        String Fullname = details[0].concat(" ").concat(details[1]);
        myprofile.setmyName(Fullname);
        myprofile.setPhonenumber(details[3]);
        myprofile.setProffession(details[4]);
        myprofile.setPlace(details[5]);
        myprofile.disablenec();
        myprofile.setVisible(true);
        close();
    }//GEN-LAST:event_MMyprofileActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SocioNet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SocioNet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SocioNet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SocioNet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SocioNet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton MBikashMohanto;
    private javax.swing.JButton MBiswajeetBehera;
    private javax.swing.JButton MDhirajTandi;
    private javax.swing.JButton MKuldeepSingh;
    private javax.swing.JButton MMathuraTudu;
    private javax.swing.JButton MMyprofile;
    private javax.swing.JButton MPapunGandha;
    private javax.swing.JButton MRamHansdah;
    private javax.swing.JButton MRamdasMajhi;
    private javax.swing.JButton MRishabhPrakash;
    private javax.swing.JButton MSachinKumar;
    private javax.swing.JButton MSatyajeetSahu;
    private javax.swing.JButton MVinaySingh;
    private javax.swing.JButton Mlogout;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
