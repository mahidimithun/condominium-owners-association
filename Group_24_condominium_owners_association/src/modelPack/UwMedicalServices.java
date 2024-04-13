/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelPack;

/**
 *
 * @author HP
 */
public class UwMedicalServices {
    
    String unitOwnerId;
    String problemType;

    public UwMedicalServices(String unitOwnerId, String problemType) {
        this.unitOwnerId = unitOwnerId;
        this.problemType = problemType;
    }

    public String getUnitOwnerId() {
        return unitOwnerId;
    }

    public void setUnitOwnerId(String unitOwnerId) {
        this.unitOwnerId = unitOwnerId;
    }

    public String getProblemType() {
        return problemType;
    }

    public void setProblemType(String problemType) {
        this.problemType = problemType;
    }

    @Override
    public String toString() {
        return "UwMedicalServices{" + "unitOwnerId=" + unitOwnerId + ", problemType=" + problemType + '}';
    }
    
    
    
}
