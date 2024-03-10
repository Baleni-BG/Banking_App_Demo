package com.bonga.balenibank.user.controllers;

import com.bonga.balenibank.user.model.Models;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;


public class UserMenu {
    
    

    @FXML
     public FontAwesomeIconView balances_button;

    @FXML
    public Button beneficiaries_button;

    @FXML
    public Button dash_board_button;

    @FXML
    public Button documentation_button;

    @FXML
    public AnchorPane menu;

    @FXML
    public Button profile_button;

    @FXML
    public Button settings_button;

    @FXML
    public Button sign_out_button;

    @FXML
    public Button transactions_button;

    
    public void initialize()
    {
    
        profile_button.setOnAction(e->profile());
        dash_board_button.setOnAction(e->dashboard());
        
    }
    
    public void profile()
    {
        
        AnchorPane profile=Models.getInstance().getView().getprofile();
        Models.getInstance().getView().getApp().setCenter(profile);
    }
    
    public void dashboard()
    {
        AnchorPane dashboard=Models.getInstance().getView().getdashboard();
        Models.getInstance().getView().getApp().setCenter(dashboard);
    }
}
