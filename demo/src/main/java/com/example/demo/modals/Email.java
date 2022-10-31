package com.example.demo.modals;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Email {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int emailId;

    private String emailFrom;
    
    private String emailTo;
    
    private String emailSubject;
    
    private String emailBody;

    
    public Email() {
    }


    public Email(int emailId, String emailFrom, String emailTo, String emailSubject, String emailBody) {
        this.emailId = emailId;
        this.emailFrom = emailFrom;
        this.emailTo = emailTo;
        this.emailSubject = emailSubject;
        this.emailBody = emailBody;
    }


    public int getEmailId() {
        return emailId;
    }


    public void setEmailId(int emailId) {
        this.emailId = emailId;
    }


    public String getEmailFrom() {
        return emailFrom;
    }


    public void setEmailFrom(String emailFrom) {
        this.emailFrom = emailFrom;
    }


    public String getEmailTo() {
        return emailTo;
    }


    public void setEmailTo(String emailTo) {
        this.emailTo = emailTo;
    }


    public String getEmailSubject() {
        return emailSubject;
    }


    public void setEmailSubject(String emailSubject) {
        this.emailSubject = emailSubject;
    }


    public String getEmailBody() {
        return emailBody;
    }


    public void setEmailBody(String emailBody) {
        this.emailBody = emailBody;
    }


 

    
    
    
    
}
