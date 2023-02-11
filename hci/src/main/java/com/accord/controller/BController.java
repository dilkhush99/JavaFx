package com.accord.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;

public class BController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button save;

    @FXML
    private PasswordField confirmpassword;

    @FXML
    private Label label;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private Label title;

    @FXML
    private PasswordField newpassword;

    @FXML
    private PasswordField oldpassword;

    @FXML
    void passwordsave(ActionEvent event) {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        save.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent arg0) {
                label.setText("Your New Password saved!");
                String oldPass = "Dilkhush9973@";

                if (oldPass.equals(oldpassword.getText())) {
                    if (oldpassword.getText() != newpassword.getText()) {
                        String newpass = newpassword.getText();
                        if (newpass.equals(confirmpassword.getText())) {
                            label.setText("New Password Created: " + newpassword.getText());
                        } else {
                            label.setText("New password and confirm password doesn't match!");
                        }
                    } else {
                        label.setText("New password cannot be the same as old password!");
                    }
                } else {
                    label.setText("Enter correct old Password!");
                }

            }
        });

    }

}
