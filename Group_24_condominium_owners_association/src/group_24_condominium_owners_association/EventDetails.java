/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_24_condominium_owners_association;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author Meem
 */
public class EventDetails {
     private final StringProperty eventName;
    private final StringProperty time;
    private final StringProperty date;

    public EventDetails(String eventName, String time, String date) {
        this.eventName = new SimpleStringProperty(eventName);
        this.time = new SimpleStringProperty(time);
        this.date = new SimpleStringProperty(date);
    }

    public String getEventName() {
        return eventName.get();
    }

    public void setEventName(String eventName) {
        this.eventName.set(eventName);
    }

    public StringProperty eventNameProperty() {
        return eventName;
    }

    public String getTime() {
        return time.get();
    }

    public void setTime(String time) {
        this.time.set(time);
    }

    public StringProperty timeProperty() {
        return time;
    }

    public String getDate() {
        return date.get();
    }

    public void setDate(String date) {
        this.date.set(date);
    }

    public StringProperty dateProperty() {
        return date;
    }
    
}
