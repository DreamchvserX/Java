package de.iad.oop.notepad.controllers;

import de.iad.oop.notepad.models.Note;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class BasicController {

    ObservableList<Note> data = FXCollections.<Note>observableArrayList(
            new Note("Abstand" , "Immer noch Abstand halten"),
            new Note("Grillen", "Holz und Wurscht holen"),
            new Note("Java", "OOP lernen bei der IAD")
    );
}
