package lk.ijse.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class DashboardController {
    public AnchorPane rootnode;
    public AnchorPane suppliernode;
    public AnchorPane node;

    public void btncustomerform(ActionEvent actionEvent) throws IOException {

        Parent root= FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        this.node.getChildren().clear();
        this.node.getChildren().add(root);

    }

    public void btnitemform(ActionEvent actionEvent) throws IOException {


        Parent root= FXMLLoader.load(this.getClass().getResource("/view/item_form.fxml"));

        this.node.getChildren().clear();
        this.node.getChildren().add(root);




    }

    public void btnsupplierform(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/view/supplier_form.fxml"));

        this.node.getChildren().clear();
        this.node.getChildren().add(root);


    }

    public void btncust(ActionEvent actionEvent) throws IOException {
        Parent root= FXMLLoader.load(this.getClass().getResource("/view/customer_form.fxml"));

        this.node.getChildren().clear();
        this.node.getChildren().add(root);
    }

    public void btndash(ActionEvent actionEvent) throws IOException {

        Parent root= FXMLLoader.load(this.getClass().getResource("/view/dashboard_form.fxml"));
        Scene scene=new Scene(root);
        Stage stage= (Stage) this.rootnode.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Dashboard");
    }

    public void btnlogout(ActionEvent actionEvent) throws IOException {
        Parent root = FXMLLoader.load(this.getClass().getResource("/view/login_form.fxml"));
        Scene scene = new Scene(root);
        Stage stage = (Stage) this.rootnode.getScene().getWindow();
        stage.setScene(scene);
        stage.setTitle("Login");
        stage.centerOnScreen();
    }
}
