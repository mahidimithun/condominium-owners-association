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
public class WorkScheduleList_SCO {
     private String scheduleName;
    private LocalDate scheduleDate;
    private String workType;
    private String shiftStartTime;
    private String shiftEndTime;
    private String location;

    public WorkScheduleList_SCO(String scheduleName, LocalDate scheduleDate, String workType, String shiftStartTime, String shiftEndTime, String location) {
        this.scheduleName = scheduleName;
        this.scheduleDate = scheduleDate;
        this.workType = workType;
        this.shiftStartTime = shiftStartTime;
        this.shiftEndTime = shiftEndTime;
        this.location = location;
    }

    public String getScheduleName() {
        return scheduleName;
    }

    public LocalDate getScheduleDate() {
        return scheduleDate;
    }

    public String getWorkType() {
        return workType;
    }

    public String getShiftStartTime() {
        return shiftStartTime;
    }

    public String getShiftEndTime() {
        return shiftEndTime;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return scheduleName + "," + scheduleDate + "," + workType + "," + shiftStartTime + "," + shiftEndTime + "," + location;
    }
}
