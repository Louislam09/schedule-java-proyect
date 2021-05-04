package schdule;

import Controller.Controller;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

public class Schdule extends javax.swing.JFrame implements java.awt.event.ActionListener,MouseListener {

    EventForm ef = new EventForm(this);
    ViewEvent ve = new ViewEvent(this);
    Controller c = new Controller(this, ef);
    JOptionPane showWarningDialog;

    public Schdule() {
        initComponents();
        this.searchInput.addFocusListener(new FocusListener() {
        @Override
        public void focusGained(FocusEvent e) {
            if (searchInput.getText().equals("Buscar por fecha, nombre o nota...")) {
                searchInput.setText("");
            }
        }
        
        @Override
        public void focusLost(FocusEvent e) {
            if (searchInput.getText().isEmpty()) {
                searchInput.setText("Buscar por fecha, nombre o nota...");
            }

        }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        todayLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        eventListContainer = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        addButton = new javax.swing.JButton();
        fNote = new javax.swing.JRadioButton();
        fDate = new javax.swing.JRadioButton();
        fName = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(5, 40, 83));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(15, 69, 123));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        todayLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        todayLabel.setForeground(new java.awt.Color(255, 255, 255));
        todayLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        todayLabel.setText("AGENDA");
        jPanel2.add(todayLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 330, 60));
        todayLabel.getAccessibleContext().setAccessibleDescription("");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_icon.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 10, 30, 30));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 60));

        jScrollPane2.setBorder(null);
        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setToolTipText("");
        jScrollPane2.setAutoscrolls(true);
        jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setHorizontalScrollBar(null);

        eventListContainer.setBackground(new java.awt.Color(5, 40, 83));
        eventListContainer.setForeground(new java.awt.Color(255, 255, 255));
        eventListContainer.setPreferredSize(new java.awt.Dimension(320, 100));
        eventListContainer.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jScrollPane2.setViewportView(eventListContainer);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, 340, 280));

        searchButton.setBackground(new java.awt.Color(5, 40, 83));
        searchButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/seach_icon1.png"))); // NOI18N
        searchButton.setBorder(null);
        searchButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        searchButton.setVerifyInputWhenFocusTarget(false);
        searchButton.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        jPanel1.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 130, 30, -1));

        searchInput.setBackground(new java.awt.Color(5, 40, 83));
        searchInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchInput.setForeground(new java.awt.Color(255, 255, 255));
        searchInput.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        searchInput.setText("Buscar por fecha, nombre o nota...");
        searchInput.setToolTipText("buscar");
        searchInput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255)));
        searchInput.setCaretColor(new java.awt.Color(255, 255, 255));
        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });
        searchInput.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchInputKeyReleased(evt);
            }
        });
        jPanel1.add(searchInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 270, 40));
        searchInput.getAccessibleContext().setAccessibleName("");

        addButton.setBackground(new java.awt.Color(5, 40, 83));
        addButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addButton.setForeground(new java.awt.Color(5, 40, 83));
        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plusButton.png"))); // NOI18N
        addButton.setAlignmentY(0.0F);
        addButton.setBorder(null);
        addButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        addButton.setIconTextGap(0);
        addButton.setPreferredSize(new java.awt.Dimension(50, 50));
        addButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plusButton.png"))); // NOI18N
        addButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/plusButton_hover1.png"))); // NOI18N
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel1.add(addButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 470, 30, 30));

        fNote.setBackground(new java.awt.Color(5, 40, 83));
        fNote.setForeground(new java.awt.Color(255, 255, 255));
        fNote.setText("Nota");
        fNote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNoteActionPerformed(evt);
            }
        });
        jPanel1.add(fNote, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        fDate.setBackground(new java.awt.Color(5, 40, 83));
        fDate.setForeground(new java.awt.Color(255, 255, 255));
        fDate.setText("Fecha");
        fDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fDateActionPerformed(evt);
            }
        });
        jPanel1.add(fDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, -1, -1));

        fName.setBackground(new java.awt.Color(5, 40, 83));
        fName.setForeground(new java.awt.Color(255, 255, 255));
        fName.setSelected(true);
        fName.setText("Nombre");
        fName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fNameActionPerformed(evt);
            }
        });
        jPanel1.add(fName, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Filtro:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 80, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
       if(this.searchInput.getText().isEmpty()){
            listAllEvent();
            return;
        }
        if(this.fName.isSelected()){
            c.listByName(this.eventListContainer,this.searchInput.getText(),"name");
        }else if(this.fDate.isSelected()){
            c.listByName(this.eventListContainer,this.searchInput.getText(),"date");
        }else{
            c.listByName(this.eventListContainer,this.searchInput.getText(),"note");
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_searchInputActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fDateActionPerformed
        // TODO add your handling code here:
        if(this.fDate.isSelected()){
            this.fName.setSelected(false);
            this.fNote.setSelected(false);
        }
    }//GEN-LAST:event_fDateActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        // TODO add your handling code here:
         if(this.fName.isSelected()){
            this.fDate.setSelected(false);
            this.fNote.setSelected(false);
        }
    }//GEN-LAST:event_fNameActionPerformed

    private void fNoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNoteActionPerformed
        // TODO add your handling code here:
        if(this.fNote.isSelected()){
            this.fDate.setSelected(false);
            this.fName.setSelected(false);
        }
    }//GEN-LAST:event_fNoteActionPerformed

    private void searchInputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchInputKeyReleased
        // TODO add your handling code here:
        if(this.searchInput.getText().isEmpty()){
            listAllEvent();
            return;
        }
        if(this.fName.isSelected()){
            c.listByName(this.eventListContainer,this.searchInput.getText(),"name");
        }else if(this.fDate.isSelected()){
            c.listByName(this.eventListContainer,this.searchInput.getText(),"date");
        }else{
            c.listByName(this.eventListContainer,this.searchInput.getText(),"note");
        }
    }//GEN-LAST:event_searchInputKeyReleased

    public static void main(String args[]) {
        Schdule s = new Schdule();
//      EventForm ef = new EventForm();
//      Controller c = new Controller(s,ef);
        s.setVisible(true);
        s.setLocationRelativeTo(null);
        s.addButton.addActionListener(s);
        s.addButton.setActionCommand("addEventButton");
        s.listAllEvent();
    }

    public void listAllEvent() {
        c.list(this.eventListContainer);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton addButton;
    public javax.swing.JPanel eventListContainer;
    public javax.swing.JRadioButton fDate;
    public javax.swing.JRadioButton fName;
    public javax.swing.JRadioButton fNote;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JButton searchButton;
    public javax.swing.JTextField searchInput;
    private javax.swing.JLabel todayLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        
        switch (command) {
            case "addEventButton":
                c.openForm(ef);
                break;
            default:
                break;
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object command = e.getSource();
        if(command == ef.addEventButton1){
//            System.out.println(ef.addEventButton1.getClientProperty("isOK"));
            if((boolean) ef.addEventButton1.getClientProperty("isOK")){
                listAllEvent();
                this.setVisible(true);
            }
        }

        if(command == ef.backButton){
           this.setVisible(true);
           this.c.clearAllInput();
        }
        
         if(command == ve.backButton){
             System.out.println("nack button");
           this.setVisible(true);
//           this.c.clearAllInput();
        }
       
    }

    @Override
    public void mousePressed(MouseEvent e) {
       
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }
}
