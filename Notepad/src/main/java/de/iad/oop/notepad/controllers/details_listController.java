package de.iad.oop.notepad.controllers;

import de.iad.oop.notepad.models.Note;
import javafx.beans.InvalidationListener;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.KeyEvent;

import java.net.URL;
import java.util.ResourceBundle;
import java.util.function.Predicate;


public class details_listController extends basicController implements Initializable {
    @FXML
    private Button btnDelete;
    @FXML
    private Button btnEdit;
    // Version 1.0  HACK LB 24.05 Array List


    FilteredList<Note> filteredList = new FilteredList<>(data);


    Alert info;
     Note note;

    @FXML
    private TableColumn<Note, String> descriptionTc;

    @FXML
    private TableColumn titleTc;

    @FXML
    private Label notesCount;

    private void setNotesCount(){

        notesCount.setText(data.size() + " Notes");
    }

    @FXML
    private TableView<Note> notesListTable;
    SelectionModel<Note> selectionModel;

    @FXML
    private TextField searchNotes;


    @FXML
    void doDelete(ActionEvent event) {
        //Alert wollen sie wirklich löschen ?

       info = new Alert(Alert.AlertType.CONFIRMATION);
        info.setContentText("Wollen sie wirlich löschen?");
        var res = info.showAndWait();


        if (res.get() == ButtonType.OK){
            data.remove(selectionModel.getSelectedItem());
            selectionModel.clearSelection();
            setNotesCount();
            return;

            //info = new Alert(Alert.AlertType.CONFIRMATION, "Wollen Sie es wirklich löschen?", ButtonType.YES, ButtonType.NO).showAndWait(); //Mansch Version

         }

    }

    @FXML
    void doEdit(ActionEvent event) {

        info = new Alert(Alert.AlertType.CONFIRMATION);
        info.setContentText("Wollen sie bearbeiten?");
        var res = info.showAndWait();


    }

    @FXML
    void newNote(ActionEvent event) {

    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        titleTc.setCellValueFactory(new PropertyValueFactory<>("title"));
        descriptionTc.setCellValueFactory(p -> new ReadOnlyStringWrapper(p.getValue().getDescription()));
        notesListTable.setItems(filteredList);
        selectionModel = notesListTable.getSelectionModel();

        btnDelete.disableProperty().bind(Bindings.isNull(selectionModel.selectedItemProperty()));
        btnEdit.disableProperty().bind(Bindings.isNull(selectionModel.selectedItemProperty()));

        setNotesCount();

    }

    public void onKeySearch(KeyEvent keyEvent) {

     /*   searchNotes.textProperty().addListener((observableValue, oldV, newV) ->{
           filteredList.setPredicate(item ->{
                return item.getDescription().toUpperCase().contains(newV.toUpperCase()) || item.getTitle().toUpperCase().contains(newV);
            });
        });*/



           // if(searchNotes == null || searchNotes.textProperty().isEmpty()) {
           //}};


        searchNotes.setOnKeyPressed(keyEvent1 -> filteredList.setPredicate(p -> {
            if(searchNotes.getText()==null || searchNotes.getText().trim().isEmpty()){
                return true;
            }else{
                return p.getTitle().contains(searchNotes.getText()) || p.getDescription().contains(searchNotes.getText());
            }

        }));


    }
}
