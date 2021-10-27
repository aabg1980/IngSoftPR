package co.edu.javeriana.ingsoft.pr.presentacion.general;

import java.io.IOException;

import javafx.fxml.FXML;

public class PRPrincipalController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("PeriodistasPrincipal");
    }

    @FXML
    private void switchToSecondaryM() throws IOException {
        App.setRoot("MediosPrincipal");
    }
}
