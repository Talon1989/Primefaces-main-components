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
@Named(value = "menuBean")
@SessionScoped
public class MenuBean implements Serializable {

    public void openAction(){
        FacesContext.getCurrentInstance().addMessage(null
                , new FacesMessage("open action"));
    }
    
}
