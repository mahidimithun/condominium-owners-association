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
public class REM_Rules_Break {
    private String policyName;
    private String violationName;
    private String rulesViolation;
    private String violatorName;
    private LocalDate rulesBreakingDate;

    public REM_Rules_Break(String policyName, String violationName, String rulesViolation, String violatorName, LocalDate rulesBreakingDate) {
        this.policyName = policyName;
        this.violationName = violationName;
        this.rulesViolation = rulesViolation;
        this.violatorName = violatorName;
        this.rulesBreakingDate = rulesBreakingDate;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName;
    }

    public String getViolationName() {
        return violationName;
    }

    public void setViolationName(String violationName) {
        this.violationName = violationName;
    }

    public String getRulesViolation() {
        return rulesViolation;
    }

    public void setRulesViolation(String rulesViolation) {
        this.rulesViolation = rulesViolation;
    }

    public String getViolatorName() {
        return violatorName;
    }

    public void setViolatorName(String violatorName) {
        this.violatorName = violatorName;
    }

    public LocalDate getRulesBreakingDate() {
        return rulesBreakingDate;
    }

    public void setRulesBreakingDate(LocalDate rulesBreakingDate) {
        this.rulesBreakingDate = rulesBreakingDate;
    }
    
}
