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
public class ComOwnFacilityDetails {
      private final StringProperty location;
    private final StringProperty openHours;
    private final StringProperty servicesOffer;

    public ComOwnFacilityDetails(String location, String openHours, String servicesOffer) {
        this.location = new SimpleStringProperty(location);
        this.openHours = new SimpleStringProperty(openHours);
        this.servicesOffer = new SimpleStringProperty(servicesOffer);
    }

    public StringProperty locationProperty() {
        return location;
    }

    public StringProperty openHoursProperty() {
        return openHours;
    }

    public StringProperty servicesOfferProperty() {
        return servicesOffer;
    }
    }
    

