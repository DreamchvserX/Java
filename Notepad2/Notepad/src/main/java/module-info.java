module de.iad.oop.notepad {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens de.iad.oop.notepad.controllers to javafx.fxml;
    opens de.iad.oop.notepad.models;

    exports de.iad.oop.notepad;
}