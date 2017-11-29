/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.DashboardReorderEvent;
import org.primefaces.model.DashboardColumn;
import org.primefaces.model.DashboardModel;
import org.primefaces.model.DefaultDashboardColumn;
import org.primefaces.model.DefaultDashboardModel;

/**
 *
 * @author Talon
 */
@ManagedBean
@SessionScoped
public class DashboardBean {
    
    private DashboardModel model;

    public DashboardBean() {
        this.model = new DefaultDashboardModel();
        DashboardColumn column1 = new DefaultDashboardColumn();
        DashboardColumn column2 = new DefaultDashboardColumn();
        DashboardColumn column3 = new DefaultDashboardColumn();
        column1.addWidget("Sports");
        column1.addWidget("Technology");
        column2.addWidget("Finance");
        column2.addWidget("Cooking");
        column3.addWidget("News");
        this.model.addColumn(column1);
        this.model.addColumn(column2);
        this.model.addColumn(column3);
    }    

    public void handleReorder(DashboardReorderEvent event){
        FacesContext.getCurrentInstance().addMessage(null
                , new FacesMessage("Reordered: "+event.getWidgetId()
                        , "Item index: "+event.getItemIndex()));
    }
    
    public DashboardModel getModel() {
        return model;
    }

    public void setModel(DashboardModel model) {
        this.model = model;
    }
    
}
