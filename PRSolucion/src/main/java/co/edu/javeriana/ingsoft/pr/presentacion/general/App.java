package co.edu.javeriana.ingsoft.pr.presentacion.general;

import javafx.scene.Scene;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App {

    private static Scene scene;

    /*@Override
    public void start(Stage stage) throws IOException {
        scene = new Scene(loadFXML("Inicio"), 640, 480);
        stage.setScene(scene);
        stage.show();
    }

    public static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }
   */
    public static void main(String[] args) throws IOException {
        Controller controlador = new Controller();

        controlador.iniciar();
        
    }

}