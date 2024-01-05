package com.example.almostthere;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class loginSceneController extends sqlSceneController {

    public Button btnBack;
    public Button btnSave;
    public TextField txtName;
    public TextField txtEmail;
    public TextField txtPassword;

    Parent root;

    public void onBackBtnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("startScene.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void onSaveBtnClick(ActionEvent event) throws IOException {

        String encryptedPassword = txtPassword.getText();

        /*Encryption here*/

        sqlConstructor sqlConstructor = new sqlConstructor(txtName.getText(), txtEmail.getText(), txtPassword.getText(), encryptedPassword);

        ObservableList<sqlConstructor> sqlConstructors = tblSQL.getItems();
        sqlConstructors.add(sqlConstructor);
        tblSQL.setItems(sqlConstructors);



        String name = txtName.getText();
        String email = txtEmail.getText();

        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("sqlScene.fxml"));

        root = fxmlLoader.load();

        /*sqlSceneController myObject = fxmlLoader.getController();*/

        /*myObject.*/DisplayInformation(name, email);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    /*@FXML
    void submitAccount(){
        String encryptedPassword = txtPassword.getText();

        *//*Encryption here*//*

        sqlConstructor sqlConstructor = new sqlConstructor(txtName.getText(), txtEmail.getText(), txtPassword.getText(), encryptedPassword);

        ObservableList<sqlConstructor> sqlConstructors = tblSQL.getItems();
        sqlConstructors.add(sqlConstructor);
        tblSQL.setItems(sqlConstructors);
    }*/
}
