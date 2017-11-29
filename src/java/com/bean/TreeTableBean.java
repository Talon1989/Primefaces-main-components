/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bean;

import com.data.Document;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

/**
 *
 * @author Talon
 */
@Named(value = "treeTableBean")
@SessionScoped
public class TreeTableBean implements Serializable {

    private TreeNode root = new DefaultTreeNode("Root Node", null);
    
    public TreeTableBean() {
        Document doc01 = new Document("Primefaces Tutorial", "1", "Primefaces Company");
        Document doc02 = new Document("Hibernate Tutorial", "2", "JournalDev");
        TreeNode documents = new DefaultTreeNode(new Document("Documents", "0", "JournalDev"), root);
        TreeNode document1 = new DefaultTreeNode(doc01, documents);
        TreeNode document2 = new DefaultTreeNode(doc02, documents);
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
}
