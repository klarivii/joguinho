module com.mycompany.joguinho {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.joguinho to javafx.fxml;
    exports com.mycompany.joguinho;
}
