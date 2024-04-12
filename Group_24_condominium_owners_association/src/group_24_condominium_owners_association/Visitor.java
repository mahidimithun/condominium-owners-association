/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_24_condominium_owners_association;

import java.time.LocalDate;


/**
 *
 * @author Asus
 */
    public class Visitor {
        private String name;
    private LocalDate visitingDate;
    private String visitingTime;
    private String designation;
    private String unitNumbers;

    public Visitor(String name, LocalDate visitingDate, String visitingTime, String designation, String unitNumbers) {
        this.name = name;
        this.visitingDate = visitingDate;
        this.visitingTime = visitingTime;
        this.designation = designation;
        this.unitNumbers = unitNumbers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getVisitingDate() {
        return visitingDate;
    }

    public void setVisitingDate(LocalDate visitingDate) {
        this.visitingDate = visitingDate;
    }

    public String getVisitingTime() {
        return visitingTime;
    }

    public void setVisitingTime(String visitingTime) {
        this.visitingTime = visitingTime;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getUnitNumbers() {
        return unitNumbers;
    }

    public void setUnitNumbers(String unitNumbers) {
        this.unitNumbers = unitNumbers;
    }
  }
