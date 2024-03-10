
package com.bonga.balenibank.user.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import com.bonga.balenibank.user.model.Models;
import javafx.stage.Stage;

public class Login 
{

    @FXML
    public Hyperlink create_account_hyper_link;

    @FXML
    public Button login_button;

    @FXML
    public TextField user_name_field;

    @FXML
    public PasswordField user_password_field;
    
    public void initialize()
    {
    
       login_button.setOnAction(e->app());
            
    }

    public void app()
    {
        try
        {
        Models.getInstance().getView().getapp();
        
        Stage stage=(Stage)login_button.getScene().getWindow();
        stage.close();
        
        }
        catch(Exception e){}
    }
}
