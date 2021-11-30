package com.firstappjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class Test04 extends Application {
    private Label label;

    private void showConfirmation() {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Delete file");
        alert.setHeaderText("Are you sure want to move this file to the Recycle Bin?");
        alert.setContentText("solve.cpp");

        Optional<ButtonType> opt = alert.showAndWait();

        if (opt.get() == null) {
            label.setText("No selection!");
        }
        else if (opt.get().getButtonData() == ButtonBar.ButtonData.OK_DONE) {
            label.setText("File deleted!");
            System.out.println("ok");
        }
        else if (opt.get().getButtonData() == ButtonBar.ButtonData.CANCEL_CLOSE) {
            label.setText("Canceled!");
            System.out.println("cancel");
        }
        else
            label.setText("---!!!---");
    }



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox root = new VBox();
        root.setPadding(new Insets(20));
        root.setSpacing(10);

        this.label = new Label();

        Button button = new Button("Click here to delete file...");

        button.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent actionEvent) {
                showConfirmation();
            }
        });

        this.label.setText("nnn");
        this.label.setText("qq");

        root.getChildren().addAll(button, label);

        Scene scene = new Scene(root, 500, 500);
        primaryStage.setTitle("Test Alert");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
