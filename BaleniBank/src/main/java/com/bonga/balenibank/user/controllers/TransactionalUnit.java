package com.bonga.balenibank.user.controllers;

import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class TransactionalUnit {

    @FXML
    public Label acc_label;

    @FXML
    public Label amount_label;

    @FXML
    public Label date_label;

    @FXML
   public FontAwesomeIconView incoming_arrow;

    @FXML
    public FontAwesomeIconView message_button; // Error here

    @FXML
    public FontAwesomeIconView outgoing_arrow;

    @FXML
    public Label payee_address_label;

}
