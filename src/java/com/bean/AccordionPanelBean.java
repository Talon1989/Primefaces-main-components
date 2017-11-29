/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.TabChangeEvent;

/**
 *
 * @author Talon
 */
@ManagedBean
@RequestScoped
public class AccordionPanelBean {
    
    private String welcomeMessage;
    private String componentMessage;

    public AccordionPanelBean() {
        this.welcomeMessage = "welcome from bean";
        this.componentMessage = "component from bean";
    }
    
    public void onChange(TabChangeEvent event){
        System.out.println("tab changed");
        FacesContext.getCurrentInstance().addMessage(null
                , new FacesMessage(event.getComponent()+" tab changed"));
    }

    public String getWelcomeMessage() {
        System.out.println("welcome getter method");
        return welcomeMessage;
    }

    public void setWelcomeMessage(String welcomeMessage) {
        this.welcomeMessage = welcomeMessage;
    }

    public String getComponentMessage() {
        System.out.println("compomnent getter method");
        return componentMessage;
    }

    public void setComponentMessage(String componentMessage) {
        this.componentMessage = componentMessage;
    }
    
}
