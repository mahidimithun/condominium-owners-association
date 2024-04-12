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
public class EM_ContactInfo {
     private final StringProperty name;
    private final StringProperty gmail;
    private final StringProperty phoneNumber;
    private final StringProperty officeHours;

    public EM_ContactInfo(String name, String gmail, String phoneNumber, String officeHours) {
        this.name = new SimpleStringProperty(name);
        this.gmail = new SimpleStringProperty(gmail);
        this.phoneNumber = new SimpleStringProperty(phoneNumber);
        this.officeHours = new SimpleStringProperty(officeHours);
    }

    public StringProperty nameProperty() {
        return name;
    }

    public StringProperty gmailProperty() {
        return gmail;
    }

    public StringProperty phoneNumberProperty() {
        return phoneNumber;
    }

    public StringProperty officeHoursProperty() {
        return officeHours;
    }
}

    

