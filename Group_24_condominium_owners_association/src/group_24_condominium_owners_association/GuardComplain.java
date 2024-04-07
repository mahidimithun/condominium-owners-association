/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_24_condominium_owners_association;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author msi
 */
public class GuardComplain {
    private final StringProperty complainBy;
    private final StringProperty complainType;
    private final StringProperty complainDate;
    private final StringProperty complainStatus;

    public GuardComplain(String complainBy, String complainType, String complainDate, String complainStatus) {
        this.complainBy = new SimpleStringProperty(complainBy);
        this.complainType = new SimpleStringProperty(complainType);
        this.complainDate = new SimpleStringProperty(complainDate);
        this.complainStatus = new SimpleStringProperty(complainStatus);
    }

    public StringProperty complainByProperty() {
        return complainBy;
    }

    public StringProperty complainTypeProperty() {
        return complainType;
    }

    public StringProperty complainDateProperty() {
        return complainDate;
    }

    public StringProperty complainStatusProperty() {
        return complainStatus;
    }

    public String getComplainBy() {
        return complainBy.get();
    }

    public String getComplainType() {
        return complainType.get();
    }

    public String getComplainDate() {
        return complainDate.get();
    }

    public String getComplainStatus() {
        return complainStatus.get();
    }
    
}
