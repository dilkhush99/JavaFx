package com.accord.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;

public class EController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ToggleButton off;

    @FXML
    private ToggleButton on;

    @FXML
    private TextField textfield;

    @FXML
    private Button save;

    @FXML
    private CheckBox python;

    @FXML
    private CheckBox cpp;

    @FXML
    private CheckBox java;

    @FXML
    void toggleButton(ActionEvent event) {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        save.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                String selectedOption = "";
                if(on.isSelected()) {
                    selectedOption +=" "+on.getText();
                }
                if (off.isSelected()) {
                    selectedOption +=" "+off.getText();
                
                }
                if (java.isSelected()) {
                    selectedOption +=" "+java.getText();
                    // textfield.setText(selectedOption);
                    System.out.println(selectedOption);
                }
                if (cpp.isSelected()) {
                    selectedOption +=" "+cpp.getText();
                    System.out.println(selectedOption);
                }
                if (python.isSelected()) {
                    selectedOption +=" "+python.getText();
                    System.out.println(selectedOption);
                }
                if(selectedOption.isEmpty()){
                    textfield.setText("Please Select");
                }
                else{
                textfield.setText(selectedOption);
                }

            }

        });
    }

}
