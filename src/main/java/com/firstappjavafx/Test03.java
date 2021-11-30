package com.firstappjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class Test03 extends Application {

    // Hiển thị Information Alert với Header Text
    private void showAlertWithHeaderText() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Test connection");
        alert.setHeaderText("Result:");
        alert.setContentText("Connect to the database successfully");

        alert.showAndWait();
    }

    // Hiển thị Information Alert với Header Text mặc định
    private void showAlertWithDefaultHeaderText() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Test Connection");

        // alert.setHeaderText("Results:");
        alert.setContentText("Connect to the database successfully!");

        alert.showAndWait();
    }

    // Hiển thị Information Alert không có Header Text
    private void showAlertWithoutHeaderText() {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Test Connection");

        // Header Text: null
//        alert.setHeaderText("");
        alert.setContentText("Connect to the database successfully!");

        alert.showAndWait();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test alert");

        VBox vbox = new VBox();
        vbox.setPadding(new Insets(50));
        vbox.setSpacing(10);

        Button button01 = new Button("Information Alert");
        Button button02 = new Button("Information Alert with default Header Text");
        Button button03 = new Button("Information Alert without Header Text");

        button01.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                showAlertWithHeaderText();
                System.out.println(1);
            }
        });

        button02.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                showAlertWithDefaultHeaderText();
                System.out.println(2);
            }
        });

        button03.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                showAlertWithoutHeaderText();
                System.out.println(3);
            }
        });


        vbox.getChildren().addAll(button01, button02, button03);

        Scene scene = new Scene(vbox, 500, 600);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
