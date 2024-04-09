/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_24_condominium_owners_association;

import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 *
 * @author Meem
 */
public class RetailSpace {
     private final SimpleStringProperty productName;
    private final SimpleDoubleProperty price;
    private final SimpleStringProperty expiryDates;

    public RetailSpace(String productName, double price, String expiryDates) {
        this.productName = new SimpleStringProperty(productName);
        this.price = new SimpleDoubleProperty(price);
        this.expiryDates = new SimpleStringProperty(expiryDates);
    }

    public String getProductName() {
        return productName.get();
    }

    public void setProductName(String productName) {
        this.productName.set(productName);
    }

    public SimpleStringProperty productNameProperty() {
        return productName;
    }

    public double getPrice() {
        return price.get();
    }

    public void setPrice(double price) {
        this.price.set(price);
    }

    public SimpleDoubleProperty priceProperty() {
        return price;
    }

    public String getExpiryDates() {
        return expiryDates.get();
    }

    public void setExpiryDates(String expiryDates) {
        this.expiryDates.set(expiryDates);
    }

    public SimpleStringProperty expiryDatesProperty() {
        return expiryDates;
    }
}
