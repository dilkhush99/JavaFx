module com.accord {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.base;
    requires javafx.graphics;
    requires javafx.web;


    opens com.accord to javafx.fxml;
    opens com.accord.controller to javafx.fxml;
    opens com.accord.model to javafx.fxml;
    exports com.accord;
    exports com.accord.model;
}
