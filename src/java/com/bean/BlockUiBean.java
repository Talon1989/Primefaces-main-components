/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Talon
 */
@ManagedBean
@SessionScoped
public class BlockUiBean implements java.io.Serializable{

    public String someAction() throws InterruptedException {
        System.out.println("SOME_ACTION METHOD");
        Thread.currentThread().sleep(4000);
        return "";
    }
}
