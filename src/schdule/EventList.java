/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schdule;

/**
 *
 * @author louis
 */
public class EventList extends javax.swing.JPanel {

    /**
     * Creates new form EventList
     */
    public EventList() {
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

        eNoteInput1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        eventList = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        cardTime = new javax.swing.JLabel();
        cardDescr2 = new javax.swing.JLabel();
        cardDescr1 = new javax.swing.JLabel();
        optionButton = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        cardTime1 = new javax.swing.JLabel();
        cardDescr3 = new javax.swing.JLabel();
        cardDescr4 = new javax.swing.JLabel();
        optionButton1 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cardTime2 = new javax.swing.JLabel();
        cardDescr5 = new javax.swing.JLabel();
        cardDescr6 = new javax.swing.JLabel();
        optionButton2 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        cardTime6 = new javax.swing.JLabel();
        cardDescr13 = new javax.swing.JLabel();
        cardDescr14 = new javax.swing.JLabel();
        optionButton6 = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        cardTime7 = new javax.swing.JLabel();
        cardDescr15 = new javax.swing.JLabel();
        cardDescr16 = new javax.swing.JLabel();
        optionButton7 = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        cardTime8 = new javax.swing.JLabel();
        cardDescr17 = new javax.swing.JLabel();
        cardDescr18 = new javax.swing.JLabel();
        optionButton8 = new javax.swing.JButton();

        eNoteInput1.setBackground(new java.awt.Color(15, 69, 123));
        eNoteInput1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eNoteInput1.setForeground(new java.awt.Color(255, 255, 255));
        eNoteInput1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 102, 102)));
        eNoteInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eNoteInput1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("NOTA");

        eventList.setBackground(new java.awt.Color(5, 40, 83));
        eventList.setAutoscrolls(true);
        eventList.setPreferredSize(new java.awt.Dimension(320, 600));
        eventList.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(11, 44, 97));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(38, 194, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 90));

        cardTime.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cardTime.setForeground(new java.awt.Color(255, 255, 255));
        cardTime.setText("7:20AM-8:30AM");
        jPanel3.add(cardTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        cardDescr2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr2.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr2.setText("Luis");
        jPanel3.add(cardDescr2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, -1));

        cardDescr1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr1.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr1.setText("Brekfast catchup with ");
        jPanel3.add(cardDescr1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, -1));

        optionButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/optionButton.png"))); // NOI18N
        optionButton.setBorder(null);
        optionButton.setPreferredSize(new java.awt.Dimension(20, 20));
        optionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButtonActionPerformed(evt);
            }
        });
        jPanel3.add(optionButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 20, 20));

        eventList.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 280, 90));

        jPanel5.setBackground(new java.awt.Color(11, 44, 97));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(255, 66, 171));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 90));

        cardTime1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cardTime1.setForeground(new java.awt.Color(255, 255, 255));
        cardTime1.setText("7:20AM-8:30AM");
        jPanel5.add(cardTime1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        cardDescr3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr3.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr3.setText("Luis");
        jPanel5.add(cardDescr3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, -1));

        cardDescr4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr4.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr4.setText("Brekfast catchup with ");
        jPanel5.add(cardDescr4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, -1));

        optionButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/optionButton.png"))); // NOI18N
        optionButton1.setBorder(null);
        optionButton1.setPreferredSize(new java.awt.Dimension(20, 20));
        optionButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton1ActionPerformed(evt);
            }
        });
        jPanel5.add(optionButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 20, 20));

        eventList.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 280, 90));

        jPanel7.setBackground(new java.awt.Color(11, 44, 97));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel8.setBackground(new java.awt.Color(25, 52, 209));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel7.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 90));

        cardTime2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cardTime2.setForeground(new java.awt.Color(255, 255, 255));
        cardTime2.setText("7:20AM-8:30AM");
        jPanel7.add(cardTime2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        cardDescr5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr5.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr5.setText("Luis");
        jPanel7.add(cardDescr5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, -1));

        cardDescr6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr6.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr6.setText("Brekfast catchup with ");
        jPanel7.add(cardDescr6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, -1));

        optionButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/optionButton.png"))); // NOI18N
        optionButton2.setBorder(null);
        optionButton2.setPreferredSize(new java.awt.Dimension(20, 20));
        optionButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton2ActionPerformed(evt);
            }
        });
        jPanel7.add(optionButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 20, 20));

        eventList.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 280, 90));

        jPanel16.setBackground(new java.awt.Color(11, 44, 97));
        jPanel16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel17.setBackground(new java.awt.Color(38, 194, 255));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel16.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 90));

        cardTime6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cardTime6.setForeground(new java.awt.Color(255, 255, 255));
        cardTime6.setText("7:20AM-8:30AM");
        jPanel16.add(cardTime6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        cardDescr13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr13.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr13.setText("Luis");
        jPanel16.add(cardDescr13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, -1));

        cardDescr14.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr14.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr14.setText("Brekfast catchup with ");
        jPanel16.add(cardDescr14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, -1));

        optionButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/optionButton.png"))); // NOI18N
        optionButton6.setBorder(null);
        optionButton6.setPreferredSize(new java.awt.Dimension(20, 20));
        optionButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton6ActionPerformed(evt);
            }
        });
        jPanel16.add(optionButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 20, 20));
        jPanel16.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        eventList.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 280, 90));

        jPanel18.setBackground(new java.awt.Color(11, 44, 97));
        jPanel18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel19.setBackground(new java.awt.Color(255, 66, 171));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel18.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 90));

        cardTime7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cardTime7.setForeground(new java.awt.Color(255, 255, 255));
        cardTime7.setText("7:20AM-8:30AM");
        jPanel18.add(cardTime7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        cardDescr15.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr15.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr15.setText("Luis");
        jPanel18.add(cardDescr15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, -1));

        cardDescr16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr16.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr16.setText("Brekfast catchup with ");
        jPanel18.add(cardDescr16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, -1));

        optionButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/optionButton.png"))); // NOI18N
        optionButton7.setBorder(null);
        optionButton7.setPreferredSize(new java.awt.Dimension(20, 20));
        optionButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton7ActionPerformed(evt);
            }
        });
        jPanel18.add(optionButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 20, 20));

        eventList.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 280, 90));

        jPanel20.setBackground(new java.awt.Color(11, 44, 97));
        jPanel20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel21.setBackground(new java.awt.Color(25, 52, 209));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );

        jPanel20.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 90));

        cardTime8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cardTime8.setForeground(new java.awt.Color(255, 255, 255));
        cardTime8.setText("7:20AM-8:30AM");
        jPanel20.add(cardTime8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        cardDescr17.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr17.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr17.setText("Luis");
        jPanel20.add(cardDescr17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 210, -1));

        cardDescr18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        cardDescr18.setForeground(new java.awt.Color(255, 255, 255));
        cardDescr18.setText("Brekfast catchup with ");
        jPanel20.add(cardDescr18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, 210, -1));

        optionButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/optionButton.png"))); // NOI18N
        optionButton8.setBorder(null);
        optionButton8.setPreferredSize(new java.awt.Dimension(20, 20));
        optionButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                optionButton8ActionPerformed(evt);
            }
        });
        jPanel20.add(optionButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 20, 20));

        eventList.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, 280, 90));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(eventList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(eventList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void optionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionButtonActionPerformed

    private void optionButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionButton1ActionPerformed

    private void optionButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionButton2ActionPerformed

    private void optionButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionButton6ActionPerformed

    private void optionButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButton7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionButton7ActionPerformed

    private void optionButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_optionButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_optionButton8ActionPerformed

    private void eNoteInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eNoteInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eNoteInput1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel cardDescr1;
    private javax.swing.JLabel cardDescr13;
    private javax.swing.JLabel cardDescr14;
    private javax.swing.JLabel cardDescr15;
    private javax.swing.JLabel cardDescr16;
    private javax.swing.JLabel cardDescr17;
    private javax.swing.JLabel cardDescr18;
    private javax.swing.JLabel cardDescr2;
    private javax.swing.JLabel cardDescr3;
    private javax.swing.JLabel cardDescr4;
    private javax.swing.JLabel cardDescr5;
    private javax.swing.JLabel cardDescr6;
    private javax.swing.JLabel cardTime;
    private javax.swing.JLabel cardTime1;
    private javax.swing.JLabel cardTime2;
    private javax.swing.JLabel cardTime6;
    private javax.swing.JLabel cardTime7;
    private javax.swing.JLabel cardTime8;
    public javax.swing.JTextField eNoteInput1;
    private javax.swing.JPanel eventList;
    public javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton optionButton;
    private javax.swing.JButton optionButton1;
    private javax.swing.JButton optionButton2;
    private javax.swing.JButton optionButton6;
    private javax.swing.JButton optionButton7;
    private javax.swing.JButton optionButton8;
    // End of variables declaration//GEN-END:variables
}
