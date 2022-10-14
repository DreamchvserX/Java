package de.iad.oop.notepad.models;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringPropertyBase;

public class Note {

    private final SimpleStringProperty title;
    private final SimpleStringProperty description;

    public Note(String title, String description) {
        this.title = new SimpleStringProperty(title);
        this.description = new SimpleStringProperty(description);
    }

    public String getTitle() {
        return title.get();
    }

    public StringPropertyBase getTtile() {
        return title;
    }

    public void setTitle(String title) {
        this.title.set(title);
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String description) {
        this.description.set(description);
    }

    @Override
    public String toString() {
        return "note{" +
                "title=" + title +
                ", description=" + description +
                '}';
    }
}
