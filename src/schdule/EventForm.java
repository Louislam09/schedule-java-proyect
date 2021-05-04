package schdule;

import Controller.Controller;
import Model.Event;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;

public class EventForm extends javax.swing.JFrame implements MouseListener {

    Schdule sc;
    Controller c = new Controller(sc,this);
    
    public EventForm(Schdule s) {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.sc = s;
        this.addEventButton1.addMouseListener(this);
        this.addEventButton1.addMouseListener(s);
        this.backButton.addMouseListener(this);
        this.backButton.addMouseListener(s);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        ePlaceInput = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Date date = new Date();
        SpinnerDateModel sm =
        new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
        eEndInput = new javax.swing.JSpinner(sm);
        Date date1 = new Date();
        SpinnerDateModel sm1 =
        new SpinnerDateModel(date1, null, null, Calendar.HOUR_OF_DAY);
        eStartInput = new javax.swing.JSpinner(sm1);
        backButton = new javax.swing.JButton();
        eNameInput1 = new javax.swing.JTextField();
        formTitle = new javax.swing.JLabel();
        underline = new javax.swing.JPanel();
        eDateInput = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        eNoteInput1 = new javax.swing.JTextArea();
        addEventButton = new javax.swing.JPanel();
        addEventButton1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(5, 40, 83));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(15, 69, 123));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NOMBRE");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 80, 24));

        ePlaceInput.setBackground(new java.awt.Color(15, 69, 123));
        ePlaceInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ePlaceInput.setForeground(new java.awt.Color(255, 255, 255));
        ePlaceInput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 102, 102)));
        ePlaceInput.setCaretColor(new java.awt.Color(255, 255, 255));
        ePlaceInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ePlaceInputActionPerformed(evt);
            }
        });
        jPanel2.add(ePlaceInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 250, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("FECHA:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 70, 24));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("DESDE:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 70, 20));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HASTA:");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 410, 70, 20));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("LUGAR");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, 160, 24));

        JSpinner.DateEditor de = new JSpinner.DateEditor(eEndInput, "HH:mm:ss");
        eEndInput.setEditor(de);
        eEndInput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 153, 0)));
        eEndInput.setMinimumSize(new java.awt.Dimension(6, 23));
        eEndInput.setPreferredSize(new java.awt.Dimension(6, 23));
        jPanel2.add(eEndInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 120, 30));

        JSpinner.DateEditor de1 = new JSpinner.DateEditor(eStartInput, "HH:mm:ss");
        eStartInput.setEditor(de1);
        eStartInput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 153, 0)));
        eStartInput.setMinimumSize(new java.awt.Dimension(6, 23));
        eStartInput.setPreferredSize(new java.awt.Dimension(6, 23));
        jPanel2.add(eStartInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 120, 30));

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon1.png"))); // NOI18N
        backButton.setBorder(null);
        backButton.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        backButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        backButton.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon1.png"))); // NOI18N
        backButton.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back_icon_hover.png"))); // NOI18N
        jPanel2.add(backButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 50, 30));

        eNameInput1.setBackground(new java.awt.Color(15, 69, 123));
        eNameInput1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eNameInput1.setForeground(new java.awt.Color(255, 255, 255));
        eNameInput1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(51, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(255, 153, 0), new java.awt.Color(255, 102, 102)));
        eNameInput1.setCaretColor(new java.awt.Color(255, 255, 255));
        eNameInput1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eNameInput1ActionPerformed(evt);
            }
        });
        jPanel2.add(eNameInput1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 250, 30));

        formTitle.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        formTitle.setForeground(new java.awt.Color(255, 255, 255));
        formTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        formTitle.setText("AGREGAR EVENTO");
        formTitle.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel2.add(formTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 220, -1));

        underline.setBackground(new java.awt.Color(255, 102, 102));
        underline.setForeground(new java.awt.Color(38, 194, 255));

        javax.swing.GroupLayout underlineLayout = new javax.swing.GroupLayout(underline);
        underline.setLayout(underlineLayout);
        underlineLayout.setHorizontalGroup(
            underlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 180, Short.MAX_VALUE)
        );
        underlineLayout.setVerticalGroup(
            underlineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel2.add(underline, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 180, 2));

        eDateInput.setBackground(new java.awt.Color(15, 69, 123));

        eDateInput.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, new java.awt.Color(102, 255, 255), new java.awt.Color(102, 255, 255), new java.awt.Color(255, 102, 102), new java.awt.Color(255, 153, 0)));

        eDateInput.setForeground(new java.awt.Color(255, 255, 255));

        eDateInput.setDateFormatString("d/MM/yyy");

        eDateInput.setFocusCycleRoot(true);

        eDateInput.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        eDateInput.setMinimumSize(new java.awt.Dimension(6, 23));

        eDateInput.setPreferredSize(new java.awt.Dimension(6, 23));
        eDateInput.setDate(date);
        jPanel2.add(eDateInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 300, 120, 30));

        jScrollPane1.setBorder(null);

        eNoteInput1.setBackground(new java.awt.Color(15, 69, 123));
        eNoteInput1.setColumns(20);
        eNoteInput1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        eNoteInput1.setForeground(new java.awt.Color(255, 255, 255));
        eNoteInput1.setLineWrap(true);
        eNoteInput1.setRows(5);
        eNoteInput1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nota", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        eNoteInput1.setCaretColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(eNoteInput1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 260, 80));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 460));

        addEventButton.setBackground(new java.awt.Color(38, 194, 255));
        addEventButton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addEventButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        addEventButton1.setForeground(new java.awt.Color(255, 255, 255));
        addEventButton1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addEventButton1.setText("AÑADIR EVENTO");
        addEventButton.add(addEventButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 340, 40));

        jPanel1.add(addEventButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 340, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 501, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 1, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ePlaceInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ePlaceInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ePlaceInputActionPerformed

    private void eNameInput1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eNameInput1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eNameInput1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
    }
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel addEventButton;
    public javax.swing.JLabel addEventButton1;
    public javax.swing.JButton backButton;
    public com.toedter.calendar.JDateChooser eDateInput;
    public javax.swing.JSpinner eEndInput;
    public javax.swing.JTextField eNameInput1;
    public javax.swing.JTextArea eNoteInput1;
    public javax.swing.JTextField ePlaceInput;
    public javax.swing.JSpinner eStartInput;
    private javax.swing.JLabel formTitle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JPanel underline;
    // End of variables declaration//GEN-END:variables

    
    public void setEvent(Event e){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");

        String strDate = e.getDate().split(" ")[0];
        Date date = null;
        try {
            Date startInputValue =(Date)format.parse(e.getStartHour());
            Date endInputValue =(Date)format.parse(e.getEndHour());
            Time ppstime = new Time(startInputValue.getTime());
            Time ppstime2 = new Time(endInputValue.getTime());
            date = sdf.parse(strDate);
            this.eNameInput1.setText(e.getEventName());
            this.eNoteInput1.setText(e.getNote());
            this.ePlaceInput.setText(e.getPlace());
            this.eDateInput.setDate(date);
            this.eStartInput.setValue(ppstime);
            this.eEndInput.setValue(ppstime2);

        } catch (ParseException ex) {
            System.out.println("Somthing when wrong while trying to set the evetn");
            Logger.getLogger(EventForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Object command = e.getSource();

        if(command == this.addEventButton1){
            if("AÑADIR EVENTO".equals(this.addEventButton1.getText())){
                c.saveEvent(this);
            }else{
                int id = (int) this.addEventButton1.getClientProperty("event_id");
                c.updateEvent(this,id);
            }
            
        }
       
       if(command == this.backButton){
          this.dispose();

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
