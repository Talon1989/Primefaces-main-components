/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Talon
 */
@Named(value = "selectBooleanBean")
@SessionScoped
public class SelectBooleanBean implements Serializable {

    private boolean status;
    private boolean status2;
    private List<String> tutorials = new ArrayList<>();
    
   private final List<String> preTutorials;
    
    public SelectBooleanBean() {
        preTutorials = new ArrayList<>();
        preTutorials.add("First");
        preTutorials.add("Second");
        preTutorials.add("Third");
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean isStatus2() {
        return status2;
    }

    public void setStatus2(boolean status2) {
        this.status2 = status2;
    }

    public List<String> getTutorials() {
        return tutorials;
    }

    public void setTutorials(List<String> tutorials) {
        this.tutorials = tutorials;
    }
    
//    @PostConstruct
//    public void init(){
//        this.tutorials.add("Primefaces");
//        this.tutorials.add("Hibernate");
//        this.tutorials.add("Spring");
//    }
    
    public String displayStatus(){
        FacesContext.getCurrentInstance().addMessage(null
                , new FacesMessage("System is turned "+(status ? "on" : "off")));
        return "";
    }
    
    public String displayStatus2() {
        FacesContext.getCurrentInstance().addMessage(null,
                 new FacesMessage("System2 is turned " + (status2 ? "on" : "off")));
        return "";
    }
    
    public void displayTutorials(){
        StringBuilder str = new StringBuilder();
        for(String s : this.tutorials){
            str.append(s+ ";");
        }
        FacesContext.getCurrentInstance().addMessage(null
                , new FacesMessage("Registered: "+str.toString()));
    }
    
}
