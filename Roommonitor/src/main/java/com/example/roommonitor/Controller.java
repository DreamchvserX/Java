package com.example.roommonitor;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller{

    @FXML
    private Label counter;

    @FXML
    private Label counterMax;

    @FXML
    private Button decrease;

    @FXML
    private Button increase;

    @FXML
    private Button reset;

    @FXML
    private Button resetAll;


    @FXML
    public void increase(ActionEvent e) {
        int num = Integer.parseInt(counter.getText());
        counter.setText(Integer.toString(num+1));
        counterMax();

    }

    @FXML
    public void decrease(ActionEvent e) {
        int num = Integer.parseInt(counter.getText());
        if(num <= 0){
            num = 1;
        }
        counter.setText(Integer.toString(num-1));
    }

    @FXML
    public void counterMax(){
        int num = Integer.parseInt(counterMax.getText());
        counterMax.setText(Integer.toString(num+1));
    }

    @FXML
    public void reset(ActionEvent e){
        int num = Integer.parseInt(counterMax.getText());
        counter.setText(Integer.toString(num = 0));
    }

    @FXML
    void resetAll(ActionEvent event) {
        int num = Integer.parseInt(counterMax.getText());
        counter.setText(Integer.toString(num = 0));
        counterMax.setText(Integer.toString(num = 0));
    }

}
