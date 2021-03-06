
package schdule;

import Model.Event;
import Model.EventDAO;
import javax.swing.JOptionPane;

public class EventItem extends javax.swing.JPanel {
    EventDAO dao = new EventDAO();
    Schdule sc;
    EventForm ef = new EventForm(sc);
    public EventItem(Schdule s) {
        initComponents();
        this.sc = s;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sideLine = new javax.swing.JPanel();
        cardTime = new javax.swing.JLabel();
        cardNote = new javax.swing.JLabel();
        underline = new javax.swing.JPanel();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        viewButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(11, 44, 97));
        setForeground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(270, 150));
        setPreferredSize(new java.awt.Dimension(260, 150));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sideLine.setBackground(new java.awt.Color(38, 194, 255));

        javax.swing.GroupLayout sideLineLayout = new javax.swing.GroupLayout(sideLine);
        sideLine.setLayout(sideLineLayout);
        sideLineLayout.setHorizontalGroup(
            sideLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        sideLineLayout.setVerticalGroup(
            sideLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );

        add(sideLine, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 10, 120));

        cardTime.setBackground(new java.awt.Color(255, 255, 255));
        cardTime.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cardTime.setForeground(new java.awt.Color(255, 255, 255));
        cardTime.setText("7:20AM - 8:30AM");
        add(cardTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 120, 20));

        cardNote.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        cardNote.setForeground(new java.awt.Color(255, 255, 255));
        cardNote.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        cardNote.setText("Brekfast catchup with ");
        cardNote.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        add(cardNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 260, 60));

        underline.setBackground(new java.awt.Color(38, 194, 255));
        underline.setForeground(new java.awt.Color(38, 194, 255));

        javax.swing.GroupLayout underlineLayout = new javax.swing.GroupLayout(underline);
        underline.setLayout(underlineLayout);
        underlineLayout.setHorizontalGroup(
            underlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 83, Short.MAX_VALUE)
        );
        underlineLayout.setVerticalGroup(
            underlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        add(underline, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 83, 1));

        deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_icon_1.png"))); // NOI18N
        deleteButton.setToolTipText("");
        deleteButton.setBorder(null);
        deleteButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });
        add(deleteButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 10, 20, 20));

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_icon1.jpg"))); // NOI18N
        editButton.setBorder(null);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });
        add(editButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 20, 20));

        viewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view_icon1.png"))); // NOI18N
        viewButton.setBorder(null);
        viewButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        viewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewButtonActionPerformed(evt);
            }
        });
        add(viewButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 10, 20, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int id = (int) this.editButton.getClientProperty("event_id");
        Event cEvent = dao.getEventById(id);
        this.sc.setVisible(false);
        
        this.sc.ef.addEventButton1.setText("EDITAR EVENTO");
        this.sc.ef.addEventButton1.putClientProperty("event_id", id);
        this.sc.ef.addEventButton1.putClientProperty("isOK", true);

        this.sc.ef.setEvent(cEvent);
        this.sc.ef.setLocationRelativeTo(null);
        this.sc.ef.setVisible(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int id = (int) this.deleteButton.getClientProperty("event_id");
        dao.deleteEvent(id);
        this.sc.listAllEvent();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewButtonActionPerformed
        // TODO add your handling code here:
        int id = (int) this.viewButton.getClientProperty("event_id");
        Event cEvent = dao.getEventById(id);
//        this.sc.setVisible(false);

        this.sc.ve.setEvent(cEvent);
        this.sc.ve.setLocationRelativeTo(null);
        this.sc.ve.setVisible(true);
//        JOptionPane.showMessageDialog(null, "EVENT ID " + id + " OPEN");

    }//GEN-LAST:event_viewButtonActionPerformed
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel cardNote;
    public javax.swing.JLabel cardTime;
    public javax.swing.JButton deleteButton;
    public javax.swing.JButton editButton;
    public javax.swing.JPanel sideLine;
    public javax.swing.JPanel underline;
    public javax.swing.JButton viewButton;
    // End of variables declaration//GEN-END:variables
}
