/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.domain.Employee;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import org.primefaces.event.SelectEvent;

/**
 *
 * @author Talon
 */
@Named(value = "utilitiesBean")
@SessionScoped
public class UtilitiesBean implements Serializable {
    
    private List<Employee> employees = new ArrayList<>();
    
    public String validate(){
        boolean valid= false;
        if(Math.floor(Math.random()*10)%2==0){ valid = true; }
//        RequestContext context = RequestContext.getCurrentInstance();
        RequestContext.getCurrentInstance().addCallbackParam("isValid", valid);
        if(valid){
            FacesContext.getCurrentInstance().addMessage(null
                    , new FacesMessage("Request Accepted"));
            RequestContext.getCurrentInstance().update("growlId");
        }
        if(!valid){
            FacesContext.getCurrentInstance().addMessage(null
                    , new FacesMessage("Request Refused"));
        RequestContext.getCurrentInstance().update("growlId");
        }
        return "";
    }
    
    public void executeJavaScript(){
        boolean valid = false;
        if (Math.floor(Math.random() * 10) % 2 == 0) {  valid = true; }
        RequestContext.getCurrentInstance().execute("PF('acceptedDialog').hide()");
        RequestContext.getCurrentInstance().execute("PF('refusedDialog').hide()");
        if(valid){
            RequestContext.getCurrentInstance().execute("PF('acceptedDialog').show()");
        }else{
            RequestContext.getCurrentInstance().execute("PF('refusedDialog').show()");
        }
    }
    
    public UtilitiesBean() {
    }
    
}
