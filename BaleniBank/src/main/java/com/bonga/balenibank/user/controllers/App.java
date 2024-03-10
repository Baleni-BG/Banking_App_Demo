package com.bonga.balenibank.user.controllers;
import javafx.fxml.FXML;

import javafx.scene.layout.AnchorPane;

import javafx.scene.layout.BorderPane;

public class App
{
   
      @FXML
      public BorderPane app;
      
      public void initialize()
      {
      
      
      
      }
      
      public void setCenter(AnchorPane pane)
      {
          app.setCenter(pane);
      }
       
}
