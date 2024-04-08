/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelPack;

/**
 *
 * @author HP
 */
public class MRbudget {
    
    String budgetType;
    String budgetAmount; 

    public MRbudget(String budgetType, String budgetAmount) {
        this.budgetType = budgetType;
        this.budgetAmount = budgetAmount;
    }

    public String getBudgetType() {
        return budgetType;
    }

    public void setBudgetType(String budgetType) {
        this.budgetType = budgetType;
    }

    public String getBudgetAmount() {
        return budgetAmount;
    }

    public void setBudgetAmount(String budgetAmount) {
        this.budgetAmount = budgetAmount;
    }

    @Override
    public String toString() {
        return "MRbudget{" + "budgetType=" + budgetType + ", budgetAmount=" + budgetAmount + '}';
    }
    
    

    
    
    
}
