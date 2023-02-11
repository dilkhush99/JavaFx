package com.accord.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.accord.AppLauncher;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

public class UserController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private AnchorPane dynamicView;

    @FXML
    private BorderPane borderpane;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private TextField title;


    private void loadView(String button) {
        Parent root = null;
        // System.out.println("check"+button);
        try {
            title.setText("Button "+button);
            root = FXMLLoader.load(AppLauncher.class.getResource("view/subview/" + button + ".fxml"));

            dynamicView.getChildren().clear();
            dynamicView.getChildren().add(root);
        } catch (Exception e) {
            System.out.println("no fxml detected");
        }
        // borderpane.setCenter(root);

    }

    @FXML
    void btnA(ActionEvent event) {
        loadView("a");

    }

    @FXML
    void btnB(ActionEvent event) {
        loadView("b");

    }

    @FXML
    void btnC(ActionEvent event) {
        loadView("c");

    }

    @FXML
    void btnD(ActionEvent event) {
        loadView("d");

    }

    @FXML
    void btnE(ActionEvent event) {
        loadView("e");

    }

    @FXML
    void btnF(ActionEvent event) {
        loadView("f");

    }

    @FXML
    void btnG(ActionEvent event) {
        loadView("g");

    }

    @FXML
    void theme(ActionEvent event) {
        loadView("theme");

    }

    @FXML
    void quit(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    void about(ActionEvent event) {
        loadView("about");

    }

    

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        loadView("a");

    }

}
