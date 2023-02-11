package com.accord.controller;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

import java.time.LocalDate;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class FController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private DatePicker datepicker;

    @FXML
    private Hyperlink hyperlink;

    @FXML
    private TextField textfield;
    @FXML
    private Button save;

    @FXML
    private Spinner<Integer> spinner;
    int curretValue;

    @FXML
    void instalink(ActionEvent event) throws IOException, URISyntaxException {
        
        Stage webStage = new Stage();

        webStage.setTitle("Hyperlink");
        webStage.initModality(Modality.APPLICATION_MODAL);

        WebView webView = new WebView();

        webView.getEngine().load("https://google.com");

        VBox vBox = new VBox(webView);
        Scene scene = new Scene(vBox, 960, 600);
        // vBox.setVgrow(webView), Priority);

        webStage.setScene(scene);
        webStage.show();
    }

    @FXML
    void datepickersave(ActionEvent event) {

    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        SpinnerValueFactory<Integer> valueFactory = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 200);
        valueFactory.setValue(0);
        spinner.setValueFactory(valueFactory);

        spinner.setOnScroll(event -> {
            if (event.getDeltaY() > 0) {
                spinner.decrement();
            } else if (event.getDeltaY() < 0) {
                spinner.increment();
            }
        });

        save.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                LocalDate date = datepicker.getValue();
                textfield.setText("Date:" + date + " and Spinner:" + spinner.getValue());

            }
        });

        

    }

}
