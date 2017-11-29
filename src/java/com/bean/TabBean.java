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
import org.primefaces.event.TabChangeEvent;

/**
 *
 * @author Talon
 */
@Named(value = "tabBean")
@SessionScoped
public class TabBean implements Serializable {

    private int index = 0;
    
    public TabBean() {
        index = 0;
    }
    
    public String doSomeWork(){
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("some work"));
        index = 1;
        return "";
    }
    
    public void onTabChanged (TabChangeEvent e){
        FacesContext.getCurrentInstance().addMessage(null, 
                new FacesMessage(e.getComponent()+" changed"));
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
}
