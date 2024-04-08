/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_24_condominium_owners_association;

import java.time.LocalDate;

/**
 *
 * @author msi
 */
public class SecurityGuard {
    private String name;
    private String id;
    private String type;
    private LocalDate joiningDate;
    private String dutyTime;

    public SecurityGuard(String name, String id, String type, LocalDate joiningDate, String dutyTime) {
        this.name = name;
        this.id = id;
        this.type = type;
        this.joiningDate = joiningDate;
        this.dutyTime = dutyTime;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public String getDutyTime() {
        return dutyTime;
    }
    
}
