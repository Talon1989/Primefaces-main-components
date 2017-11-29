/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

/**
 *
 * @author Talon
 */
public class Tutorial {
    
    private String tutorialName;
    private String tutorialInstructor;
    private String tutorialPeriod;
    private String tutorialPrice;
    private String tutorialStartDate;
    private String tutorialEndDate;

    public Tutorial() {
    }

    public String getTutorialName() {
        return tutorialName;
    }

    public void setTutorialName(String tutorialName) {
        this.tutorialName = tutorialName;
    }

    public String getTutorialInstructor() {
        return tutorialInstructor;
    }

    public void setTutorialInstructor(String tutorialInstructor) {
        this.tutorialInstructor = tutorialInstructor;
    }

    public String getTutorialPeriod() {
        return tutorialPeriod;
    }

    public void setTutorialPeriod(String tutorialPeriod) {
        this.tutorialPeriod = tutorialPeriod;
    }

    public String getTutorialPrice() {
        return tutorialPrice;
    }

    public void setTutorialPrice(String tutorialPrice) {
        this.tutorialPrice = tutorialPrice;
    }

    public String getTutorialStartDate() {
        return tutorialStartDate;
    }

    public void setTutorialStartDate(String tutorialStartDate) {
        this.tutorialStartDate = tutorialStartDate;
    }

    public String getTutorialEndDate() {
        return tutorialEndDate;
    }

    public void setTutorialEndDate(String tutorialEndDate) {
        this.tutorialEndDate = tutorialEndDate;
    }

    @Override
    public String toString() {
        return "Tutorial{" + "tutorialName=" + tutorialName + ", tutorialInstructor=" + tutorialInstructor + ", tutorialPeriod=" + tutorialPeriod + ", tutorialPrice=" + tutorialPrice + ", tutorialStartDate=" + tutorialStartDate + ", tutorialEndDate=" + tutorialEndDate + '}';
    }
    
}
