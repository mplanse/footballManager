package FootballManager;

public class Entrenador extends Persona{
    //atributos
    int nroTornejosGuanyats;
    boolean seleccionadorNacional;
//constructor
    public Entrenador(int id,String nom, String cognom, String dataNaixament, int nivellMotivacio, int souAnual, int nroTornejosGuanyats, boolean seleccionadorNacional) {
        super(id, nom, cognom, dataNaixament, nivellMotivacio, souAnual);
        this.nroTornejosGuanyats = nroTornejosGuanyats;
        this.seleccionadorNacional = seleccionadorNacional;
    }
}
