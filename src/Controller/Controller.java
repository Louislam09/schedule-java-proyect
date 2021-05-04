
package Controller ;

import Model.Event;
import Model.EventDAO;
import java.awt.Color;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
import schdule.Schdule;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import schdule.EventForm;
import schdule.EventItem;


public class Controller {
    EventDAO dao = new EventDAO();
    Event e = new Event();
    Schdule sc; 
    DefaultTableModel model = new DefaultTableModel();
    EventForm ef;
    int currentColorNumber = 0;
    Color[] colors = {Color.decode("#26C2FF"),Color.decode("#FF42AB"),Color.decode("#1934D1")};

    public Controller(Schdule s,EventForm ef){
        this.sc = s;
        this.ef = ef;
    }

    public Controller() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String validateName(String value){
        String s;
        if(value.length() > 20) {
            s="No nombre del evento debe\nser menor a 20 caracteres";
        }else{
            s="";
        }
        return s;
    }
    
    public String isValid(String v,String fName){
        String s;
        if(v.length() == 0){
            s = "El campo " + fName + " es requerido";
        }else{
            s="";
        }
        return s;
    }
    
    public void saveEvent(EventForm e){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat tdf = new SimpleDateFormat("HH:mm:ss");
        
        if(isValid(getValue(e.eNameInput1),"nombre")!= ""){
            JOptionPane.showMessageDialog(null,isValid(getValue(e.eNameInput1),"nombre") );
            e.addEventButton1.putClientProperty("isOK", false);
        }else if(validateName(getValue(e.eNameInput1)) != ""){
            JOptionPane.showMessageDialog(null,validateName(getValue(e.eNameInput1)) );
            e.addEventButton1.putClientProperty("isOK", false);
        }else if(isValid(e.eNoteInput1.getText(),"nota") != ""){
            JOptionPane.showMessageDialog(null,isValid(e.eNoteInput1.getText(),"nota") );
            e.addEventButton1.putClientProperty("isOK", false);
        }else if(isValid(getValue(e.ePlaceInput),"lugar") != ""){
            JOptionPane.showMessageDialog(null,isValid(getValue(e.ePlaceInput),"lugar") );
            e.addEventButton1.putClientProperty("isOK", false);
        }else{
            String dt = sdf.format(e.eDateInput.getDate());
            Event ev = new Event(getValue(e.eNameInput1), e.eNoteInput1.getText(),
                    dt, tdf.format(e.eStartInput.getValue()), 
                    tdf.format(e.eEndInput.getValue()), getValue(e.ePlaceInput));

            e.addEventButton1.putClientProperty("isOK", true);
            dao.saveEvent(ev);
            clearAllInput();
            e.dispose();
        }

        
    }
    
    public void updateEvent(EventForm e, int id){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat tdf = new SimpleDateFormat("HH:mm:ss");

        String dt = sdf.format(e.eDateInput.getDate());
        Event ev = new Event(getValue(e.eNameInput1), e.eNoteInput1.getText(),
                dt, tdf.format(e.eStartInput.getValue()), 
                tdf.format(e.eEndInput.getValue()), getValue(e.ePlaceInput));
       
        dao.updateEvent(ev,id);
        clearAllInput();
        e.dispose();
    }
    
    public void list(JPanel container){
        container.removeAll();
        List<Event> l = dao.listEvents();
        
        if(!l.isEmpty()){
            int currentPos = -150;
            for (Event event : l) {
                currentPos += 150; 
                EventItem item = new EventItem(this.sc);
                String msg = "<html><p>" + event.getEventName() + "</p></html>";

                item.deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_icon_"+(currentColorNumber+1)+".png"))); 
                item.deleteButton.putClientProperty("event_id", Integer.valueOf(event.getId()));

                item.editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_icon"+(currentColorNumber+1)+".jpg"))); 
                item.editButton.putClientProperty("event_id", Integer.valueOf(event.getId()));

                item.viewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view_icon"+(currentColorNumber+1)+".png"))); 
                item.viewButton.putClientProperty("event_id", Integer.valueOf(event.getId()));

                item.sideLine.setBackground(colors[currentColorNumber]);
                item.cardNote.setText(msg);
                item.cardTime.setText(event.getStartHour() + " - "+ event.getEndHour());

                container.setPreferredSize(new java.awt.Dimension(container.getWidth(), container.getHeight()+150));
                container.add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, currentPos, 300, 120));
                container.updateUI();

                currentColorNumber +=1;
                if(currentColorNumber > 2) currentColorNumber = 0;
            }
        }else{
            int currentPos = -150;
            currentPos += 150; 
            EventItem item = new EventItem(this.sc);
            String msg = "NO HAY EVENTO";
            item.remove(item.deleteButton);
            item.remove(item.editButton);
            item.remove(item.viewButton);

            item.sideLine.setBackground(colors[currentColorNumber]);
            item.cardNote.setText(msg);
            item.cardTime.setText("");

            container.setPreferredSize(new java.awt.Dimension(container.getWidth(), container.getHeight()+150));
            container.add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, currentPos, 300, 120));
            container.updateUI();

            currentColorNumber +=1;
            if(currentColorNumber > 2) currentColorNumber = 0;
        }
        
        
    }
    
    public void listByName(JPanel container,String param,String filter){
        container.removeAll();
        List<Event> events;
        
        switch (filter) {
            case "name":
                events = dao.getEventByFilter(param,"event_name");
                break;
            case "note":
                events = dao.getEventByFilter(param,filter);
                break;
            default:
                events = dao.getEventByFilter(param,filter);
                break;
        }
        

        if(events.isEmpty()){
            int currentPos = -150;
            currentPos += 150; 
            EventItem item = new EventItem(this.sc);
            String msg = "NO HAY EVENTO";
            item.remove(item.deleteButton);
            item.remove(item.editButton);
            item.remove(item.viewButton);

            item.sideLine.setBackground(colors[currentColorNumber]);
            item.cardNote.setText(msg);
            item.cardTime.setText("");

            container.setPreferredSize(new java.awt.Dimension(container.getWidth(), container.getHeight()+150));
            container.add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, currentPos, 300, 120));
            container.updateUI();

            currentColorNumber +=1;
            if(currentColorNumber > 2) currentColorNumber = 0;
        }else{
           int currentPos = -150;
            for (Event event : events) {
                currentPos += 150; 
                EventItem item = new EventItem(this.sc);
                String msg = "<html><p>" + event.getEventName() + "</p></html>";

                item.deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_icon_"+(currentColorNumber+1)+".png"))); 
                item.deleteButton.putClientProperty("event_id", Integer.valueOf(event.getId()));

                item.editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_icon"+(currentColorNumber+1)+".jpg"))); 
                item.editButton.putClientProperty("event_id", Integer.valueOf(event.getId()));

                item.viewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view_icon"+(currentColorNumber+1)+".png"))); 
                item.viewButton.putClientProperty("event_id", Integer.valueOf(event.getId()));

                item.sideLine.setBackground(colors[currentColorNumber]);
                item.cardNote.setText(msg);
                item.cardTime.setText(event.getStartHour() + " - "+ event.getEndHour());

                container.setPreferredSize(new java.awt.Dimension(container.getWidth(), container.getHeight()+150));
                container.add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, currentPos, 300, 120));
                container.updateUI();

                currentColorNumber +=1;
                if(currentColorNumber > 2) currentColorNumber = 0;
            }
        }
    }
    
    public void addNewEventToList(Event event){
        System.out.println(event);
        int currentPos = -150;
        currentPos += 150; 
        EventItem item = new EventItem(this.sc);
        String msg = "<html><p>" + event.getNote() + "</p></html>";
        item.deleteButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete_icon_"+(currentColorNumber+1)+".png"))); 
        item.editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/edit_icon"+(currentColorNumber+1)+".jpg"))); 
        item.viewButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/view_icon"+(currentColorNumber+1)+".png"))); 

        item.underline.setBackground(colors[currentColorNumber]);
        item.sideLine.setBackground(colors[currentColorNumber]);
        item.cardNote.setText(msg);
        item.cardTime.setText(event.getStartHour() + " - "+ event.getEndHour());
        this.sc.setPreferredSize(new java.awt.Dimension(this.sc.getWidth(), this.sc.getHeight()+150));
        this.sc.add(item, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, currentPos, 300, 120));
        currentColorNumber +=1;
        if(currentColorNumber > 2) currentColorNumber = 0;
    }

    public String getValue(JTextField input){
        return input.getText();
    }
    
    public void clearAllInput(){
        ef.eNameInput1.setText("");
        ef.eNoteInput1.setText("");
        ef.ePlaceInput.setText("");
    }
    
    public void openForm(EventForm e){
        this.sc.setVisible(false);
        e.addEventButton1.setText("AÑADIR EVENTO");
        e.setVisible(true);
        e.setLocationRelativeTo(null);
    }
    
    public List getEventListFromSql(){
        List<Event> l = dao.listEvents();
        return l;
    }
    
}
