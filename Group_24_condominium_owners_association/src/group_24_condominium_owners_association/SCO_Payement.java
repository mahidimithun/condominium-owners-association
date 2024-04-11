/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_24_condominium_owners_association;

/**
 *
 * @author ASUS
 */
public class SCO_Payement {
    
    private String guardName;
    private String guardDesignation;
    private String paymentStatus;
    private double paymentAmount;
    private String paymentDate;
    private String paymentApproval;

    public SCO_Payement(String guardName, String guardDesignation, String paymentStatus, double paymentAmount, String paymentDate, String paymentApproval) {
        this.guardName = guardName;
        this.guardDesignation = guardDesignation;
        this.paymentStatus = paymentStatus;
        this.paymentAmount = paymentAmount;
        this.paymentDate = paymentDate;
        this.paymentApproval = paymentApproval;
    }

    public String getGuardName() {
        return guardName;
    }

    public void setGuardName(String guardName) {
        this.guardName = guardName;
    }

    public String getGuardDesignation() {
        return guardDesignation;
    }

    public void setGuardDesignation(String guardDesignation) {
        this.guardDesignation = guardDesignation;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

    public String getPaymentApproval() {
        return paymentApproval;
    }

    public void setPaymentApproval(String paymentApproval) {
        this.paymentApproval = paymentApproval;
    }

    @Override
    public String toString() {
        return guardName + "," + guardDesignation + "," + paymentStatus + "," + paymentAmount + "," + paymentDate + "," + paymentApproval;
    }
}
