package com.example.esameispw.controller;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Random;

public class GuiControllerGuessANumber extends Application {
    @FXML
    private Button submit;
    @FXML
    private TextField textField;
    @FXML
    private Label guessHint;
    public Random random = new Random();
    public int select = random.nextInt(100);
    GuessANumber ha = new GuessANumber();

    public void guessANumber(ActionEvent actionEvent){
        String result = ha.checkNumber(textField.getText(),select);
        if (result == "Number Guessed"){
            submit.setDisable(true);
            guessHint.setText(result);
        }
        else{
            guessHint.setText(result);
        }
    }

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GuiControllerGuessANumber.class.getResource("/com/example/esameispw/hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}