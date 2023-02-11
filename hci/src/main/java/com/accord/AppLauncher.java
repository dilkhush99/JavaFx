package com.accord;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;
// import javafx.stage.StageStyle;

import java.io.IOException;

/**
 * JavaFX AppLauncher
 */
public class AppLauncher extends Application {

    private static Scene scene;
    Rectangle2D scr=Screen.getPrimary().getVisualBounds();
    

    @Override
    public void start(Stage primaryStage) throws IOException {

        
        scene = new Scene(loadFXML("root"),scr.getWidth(),scr.getHeight());
        primaryStage.setScene(scene);
        // primaryStage.initStyle(StageStyle.UTILITY);
        primaryStage.setTitle("JavaFx Application");
       
        //primaryStage.setFullScreen(false);
        primaryStage.show();
       

    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }
    

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AppLauncher.class.getResource("view/"+fxml + ".fxml"));
        return fxmlLoader.load();
        
    }
    

    public static void main(String[] args) {
        launch();
    }

}