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
@Named(value = "messageBean")
@SessionScoped
public class MessageBean implements Serializable {

    private String message = "";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public MessageBean() {
    }

    public String sendMessage() {
        if (message == null || message.equals("")) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, "message required", "message required"));
        } else {
            FacesContext.getCurrentInstance().addMessage(null,
                     new FacesMessage("Welcome message: " + message));
        }
        return "";
    }

}
