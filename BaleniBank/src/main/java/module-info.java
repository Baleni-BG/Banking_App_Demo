module com.bonga.balenibank 
{
    requires javafx.controls;
    requires javafx.fxml;
    requires de.jensd.fx.glyphs.fontawesome;

    opens   com.bonga.balenibank.user to javafx.fxml;
    exports com.bonga.balenibank.user;
    exports com.bonga.balenibank.user.views;
    exports com.bonga.balenibank.user.model;
    exports com.bonga.balenibank.user.controllers;
    
    
}
