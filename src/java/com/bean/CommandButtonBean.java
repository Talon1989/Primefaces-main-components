/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Talon
 */
@Named(value = "commandButtonBean")
@SessionScoped
public class CommandButtonBean implements Serializable {
    
    private String username;
    private String password;

    public CommandButtonBean() {
    }
    
    public void doSomeAction(){
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("something"));
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
