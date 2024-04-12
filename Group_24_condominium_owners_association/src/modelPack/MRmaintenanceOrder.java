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
public class MRmaintenanceOrder {
    
     private String maintenanceType;
    private String yourId;
    private LocalDate date;

    public MRmaintenanceOrder(String maintenanceType, String yourId, LocalDate date) {
        this.maintenanceType = maintenanceType;
        this.yourId = yourId;
        this.date = date;
    }

    public String getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(String maintenanceType) {
        this.maintenanceType = maintenanceType;
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
        return "MRmaintenanceOrder{" + "maintenanceType=" + maintenanceType + ", yourId=" + yourId + ", date=" + date + '}';
    }
    
    
    
}
