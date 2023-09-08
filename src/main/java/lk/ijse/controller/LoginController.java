package lk.ijse.controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import lk.ijse.db.Db;

public class LoginController {

    public AnchorPane rootnode;
    public TextField usernamefield;
    public PasswordField passwordfield;
    public AnchorPane rootlogin;


    public void btnlogin(ActionEvent actionEvent) throws IOException {
String us=usernamefield.getText();
String pas=passwordfield.getText();

if(us.equals(Db.username) & pas.equals(Db.password)) {

    navigate();


}else{
new Alert(Alert.AlertType.ERROR,"Credential Invalid").show();
}

    }

    public void navigate() throws IOException {

        Parent root = FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) this.rootlogin.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
        stage.centerOnScreen();
    }


    public void btnnewreg(ActionEvent actionEvent) throws IOException {


        Parent root = FXMLLoader.load(this.getClass().getResource("/view/register_form.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) this.rootlogin.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Register");
        stage.centerOnScreen();

    }
}
