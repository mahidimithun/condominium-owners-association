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
public class REM_Documentation {
     private String documentName;
    private LocalDate documentDate;
    private String documentTopic;
    private String fileType;

    public REM_Documentation(String documentName, LocalDate documentDate, String documentTopic, String fileType) {
        this.documentName = documentName;
        this.documentDate = documentDate;
        this.documentTopic = documentTopic;
        this.fileType = fileType;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public LocalDate getDocumentDate() {
        return documentDate;
    }

    public void setDocumentDate(LocalDate documentDate) {
        this.documentDate = documentDate;
    }

    public String getDocumentTopic() {
        return documentTopic;
    }

    public void setDocumentTopic(String documentTopic) {
        this.documentTopic = documentTopic;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }
}
