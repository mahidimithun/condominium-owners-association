/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelPack;

import java.time.LocalDate;

/**
 *
 * @author HP
 */
public class MRrepairOrder {
    
    private String repairType;
    private String yourId;
    private LocalDate date;

    public MRrepairOrder(String repairType, String yourId, LocalDate date) {
        this.repairType = repairType;
        this.yourId = yourId;
        this.date = date;
    }

    public String getRepairType() {
        return repairType;
    }

    public void setRepairType(String repairType) {
        this.repairType = repairType;
    }

    public String getYourId() {
        return yourId;
    }

    public void setYourId(String yourId) {
        this.yourId = yourId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MRrepairOrder{" + "repairType=" + repairType + ", yourId=" + yourId + ", date=" + date + '}';
    }
    
    
    
}
