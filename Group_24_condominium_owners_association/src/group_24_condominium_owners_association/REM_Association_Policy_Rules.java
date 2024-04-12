/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_24_condominium_owners_association;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class REM_Association_Policy_Rules {
        private String newPolicy;
    private String newRules;
    private LocalDate policyAddDate;
    private String policyAddTime;

    public REM_Association_Policy_Rules(String newPolicy, String newRules, LocalDate policyAddDate, String policyAddTime) {
        this.newPolicy = newPolicy;
        this.newRules = newRules;
        this.policyAddDate = policyAddDate;
        this.policyAddTime = policyAddTime;
    }

    public String getNewPolicy() {
        return newPolicy;
    }

    public void setNewPolicy(String newPolicy) {
        this.newPolicy = newPolicy;
    }

    public String getNewRules() {
        return newRules;
    }

    public void setNewRules(String newRules) {
        this.newRules = newRules;
    }

    public LocalDate getPolicyAddDate() {
        return policyAddDate;
    }

    public void setPolicyAddDate(LocalDate policyAddDate) {
        this.policyAddDate = policyAddDate;
    }

    public String getPolicyAddTime() {
        return policyAddTime;
    }

    public void setPolicyAddTime(String policyAddTime) {
        this.policyAddTime = policyAddTime;
    }
  
}