package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class ItemController {
    public AnchorPane itemnode;

    public void btnitemback(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));
        Scene scene=new Scene(root);
       Stage stage= (Stage) this.itemnode.getScene().getWindow();
       stage.setScene(scene);
       stage.setTitle("Dashboard");

    }
}
