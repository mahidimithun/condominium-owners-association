/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_24_condominium_owners_association;

/**
 *
 * @author Meem
 */
public class ComOwnContact {
    private String name;
    private String gmail;
    private String phoneNumber;
    private String officeHours;

    public ComOwnContact(String name, String gmail, String phoneNumber, String officeHours) {
        this.name = name;
        this.gmail = gmail;
        this.phoneNumber = phoneNumber;
        this.officeHours = officeHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }
    
}
