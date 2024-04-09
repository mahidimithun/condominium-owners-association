/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_24_condominium_owners_association;

/**
 *
 * @author Meem
 */
public class Announcements_Updates {
    private String upcomingEvents;
    private String date;
    private String time;
    private String location;

    public Announcements_Updates(String upcomingEvents, String date, String time, String location) {
        this.upcomingEvents = upcomingEvents;
        this.date = date;
        this.time = time;
        this.location = location;
    }

    public String getUpcomingEvents() {
        return upcomingEvents;
    }

    public void setUpcomingEvents(String upcomingEvents) {
        this.upcomingEvents = upcomingEvents;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}