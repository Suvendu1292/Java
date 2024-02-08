module com.internshala.javafxapp1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.internshala.javafxapp1 to javafx.fxml;
    exports com.internshala.javafxapp1;
}