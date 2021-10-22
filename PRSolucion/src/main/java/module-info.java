module co.edu.javeriana.ingsoft.pr {
    requires javafx.controls;
    requires javafx.fxml;
    opens co.edu.javeriana.ingsoft.pr.presentacion.model;

    opens co.edu.javeriana.ingsoft.pr.presentacion.general to javafx.fxml;
    exports co.edu.javeriana.ingsoft.pr.presentacion.general;

}
