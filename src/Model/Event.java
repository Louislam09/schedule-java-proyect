package Model;

public class Event {
    int id;
    String eventName;
    String note;
    String date;
    String startHour;
    String endHour;
    String place;

    public Event() {
    }

    public Event(String eventName, String description, String date, String startHour, String endHour, String lugar) {
        this.eventName = eventName;
        this.note = description;
        this.date = date;
        this.startHour = startHour;
        this.endHour = endHour;
        this.place = lugar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public String getEndHour() {
        return endHour;
    }

    public void setEndHour(String endHour) {
        this.endHour = endHour;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

}
