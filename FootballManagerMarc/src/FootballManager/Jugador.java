package FootballManager;

public class Jugador extends Persona{
    //atributos
    int dorsal;
    String posicio;
    int qualitat;
//constructor
    public Jugador(int id, String nom, String cognom, String dataNaixament, int nivellMotivacio, int souAnual, int dorsal, String posicio, int qualitat) {
        super(id, nom, cognom, dataNaixament, nivellMotivacio, souAnual);
        this.dorsal = dorsal;
        this.posicio = posicio;
        this.qualitat = qualitat;
    }
}
