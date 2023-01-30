module com.example.calculadoraimc {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.example.calculadoraimc to javafx.fxml;
    exports com.example.calculadoraimc;
}