package com.accord.controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ChoiceBox<String> choicebox;

    @FXML
    private ComboBox<String> combobox;

    @FXML
    private Button save;

    @FXML
    private TextField textfield;

    @FXML
    private AnchorPane comboap;

    @FXML
    void choicebtn(ActionEvent event) {
        String choiceboxs = choicebox.getSelectionModel().getSelectedItem();
        System.out.println(choiceboxs);

        // System.out.println(combobox.getValue());

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        choicebox.getItems().addAll("Java", "C", "C++");
        combobox.setItems(FXCollections.observableArrayList("C++", "Java", "Python"));

        // save.setOnAction(new EventHandler<ActionEvent>() {

        //     @Override
        //     public void handle(ActionEvent arg0) {
        //         if (choicebox.getValue() == null) {
        //             textfield.setText("Please Select!");
        //         } else  {
        //             textfield.setText("Language is :" + choicebox.getValue());
        //         }
        //     }

        // });

        save.setOnAction((e) -> {
            String option = combobox.getValue();
            String option1 = choicebox.getValue();
            textfield.setText("Langauge is :" + option1 + " and " +option);
            if(choicebox.getValue() == null && combobox.getValue()== null){
                textfield.setText("Please Select Option!");
            }

        });

        
        
    }
}
