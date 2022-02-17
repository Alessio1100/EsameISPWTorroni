package com.example.esameispw.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GuessANumber {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public String checkNumber(String text,int select) {
        int numberInsert = Integer.parseInt(text);
        if (numberInsert==select){
            return "Number Guessed";
        }
        else if (numberInsert<select){
            return "guess Higher";
        }
        else {
            return "guess lower";
        }

    }
}