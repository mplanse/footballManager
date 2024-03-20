package FootballManager;

import java.util.ArrayList;

public class Equipo {
    protected String nom;
    protected int anyfundacio;
    protected String ciutat;
    protected String nomEstadi;
    protected String nomPresident;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadors;

    public Equipo(String nom, int anyfundacio, String ciutat, String nomEstadi, String nomPresident, Entrenador entrenador, ArrayList<Jugador> jugadors) {
        this.nom = nom;
        this.anyfundacio = anyfundacio;
        this.ciutat = ciutat;
        this.nomEstadi = nomEstadi;
        this.nomPresident = nomPresident;
        this.entrenador = entrenador;
        this.jugadors = jugadors;
    }



    public String getNom() {
        return nom;
    }

    public String getNomPresident() {
        return nomPresident;
    }

    public void setNomPresident(String nomPresident) {
        this.nomPresident = nomPresident;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
