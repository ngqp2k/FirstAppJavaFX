package com.firstappjavafx;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Test01 extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Button button;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("First window");

        button = new Button();
        button.setText("Hello world");
        button.setAlignment(Pos.CENTER);
        button.setOnAction(
                new EventHandler<ActionEvent>() {
                    @Override
                    public void handle(ActionEvent actionEvent) {
                        System.out.println("ngqp2k second");
                    }

                }
        );

        Pane layout = new Pane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 500, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
