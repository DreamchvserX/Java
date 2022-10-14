package de.iad.oop.notepad.controllers;

import de.iad.oop.notepad.models.Note;
import javafx.beans.binding.Binding;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ReadOnlyStringWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.util.ResourceBundle;

public class details_listController extends BasicController implements Initializable {
     Alert info;

    // Version 1.0   HACK LB 24.05 Array List


    FilteredList<Note> filteredList = new FilteredList<>(data,n->true);
    SelectionModel<Note> selectionModel;
    @FXML
    private TableColumn <Note,String> descriptionTc;
    @FXML
    private TableColumn<?,?>titleTc;

    @FXML
    private TableView<Note> notesListTable;

    @FXML
    private Label notesCount;

    @FXML
    private TextField searchNotes;

    @FXML
    private Button btn_delete;
    @FXML
    private Button btn_edit;
    @FXML
    void doDelete(ActionEvent event) {
        // Alert Wollen Sie wirklich löschen?
        info = new Alert(Alert.AlertType.CONFIRMATION);
        info.setContentText("Wollen Sie wirklich loeschen?");
        var res = info.showAndWait();
        if(res.get() == ButtonType.OK){
            data.remove(selectionModel.getSelectedItem());
            return;
        }


    }

    @FXML
    void doEdit(ActionEvent event) {

    }


    @FXML
    void newNote(ActionEvent event) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        titleTc.setCellValueFactory(new PropertyValueFactory<>("title"));
        descriptionTc.setCellValueFactory(p-> new ReadOnlyStringWrapper(p.getValue().getDescription()));

        notesListTable.setItems(filteredList);

        selectionModel=notesListTable.getSelectionModel();
        btn_delete.disableProperty().bind(selectionModel.selectedItemProperty().isNull());
        btn_edit.disableProperty().bind(selectionModel.selectedItemProperty().isNull());
        // Hack LB 25.05.2022 Binding
        notesCount.textProperty().bind( Bindings.createStringBinding(()->(data.size()==1)? data.size()+" Notiz" : data.size()+" Notizen"));
        /*searchNotes.setOnKeyReleased(event -> {
            filteredList.setPredicate(p -> {
                if(searchNotes.getText()==null || searchNotes.getText().trim().isEmpty()){
                    return true;
                }else{
                    return p.getTitle().toLowerCase().contains(searchNotes.getText().toLowerCase()) ||
                            p.getDescription().toLowerCase().contains(searchNotes.getText().toLowerCase());
                }
            });
        });*/

        searchNotes.textProperty().addListener((os,ov, nv)->{
            filteredList.setPredicate(item->{
                return item.getDescription().contains(nv) || item.getTitle().contains(nv);
            });
        });


    }
}
