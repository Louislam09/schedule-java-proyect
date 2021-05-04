
package Model;

import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class EventDAO {
    DBConnection dbCon = new DBConnection();
    Connection con;
    Statement st;
    ResultSet rs;
    
    public Event getEventById(int id){
        String sql = "Select * from event where event_id="+ id;
        Event e = new Event();

        try {
            con= dbCon.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

             while (rs.next()) {
                e.setId(rs.getInt(1));
                e.setEventName(rs.getString(2));
                e.setNote(rs.getString(3));
                e.setDate(rs.getString(4));
                e.setStartHour(rs.getString(5));
                e.setEndHour(rs.getString(6));
                e.setPlace(rs.getString(7));
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Hubo Un Error Al Editar El Evento, Intente de nuevo!");
        }
        return e;
    }
    
    public List getEventByFilter(String param,String filter){
        List<Event> events = new ArrayList();
        String sql = "Select * from event where "+filter+" like '%"+param+"%'";
        Event e = new Event();
        System.out.println(sql);
        try {
            con= dbCon.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                e.setId(rs.getInt(1));
                e.setEventName(rs.getString(2));
                e.setNote(rs.getString(3));
                e.setDate(rs.getString(4));
                e.setStartHour(rs.getString(5));
                e.setEndHour(rs.getString(6));
                e.setPlace(rs.getString(7));
                events.add(e);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo Un Error Buscar El Evento, Intente de nuevo!");
        }
        return events;
    }
    
    public List getEventByNote(String note){
        List<Event> events = new ArrayList();
        String sql = "Select * from event where note='"+ note+"'";
        Event e = new Event();
        
        try {
            con= dbCon.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                e.setId(rs.getInt(1));
                e.setEventName(rs.getString(2));
                e.setNote(rs.getString(3));
                e.setDate(rs.getString(4));
                e.setStartHour(rs.getString(5));
                e.setEndHour(rs.getString(6));
                e.setPlace(rs.getString(7));
                events.add(e);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo Un Error Buscar El Evento, Intente de nuevo!");
        }
        return events;
    }
    
    public void deleteEvent(int id){
        String sql = "delete from event where event_id="+ id;
        try {
            con= dbCon.getConnection();
            st = con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Evento Borrando Con Exito!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo Un Error Al Borrar El Evento, Intente de nuevo!");
        }
    }
    
     public void editEvent(int id){
        String sql = "delete from event where event_id="+ id;
        try {
            con= dbCon.getConnection();
            st = con.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Evento Borrando Con Exito!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hubo Un Error Al Borrar El Evento, Intente de nuevo!");
        }
    }
    
    public List listEvents(){
        List<Event> datas = new ArrayList();
        String sql = "select * from event";
        
        try {
            con= dbCon.getConnection();
            st = con.createStatement();
            rs = st.executeQuery(sql);

            while (rs.next()) {
                Event e = new Event();
                e.setId(rs.getInt(1));
                e.setEventName(rs.getString(2));
                e.setNote(rs.getString(3));
                e.setDate(rs.getString(4));
                e.setStartHour(rs.getString(5));
                e.setEndHour(rs.getString(6));
                e.setPlace(rs.getString(7));
                datas.add(e);
            }
            
        } catch (Exception e) {
        }
        return datas;
    }

    public void saveEvent(Event e){
        String url="jdbc:mysql://localhost:3306/schedule";
        String user = "root";
        String pass = "";
      
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url,user,pass);
            PreparedStatement stment = con.prepareStatement(
                    "INSERT INTO event(event_name,note,date,start_at,end_at,place) VALUES (?,?,?,?,?,?)");
            
            stment.setString(1, e.getEventName());
            stment.setString(2, e.getNote());
            stment.setString(3, e.getDate());
            stment.setString(4, e.getStartHour());
            stment.setString(5, e.getEndHour());
            stment.setString(6, e.getPlace());
            stment.execute();
            JOptionPane.showMessageDialog(null, "Evento Agregado Con Exito!");

        } catch (Exception ex) {
//            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo Un Error Al Agregar El Evento, Intente de nuevo!");
        }
    }

    public void updateEvent(Event e,int id){
        String sql = "update event set "
                + " event_name='"+e.getEventName()+
                "',note='"+e.getNote()+
                "',date='"+e.getDate()+
                "',start_at='"+e.getStartHour()+
                "',end_at='"+e.getEndHour()+
                "',place='"+e.getPlace()+
                "' where event_id="+ id;

        try {
            con= dbCon.getConnection();
            st = con.createStatement();
            st.execute(sql);
            JOptionPane.showMessageDialog(null, "Evento Editado Con Exito!");

        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Hubo Un Error Al Editar El Evento, Intente de nuevo!");
        }
    }
    
}
