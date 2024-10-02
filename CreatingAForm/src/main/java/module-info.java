module es.ieslosmontecillos.ejerciciodos {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.ejerciciodos to javafx.fxml;
    exports es.ieslosmontecillos.ejerciciodos;
}