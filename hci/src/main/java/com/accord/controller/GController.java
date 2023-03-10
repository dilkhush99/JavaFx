package com.accord.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.control.Slider;

public class GController implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ProgressBar progressbar;

    @FXML
    private ProgressIndicator progressindicator;

    @FXML
    private Slider slider;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        slider.valueProperty().addListener(new ChangeListener<Number>() {

            @Override
            public void changed(ObservableValue<? extends Number> arg0, Number arg1, Number arg2) {
                progressbar.setProgress((double) arg2 / 100);
                progressindicator.setProgress((double) arg2 / 100);

            }

        });
    }

}
