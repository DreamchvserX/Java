package de.iad.oop.notepad.controllers;

import de.iad.oop.notepad.models.Note;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class basicController {

    ObservableList<Note> data = FXCollections.<Note>observableArrayList(
            new Note("Abstand", "Immernoch Abstand halten"),
            new Note("Grillen", "Ich mag Züge"),
            new Note("Assi", "Mit Stiel")
    );
}
