package com.example.almostthere;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class sqlSceneController implements Initializable {

    public Button btnBack;
    public Label lblName;
    public Label lblEmail;
    public ImageView imgAvatar;
    public Button btnMainMenu;
    public Button btnRemove;

    @FXML
    public TableView<sqlConstructor> tblSQL;
    @FXML
    public TableColumn<sqlConstructor, Integer> IDColumn;
    @FXML
    public TableColumn<sqlConstructor, String> nameColumn;
    @FXML
    public TableColumn<sqlConstructor, String> emailColumn;
    @FXML
    public TableColumn<sqlConstructor, String> passwordColumn;
    @FXML
    public TableColumn<sqlConstructor, String> encryptedPasswordColumn;

    public void onBackBtnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("loginScene.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void onMainMenuBtnClick(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("startScene.fxml"));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.show();
    }

    public void DisplayInformation(String name, String email) {
        lblName.setText("Hello " + name);
        lblEmail.setText(email);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        IDColumn.setCellValueFactory(new PropertyValueFactory<sqlConstructor, Integer>("ID"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<sqlConstructor, String>("name"));
        emailColumn.setCellValueFactory(new PropertyValueFactory<sqlConstructor, String>("email"));
        passwordColumn.setCellValueFactory(new PropertyValueFactory<sqlConstructor, String>("password"));
        encryptedPasswordColumn.setCellValueFactory(new PropertyValueFactory<sqlConstructor, String>("encryptedPassword"));
    }

    @FXML
    void removeAccount(){
        int selectedID = tblSQL.getSelectionModel().getSelectedIndex();
        tblSQL.getItems().remove(selectedID);
    }
}
