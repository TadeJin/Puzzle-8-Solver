package com.javafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TextField input;

    @FXML   
    private TextField output;

    @FXML
    private TextField iterations;

    @FXML
    private TextField steps;


    public void run() {
        String inputValue = input.getText();

        
    }
}
