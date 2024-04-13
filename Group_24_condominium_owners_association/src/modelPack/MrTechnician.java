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
public class MrTechnician {

    private String techName;
    private String techPhoneNo;
   
    private String techType;
     private LocalDate date;

    public MrTechnician(String techName, String techPhoneNo, String techType, LocalDate date) {
        this.techName = techName;
        this.techPhoneNo = techPhoneNo;
        this.techType = techType;
        this.date = date;
    }

    public String getTechName() {
        return techName;
    }

    public void setTechName(String techName) {
        this.techName = techName;
    }

    public String getTechPhoneNo() {
        return techPhoneNo;
    }

    public void setTechPhoneNo(String techPhoneNo) {
        this.techPhoneNo = techPhoneNo;
    }

    public String getTechType() {
        return techType;
    }

    public void setTechType(String techType) {
        this.techType = techType;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "MrTechnician{" + "techName=" + techName + ", techPhoneNo=" + techPhoneNo + ", techType=" + techType + ", date=" + date + '}';
    }

    
    
    

}
