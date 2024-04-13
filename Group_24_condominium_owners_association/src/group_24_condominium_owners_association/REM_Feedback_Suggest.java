/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package group_24_condominium_owners_association;

/**
 *
 * @author ASUS
 */
public class REM_Feedback_Suggest {
   private String feedbackerName;
    private String residentName;
    private String residentNumber;
    private String contactInfo;
    private String feedbackandSuggestions;

    public REM_Feedback_Suggest(String feedbackerName, String residentName, String residentNumber, String contactInfo, String feedbackandSuggestions) {
        this.feedbackerName = feedbackerName;
        this.residentName = residentName;
        this.residentNumber = residentNumber;
        this.contactInfo = contactInfo;
        this.feedbackandSuggestions = feedbackandSuggestions;
    }

    public String getFeedbackerName() {
        return feedbackerName;
    }

    public void setFeedbackerName(String feedbackerName) {
        this.feedbackerName = feedbackerName;
    }

    public String getResidentName() {
        return residentName;
    }

    public void setResidentName(String residentName) {
        this.residentName = residentName;
    }

    public String getResidentNumber() {
        return residentNumber;
    }

    public void setResidentNumber(String residentNumber) {
        this.residentNumber = residentNumber;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getFeedbackandSuggestions() {
        return feedbackandSuggestions;
    }

    public void setFeedbackandSuggestions(String feedbackandSuggestions) {
        this.feedbackandSuggestions = feedbackandSuggestions;
    }

    @Override
    public String toString() {
        return feedbackerName + "," + residentName + "," + residentNumber + "," + contactInfo + "," + feedbackandSuggestions;
    }
}
