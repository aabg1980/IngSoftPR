package co.edu.javeriana.ingsoft.pr.presentacion.general;


public class PeriodistasPrincipalController {
/*
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
        for (Periodista p:periodistas) {
            PeriodistaView periodistaView = new PeriodistaView(p);
            viewArrayList.add(periodistaView);
        }
        listaPeriodistas = FXCollections.observableArrayList(viewArrayList);
        tbData.setItems(listaPeriodistas);

        String opcion;
        System.out.println("Digite 1 para añadir un periodista por la consola");
        System.out.println("Digite 2 para ver la información básica de los periodistas");
        System.out.println("Digite 3 para ver la información detallada de los periodistas");
        System.out.println("Digite 4 para salir");
        Scanner in=new Scanner(System.in);
        opcion=in.nextLine();
        switch (opcion){
            case "1":
                Periodista periodista=LeerPeriodista.leer();
                if(periodista!=null){
                    periodistas.add(periodista);
                }else{
                    System.out.println("ERROR: Revise la información e intentelo de nuevo");
                }
                    break;
            case "2":
                IFactoryPeriodistaView periodistaViewSimple= FabricaPeriodistaView.construir("Simple");
                periodistaViewSimple.imprimir(periodistas);
                    break;
            case "3":
                IFactoryPeriodistaView periodistaViewDetailed= FabricaPeriodistaView.construir("Detailed");
                periodistaViewDetailed.imprimir(periodistas);
                    break;
            case "4":

                break;
            default:
                System.out.println("Digite una opcion valida");
                break;
        }


    }

    // add your data here from any source
    private ObservableList<PeriodistaView> listaPeriodistas
            = FXCollections.observableArrayList();

*/
}
