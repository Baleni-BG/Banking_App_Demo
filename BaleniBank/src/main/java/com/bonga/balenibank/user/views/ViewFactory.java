
package com.bonga.balenibank.user.views;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.io.IOException;
import java.net.URL;
import java.io.File;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.image.Image;
/*
    Views of the user are controlled here
*/

public  class  ViewFactory 
{
    
  public ViewFactory(){ }
           
         private AnchorPane main ,login , profile,dashboard ;
         private BorderPane app;
        
        private  AnchorPane getMain() throws IOException
        {
            if (main==null)
            { 
                 main = FXMLLoader.load(getUrl("src/main/resources/fxml/Main.fxml"));
                 System.out.println("loaded main");
            }
            return main;
        }
         
        public void getmain() 
        {
            try{
          // Image img = new Image(this.getClass().getResourceAsStream("/image.jpg"));
            
           Stage stage=new Stage();
            //stage.getIcons().add(img);
           stage.setScene(new Scene(getMain()));
           stage.setTitle("Baleni Bank");
           stage.show();
            }catch(IOException e){e.printStackTrace();}
        }
        
      
         private URL getUrl(String Url) throws IOException
         {
           
              URL url = new File(Url).toURI().toURL();
             
             return url;
         }
         
         private AnchorPane getLogin() 
         {
             
             System.out.println("Login is empty");
             if (login==null){
                 System.out.println("inside login");
                 
                 try{
                login = FXMLLoader.load(getUrl("src/main/resources/fxml/Login.fxml"));
                 System.out.println("loaded login");
                 }catch(IOException e){e.printStackTrace();}
                
             }
             return login;
         }
         
         public void getlogin() throws IOException
         {
            getStage(getLogin());
             
         }
         
         public BorderPane getApp()
         {
             if (app==null)
             { try {
                 app =FXMLLoader.load(getUrl("src/main/resources/fxml/App.fxml"));
             }catch(IOException e){e.printStackTrace();}
             }
         return app;
         }
         
         public void getStage(Pane pane)
         {
             
             Scene scene=new Scene(pane);
             
             Stage stage = new Stage();
             stage.getIcons().add(new Image(String.valueOf(getClass().getResource("/images/image.jpg"))));
             
             stage.setScene(scene);
             stage.show();
         }
         
         public void getapp() throws IOException
         {
             getStage(getApp());
         }
         
         private AnchorPane getProfile()
         {
           if (profile==null)
             { try {
                 profile =FXMLLoader.load(getUrl("src/main/resources/fxml/profile.fxml"));
             }catch(IOException e){e.printStackTrace();}
             }
         return profile;
         
         }
         
         public AnchorPane getprofile()
         {
             return getProfile();
         }
         
         
         private AnchorPane getDashBoard()
         {
         
             if (dashboard==null)
             { try {
                 dashboard =FXMLLoader.load(getUrl("src/main/resources/fxml/DashBoard.fxml"));
             }catch(IOException e){e.printStackTrace();}
             }
            return dashboard;
             
         }
         
         public AnchorPane getdashboard()
         {
             return getDashBoard();
         }
         
         public AnchorPane getTransactionalUnit() 
         {
             AnchorPane transunit=null;
             try{
                 transunit=FXMLLoader.load(getUrl("src/main/resources/fxml/TransactionalUnit.fxml"));
             }catch(IOException e){}
            
             return transunit;
         }
         
         
}
