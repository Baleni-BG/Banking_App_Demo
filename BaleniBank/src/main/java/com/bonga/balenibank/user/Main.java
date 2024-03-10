
package com.bonga.balenibank.user;
import javafx.application.Application;
import javafx.stage.Stage;
import java.io.IOException;
import com.bonga.balenibank.user.model.Models;

public class Main extends Application
{
    
   public void start(Stage stage) throws IOException
   {
        Models.getInstance().getView().getmain();
       
   }
    
}
