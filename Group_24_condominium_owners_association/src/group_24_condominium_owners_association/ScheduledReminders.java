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
public class ScheduledReminders {
    private final StringProperty title;
    private final StringProperty date;
    private final StringProperty time;
    private final StringProperty scheduleType;

    public ScheduledReminders(String title, String date, String time, String scheduleType) {
        this.title = new SimpleStringProperty(title);
        this.date = new SimpleStringProperty(date);
        this.time = new SimpleStringProperty(time);
        this.scheduleType = new SimpleStringProperty(scheduleType);
    }

    public String getTitle() {
        return title.get();
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public StringProperty titleProperty() {
        return title;
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

    public String getTime() {
        return time.get();
    }

    public void setTime(String time) {
        this.time.set(time);
    }

    public StringProperty timeProperty() {
        return time;
    }

    public String getScheduleType() {
        return scheduleType.get();
    }

    public void setScheduleType(String scheduleType) {
        this.scheduleType.set(scheduleType);
    }

    public StringProperty scheduleTypeProperty() {
        return scheduleType;
    }
}
    

