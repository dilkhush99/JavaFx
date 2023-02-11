package com.accord.controller;

import java.net.URL;
import java.util.ResourceBundle;

import com.accord.model.UserDetails;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeTableColumn;
import javafx.scene.control.TreeTableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TreeItemPropertyValueFactory;

public class AController implements Initializable{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TableView<UserDetails> table;

    @FXML
    private TableColumn<UserDetails, String> address;

    @FXML
    private TableColumn<UserDetails, String> firstname;

    @FXML
    private TableColumn<UserDetails, String> lastname;

    //treetable
    @FXML
    private TreeTableView<UserDetails> treetable;

    @FXML
    private TreeTableColumn<UserDetails, String> txtaddress;

    @FXML
    private TreeTableColumn<UserDetails, String> txtfirstname;

    @FXML
    private TreeTableColumn<UserDetails, String> txtlastname;

    TreeItem<UserDetails> user1 = new TreeItem<>(new UserDetails("Dilkhush", "Kumar", "Bihar"));
    TreeItem<UserDetails> user2 = new TreeItem<>(new UserDetails("Meghana", "BK", "Karnataka"));
    TreeItem<UserDetails> user3 = new TreeItem<>(new UserDetails("Rohit", "Kumar", "Karnataka"));
    
    

    TreeItem<UserDetails> root = new TreeItem<>(new UserDetails("firstName", "lastName", "address"));
    

    TreeItem<UserDetails> user11 = new TreeItem<>(new UserDetails("Nividita", "S", null));
    TreeItem<UserDetails> user12 = new TreeItem<>(new UserDetails("Anant", "Kumar", null));
    TreeItem<UserDetails> user13 = new TreeItem<>(new UserDetails("Roshan", "LB", null));

    TreeItem<UserDetails> user21 = new TreeItem<>(new UserDetails("Nividita", "S", null));
    TreeItem<UserDetails> user22 = new TreeItem<>(new UserDetails("Anant", "Kumar", null));
    
    


//tableview
    ObservableList<UserDetails> list = FXCollections.observableArrayList(
        new UserDetails("Dilkhush","Kumar","Bihar"),
        new UserDetails("Roshan","LB","Chennai"),
        new UserDetails("Anant","Kumar","Karnataka")
    );

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {

        //tableview
        firstname.setCellValueFactory(new PropertyValueFactory<>("firstname"));
        lastname.setCellValueFactory(new PropertyValueFactory<>("lastname"));
        address.setCellValueFactory(new PropertyValueFactory<>("address"));

        table.setItems(list);
        user1.getChildren().addAll(user11,user12,user13);
        user2.getChildren().addAll(user21,user22);
        root.getChildren().addAll(user1,user2,user3);

        // //treetable
        // //root.getChildren().setAll(user1,user2,user3);
        // //root1.getChildren().setAll(user4,user5);
        // root.getChildren().add(root1);
        // // root1.getChildren().setAll(user4,user5,user6);
        
        txtfirstname.setCellValueFactory(new TreeItemPropertyValueFactory<>("firstname"));
        txtlastname.setCellValueFactory(new TreeItemPropertyValueFactory<>("lastname"));
        txtaddress.setCellValueFactory(new TreeItemPropertyValueFactory<>("address"));
        treetable.setRoot(root);
        treetable.setShowRoot(false);
        // treetable.setRoot(root1);
        // treetable.setRoot(root1);
        // treetable.setShowRoot(false);


    
        
    }

    

}
