package com.accord.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class CController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textfield;

    @FXML
    private Button save;

    @FXML
    private ToggleGroup Gender;

    @FXML
    private RadioButton female_id;

    @FXML
    private RadioButton male_id;

    @FXML
    void radiosave(ActionEvent event) {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        save.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                RadioButton radiobutton = (RadioButton) Gender.getSelectedToggle();
                if (radiobutton == null) {
                    textfield.setText("Please Select Gender!");
                } else {
                    String selectedButton = radiobutton.getText();
                    textfield.setText(selectedButton);
                }

            }

        });

    }

}
