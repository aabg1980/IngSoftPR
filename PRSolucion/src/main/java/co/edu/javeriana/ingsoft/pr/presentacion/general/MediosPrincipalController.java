package co.edu.javeriana.ingsoft.pr.presentacion.general;

import co.edu.javeriana.ingsoft.pr.capas.facade.MediosFacade;
import co.edu.javeriana.ingsoft.pr.capas.facade.PeriodistasFacade;
import co.edu.javeriana.ingsoft.pr.core.modelo.Medio;
import co.edu.javeriana.ingsoft.pr.core.modelo.Periodista;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.facade.IMediosFacade;
import co.edu.javeriana.ingsoft.pr.interfaces.capas.facade.IPeriodistasFacade;
import co.edu.javeriana.ingsoft.pr.presentacion.model.MedioView;
import co.edu.javeriana.ingsoft.pr.presentacion.model.PeriodistaView;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.util.ArrayList;

public class MediosPrincipalController {

    private IMediosFacade facade;

    @FXML
    private TableView<MedioView> tbData;

    @FXML
    public TableColumn<MedioView, String> nombres;

    @FXML
    public TableColumn<MedioView, String> atributo;

    @FXML
    private void switchToPrimary() throws IOException {

        App.setRoot("Inicio");
    }

    @FXML
    public void loadMedios() throws IOException {
        facade = new MediosFacade();
        //make sure the property value factory should be exactly same as the e.g getStudentId from your model class
        nombres.setCellValueFactory(new PropertyValueFactory<>("nombres"));
        atributo.setCellValueFactory(new PropertyValueFactory<>("atributo"));

        //add your data to the table here.
        ArrayList<Medio> medios = (ArrayList<Medio>) facade.consultarMedios();
        ArrayList<MedioView> viewArrayList = new ArrayList<MedioView>();
        for (Medio m:medios) {
            MedioView medioView = new MedioView(m);
            viewArrayList.add(medioView);
        }
        listaMedios = FXCollections.observableArrayList(viewArrayList);
        tbData.setItems(listaMedios);



    }

    // add your data here from any source
    private ObservableList<MedioView> listaMedios
            = FXCollections.observableArrayList();


}