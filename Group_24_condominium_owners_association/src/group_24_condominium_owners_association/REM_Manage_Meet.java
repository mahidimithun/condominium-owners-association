/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_24_condominium_owners_association;

/**
 *
 * @author ASUS
 */
public class REM_Manage_Meet {
     private String meetDocumentName;
    private String meetType;
    private String meetingTitle;
    private String meetingTime;

    public REM_Manage_Meet(String meetDocumentName, String meetType, String meetingTitle, String meetingTime) {
        this.meetDocumentName = meetDocumentName;
        this.meetType = meetType;
        this.meetingTitle = meetingTitle;
        this.meetingTime = meetingTime;
    }

    public String getMeetDocumentName() {
        return meetDocumentName;
    }

    public void setMeetDocumentName(String meetDocumentName) {
        this.meetDocumentName = meetDocumentName;
    }

    public String getMeetType() {
        return meetType;
    }

    public void setMeetType(String meetType) {
        this.meetType = meetType;
    }

    public String getMeetingTitle() {
        return meetingTitle;
    }

    public void setMeetingTitle(String meetingTitle) {
        this.meetingTitle = meetingTitle;
    }

    public String getMeetingTime() {
        return meetingTime;
    }

    public void setMeetingTime(String meetingTime) {
        this.meetingTime = meetingTime;
    }
    
}
