package FootballManager;

public class Persona {

    //atributos
    protected int id;
   protected String nom;
   protected String Cognom;
   protected String dataNaixament;
   protected int nivellMotivacio;
   protected int souAnual;


   //getters y setters

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognom() {
        return Cognom;
    }

    public void setCognom(String cognom) {
        Cognom = cognom;
    }

    public String getDataNaixament() {
        return dataNaixament;
    }

    public void setDataNaixament(String dataNaixament) {
        this.dataNaixament = dataNaixament;
    }

    public int getNivellMotivacio() {
        return nivellMotivacio;
    }

    public void setNivellMotivacio(int nivellMotivacio) {
        this.nivellMotivacio = nivellMotivacio;
    }

    public int getSouAnual() {
        return souAnual;
    }

    public void setSouAnual(int souAnual) {
        this.souAnual = souAnual;
    }

    //constructor


    public Persona( int id,String nom, String cognom, String dataNaixament, int nivellMotivacio, int souAnual) {
        this.id = id;
        this.nom = nom;
        Cognom = cognom;
        this.dataNaixament = dataNaixament;
        this.nivellMotivacio = nivellMotivacio;
        this.souAnual = souAnual;
    }
}
