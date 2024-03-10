package com.bonga.balenibank.user.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import com.bonga.balenibank.user.views.ViewFactory;
import javafx.scene.Scene;
import com.bonga.balenibank.user.model.Models;

import javafx.stage.Stage;

public class Main {

   

    @FXML
   public Button login_button;
    
    public void initialize() 
    {
    
     login_button.setOnAction(e->{
         try {
             login();
         } catch (Exception ex) {
            
         }
     });
    }
    
    
    
    
    public void login() throws Exception
    {
        Stage stage =(Stage)login_button.getScene().getWindow();
        
       Models.getInstance().getView().getlogin();
       
       stage.close();
    }

}
