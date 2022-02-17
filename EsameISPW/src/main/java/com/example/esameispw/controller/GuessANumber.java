package com.example.esameispw.controller;


public class GuessANumber {

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