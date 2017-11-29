/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author Talon
 */
@ManagedBean
@SessionScoped
public class PanelBean implements java.io.Serializable {

    private String tutorial;
    private List<String> tutorials = new ArrayList<>();
    private List<String> checker = new ArrayList<>();

    public String search() {
        if (check(tutorial)) {
            IntStream.range(0, 10).forEach((a) -> tutorials.add(tutorial + " tutorial #" + a));
        }
        return "";
    }

    public String getTutorial() {
        return tutorial;
    }

    public void setTutorial(String tutorial) {
        this.tutorial = tutorial;
    }

    public List<String> getTutorials() {
        return tutorials;
    }

    public void setTutorials(List<String> tutorials) {
        this.tutorials = tutorials;
    }

    private boolean check(String str) {
        List<String> l = checker.stream().filter(a -> a.equals(str)).collect(Collectors.toList());
        if (l.size() > 0) {
            FacesContext.getCurrentInstance().addMessage(null, 
                    new FacesMessage(FacesMessage.SEVERITY_ERROR, str + " already searched", str + " already searched"));
            return false;
        } else {
            checker.add(str);
            return true;
        }
    }

}
