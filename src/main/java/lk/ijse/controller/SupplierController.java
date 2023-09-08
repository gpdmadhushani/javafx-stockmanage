package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class SupplierController {
    public AnchorPane suppliernode;

    public void btnisuppback(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));
        Scene scene=new Scene(root);
        Stage stage= (Stage) this.suppliernode.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
    }
}
