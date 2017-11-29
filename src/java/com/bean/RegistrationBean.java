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

/**
 *
 * @author Talon
 */
@Named(value = "registrationBean")
@SessionScoped
public class RegistrationBean implements Serializable {

    private List<Tutorial> tutorials = new ArrayList<>();
    private Tutorial tutorial = new Tutorial();
    
    public RegistrationBean() {
    }

    public void register(){
        System.out.println(this.tutorial);
        this.tutorials.add(tutorial);
        this.tutorial = new Tutorial();
        System.out.println("tutorials size : "+tutorials.size());
    }
    
    public List<Tutorial> getTutorials() {
        return tutorials;
    }

    public void setTutorials(List<Tutorial> tutorials) {
        this.tutorials = tutorials;
    }

    public Tutorial getTutorial() {
        return tutorial;
    }

    public void setTutorial(Tutorial tutorial) {
        this.tutorial = tutorial;
    }
    
}
