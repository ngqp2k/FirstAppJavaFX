package com.firstappjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Optional;

public class Test05 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        VBox pane = new VBox();
        pane.setPadding(new Insets(10));
        pane.setSpacing(20);

        Button button01 = new Button("Quit");

        Label label = new Label();

        button01.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);

                alert.setTitle("Quit");
                alert.setHeaderText("QUIT");
                alert.setContentText("Are you sure want to quit this window?");

                alert.getButtonTypes().clear();

                ButtonType btQuit = new ButtonType("Quit", ButtonBar.ButtonData.YES);
                ButtonType btCancel = new ButtonType("Cancel", ButtonBar.ButtonData.CANCEL_CLOSE);

                alert.getButtonTypes().addAll(btQuit, btCancel);

                Optional<ButtonType> opt = alert.showAndWait();

                if (opt.get() == btQuit) {
                    System.out.println("ok");
                    primaryStage.close();
                }
                else if (opt.get() == btCancel) {
                    System.out.println("cancel");
                    label.setText("continue program");
                    alert.close();
                }
            }
        });

        //label.setText("asdasd");

        pane.getChildren().addAll(button01, label);

        Scene scene = new Scene(pane, 300, 300);
        primaryStage.setTitle("Close");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
