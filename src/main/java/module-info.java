module org.example.myjavafxapp {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;

    opens org.example.myjavafxapp to javafx.fxml;
    exports org.example.myjavafxapp;
}