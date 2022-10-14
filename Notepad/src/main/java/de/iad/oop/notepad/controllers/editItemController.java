package de.iad.oop.notepad.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class editItemController extends basicController implements Initializable {

    @FXML
    private TextArea descriptionTxtArea;

    @FXML
    private Button saveBtn;

    @FXML
    private TextField titleTxtFld;

    @FXML
    void doBack(ActionEvent event) {

    }

    @FXML
    void doClear(ActionEvent event) {

    }

    @FXML
    void doSave(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
