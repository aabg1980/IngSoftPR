package co.edu.javeriana.ingsoft.pr.presentacion.general;

import java.io.IOException;
import java.util.ArrayList;


import co.edu.javeriana.ingsoft.pr.capas.facade.PeriodistasFacade;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.facade.IPeriodistasFacade;
import co.edu.javeriana.ingsoft.pr.presentacion.model.PeriodistaView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

public class PeriodistasPrincipalController {

    private IPeriodistasFacade facade;



    @FXML
    private TableView<PeriodistaView> tbData;

    @FXML
    public TableColumn<PeriodistaView, String> nombres;

    @FXML
    public TableColumn<PeriodistaView, String> apellidos;

    @FXML
    private void switchToPrimary() throws IOException {

        App.setRoot("Inicio");
    }

    @FXML
    public void loadPeriodistas() throws IOException {
        facade = new PeriodistasFacade();
        //make sure the property value factory should be exactly same as the e.g getStudentId from your model class
        nombres.setCellValueFactory(new PropertyValueFactory<>("nombres"));
        apellidos.setCellValueFactory(new PropertyValueFactory<>("apellidos"));

        //add your data to the table here.
        ArrayList<Periodista> periodistas = (ArrayList<Periodista>) facade.consultarPeriodistas();
        ArrayList<PeriodistaView> viewArrayList = new ArrayList<PeriodistaView>();
        for (Periodista p:periodistas) {
            PeriodistaView periodistaView = new PeriodistaView(p);
            viewArrayList.add(periodistaView);
        }
        listaPeriodistas = FXCollections.observableArrayList(viewArrayList);
        tbData.setItems(listaPeriodistas);



    }

    // add your data here from any source
    private ObservableList<PeriodistaView> listaPeriodistas
            = FXCollections.observableArrayList();


}