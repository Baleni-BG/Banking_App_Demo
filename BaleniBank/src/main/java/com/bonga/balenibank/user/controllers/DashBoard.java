package com.bonga.balenibank.user.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import com.bonga.balenibank.user.model.Models;

public class DashBoard {

    @FXML
   public AnchorPane dashboard;

    @FXML
    public TextField search_bar;

    @FXML
    public Button search_button;

    @FXML
    public ListView<AnchorPane> transaction_listView;
    
    
    public void initialize()
    {
          /*
        while(true)
        {
            transaction_listView.getChildren();
        } */
    }
    
    public AnchorPane getTransacUnit()
    {
        return Models.getInstance().getView().getTransactionalUnit();
    }

}
