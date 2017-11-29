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
import javax.faces.event.ActionEvent;
import org.primefaces.event.NodeCollapseEvent;
import org.primefaces.event.NodeExpandEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 *
 * @author Talon
 */
@Named(value = "treeBean")
@SessionScoped
public class TreeBean implements Serializable {

    private TreeNode root;
    
    public TreeBean() {
        this.root = new DefaultTreeNode("Tree Node", null);
        TreeNode child = new DefaultTreeNode("Child Node", root); child.setParent(root);
        TreeNode descendent = new DefaultTreeNode("Descendent Node", child); descendent.setParent(child);
        TreeNode grandChild = new DefaultTreeNode("grandChild", descendent); grandChild.setParent(descendent);
        TreeNode descendent2 = new DefaultTreeNode("Descendent Node2", child); descendent2.setParent(child);
        // Create main documents
        TreeNode documents = new DefaultTreeNode("Documents", this.root);
        // Create document node
        TreeNode document01 = new DefaultTreeNode("document", "Expenses.doc", documents);
        // Create images node
        TreeNode images = new DefaultTreeNode("Images", this.root);
        // Create image node
        TreeNode image01 = new DefaultTreeNode("image", "Travel.gif", images);
        // Create videos node
        TreeNode videos = new DefaultTreeNode("Videos", this.root);
        // Create video node
        TreeNode video01 = new DefaultTreeNode("video", "Play.avi", videos);
    }
    
    public void onNodeExpand(NodeExpandEvent event){
        FacesContext.getCurrentInstance().addMessage(null
                , new FacesMessage(event.getComponent()+" expanded"));
    }
    
    public void onNodeCollapse(NodeCollapseEvent event){
        FacesContext.getCurrentInstance().addMessage(null
                , new FacesMessage(event.getComponent()+" collapsed"));
    }
    
    public void view(ActionEvent e){
        System.out.println("WORKING");
        FacesContext.getCurrentInstance().addMessage(null
                , new FacesMessage(e.getComponent()+" looking"));
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
}
