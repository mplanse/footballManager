package FootballManager;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opcionMenu;
//creamos todos los arraylist
        ArrayList<Persona> jugadorsEntrenadors = new ArrayList<>();
        ArrayList<Jugador> jugadorsE1 = new ArrayList<>();
        ArrayList<Jugador> jugadorsE2 = new ArrayList<>();
        ArrayList<Equipo> equipos = new ArrayList<>();
//creamos objetos de la clase y lo añadimos a la arraylist que toca
        
        Jugador jugador1 = new Jugador(1,"Marc", "Plans", "02-04-2004", 98, 132000, 10, "DEF", 92);

        jugadorsE1.add(jugador1);

        Jugador jugador2 = new Jugador(2,"Leo", "Messi", "01-03-1999", 12, 145000, 12, "DAV", 99);

        jugadorsE2.add(jugador2);

        Entrenador entrenador1 = new Entrenador(3,"Pep", "Guardiola", "31-12-1977", 98, 432000, 23, true);
        Entrenador entrenador2 = new Entrenador(4,"Jose", "Mourinho", "03-02-1969", 85, 125000, 17, false);


        Jugador jugador3 = new Jugador(5,"David", "Villa", "06-09-1998", 78, 127000, 7, "DAV", 83);
        jugadorsEntrenadors.add(jugador3);

        Entrenador entrenador3 = new Entrenador(6,"Xavi", "Hernandez", "23-02-1985", 65, 98000, 5, false);
        jugadorsEntrenadors.add(entrenador3);

        Equipo equipo1 = new Equipo("FCB", 1899, "Barcelona", "Camp Nou", "Laporta", entrenador1, jugadorsE1);
        equipos.add(equipo1);
        Equipo equipo2 = new Equipo("Real Madrid", 1902, "Madrid", "Santiago Bernabeu", "Florentino", entrenador2, jugadorsE2);
        equipos.add(equipo2);

//menu general
        
        do {
            opcionMenu = menuInicio();
            distribucionMenu(opcionMenu, equipos,jugadorsEntrenadors);
        } while (opcionMenu != 0);
    }

    private static void distribucionMenu(int opcionMenu, ArrayList<Equipo> equipos, ArrayList<Persona> jugadorsEntrenadors) {
        switch (opcionMenu) {
            case 0:
                despedida();
                break;
            case 1:
                clasificacionLiga();
                break;
            case 2:
                buscarEquipo(equipos, jugadorsEntrenadors);
                break;
            case 3:
                darAltaEquipo();
                break;
            case 4:
                darDeAltaJugadorOEntrenador();
                break;
            case 5:
                consultarDatosEquipos();
                break;
            case 6:
                consultarDatosJugador();
                break;
            case 7:
                disputarLiga();
                break;
            case 8:
                sesionEntrenamiento();
                break;
            case 9:
                cargarDatosEquipo();
                break;
            case 10:
                guardarDatosEquipo();
                break;
            case 11:
                cargarMercadoFichajes();
                break;
        }
    }

    private static void cargarMercadoFichajes() {
    }

    private static void guardarDatosEquipo() {

    }

    private static void cargarDatosEquipo() {

    }

    private static void sesionEntrenamiento() {

    }

    private static void disputarLiga() {

    }

    private static void consultarDatosJugador() {

    }

    private static void consultarDatosEquipos() {

    }

    private static void darDeAltaJugadorOEntrenador() {

    }

    private static void darAltaEquipo() {

    }

    private static void buscarEquipo(ArrayList<Equipo> equipos, ArrayList<Persona> jugadorsEntrenadors) {
        Scanner scanner = new Scanner(System.in);
        String nombreABuscar;
        System.out.println("Que equipo quieres gestionar?");
        nombreABuscar = scanner.nextLine();
        boolean equipoEncontrado = false;
        for (Equipo equipo : equipos) {
            if (equipo.getNom().equalsIgnoreCase(nombreABuscar)) {
                System.out.println("Equipo encontrado: " + equipo.getNom());
                equipoEncontrado = true;
                menuGestionarEquipo(equipo, equipos,jugadorsEntrenadors);
            }
        }
        if (!equipoEncontrado) {
            System.out.println("Lo sentimos no hemos encontrado el equipo");
        }

    }

    private static void menuGestionarEquipo(Equipo equipo, ArrayList<Equipo> equipos, ArrayList<Persona> jugadorsEntrenadors) {
        int opcionMenuGestionarEquipo;
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Que quieres hacer con tu equipo?");
            System.out.println("   1-Donar de baixa equip");
            System.out.println("   2-Modificar president");
            System.out.println("   3-Destituir entrenador");
            System.out.println("   4-Fitxar jugador o entrenador");
            System.out.println("   5-Transferir jugador");
            System.out.println("0-Sortir");
            opcionMenuGestionarEquipo = scanner.nextInt();

        } while (opcionMenuGestionarEquipo < 0 || opcionMenuGestionarEquipo > 5);

        switch (opcionMenuGestionarEquipo) {
            case 0:
                despedida();
                break;
            case 1:
                donarDeBaixaEquip(equipo, equipos);
                break;
            case 2:
                modificarPresident(equipo);
                break;
            case 3:
                destituirEntrenador(equipo);
                break;
            case 4:
                fitxarJugadorEntrenador(jugadorsEntrenadors);
                break;
            case 5:
                transferirJugador();
                break;

        }


    }

    private static void transferirJugador() {
    }

    private static void fitxarJugadorEntrenador(ArrayList<Persona> jugadorsEntrenadors) {
        Scanner scanner = new Scanner(System.in);
        int respuesta;
        
        do {
            System.out.println("Que quieres fichar? 1 para jugador 0 para entrenador?");
            respuesta=scanner.nextInt();
        }while (respuesta!=0 && respuesta!=1);
        if (respuesta==1){
            ficharJugador(jugadorsEntrenadors);
        }else {
            ficharEntrenador(jugadorsEntrenadors);
        }
    }
//aqui
    private static void ficharEntrenador(ArrayList<Persona> jugadorsEntrenadors) {
        Scanner scanner = new Scanner(System.in);

        for (Persona persona : jugadorsEntrenadors) {
            if (persona instanceof Entrenador) {
                System.out.println();
                System.out.println(persona.getNom()+" "+persona.getCognom());

            }
        }
        System.out.println("Cual quieres fichar? (Introduce nombre y apellido)");
        String jugadorAFichar = scanner.nextLine();
    }
    private static void ficharJugador(ArrayList<Persona> jugadorsEntrenadors) {
        Scanner scanner = new Scanner(System.in);

        for (Persona persona : jugadorsEntrenadors) {
            if (persona instanceof Jugador) {
                System.out.println();
                System.out.println(persona.getNom()+" "+persona.getCognom());

            }
        }
        System.out.println("Cual quieres fichar? (Introduce nombre y apellido)");
        String jugadorAFichar = scanner.nextLine();

    }

    private static void destituirEntrenador(Equipo equipo) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;
        do {
            System.out.println("Estas seguro de que quieres eliminar el entrenador" + equipo.getEntrenador().getNom() + ". Introduce solo Y para si N para no");
            respuesta = scanner.nextLine();
        } while (!respuesta.equalsIgnoreCase("y") && !respuesta.equalsIgnoreCase("n"));
        if (respuesta.equals("y")) {
            equipo.setEntrenador(null);
        } else {
            System.out.println("Perfecto! No hay problema");
        }
    }

    private static void modificarPresident(Equipo equipo) {
        Scanner scanner = new Scanner(System.in);
        String nouPresident;

        System.out.println("Introduce el nombre del nuevo presidente:");
        nouPresident = scanner.nextLine();
        if (equipo.getNomPresident() == null) {
            equipo.setNomPresident(nouPresident);
        } else if (equipo.getNomPresident().equalsIgnoreCase(nouPresident)) {
            System.out.println(nouPresident + " Ja es el actual president!");
        } else {
            equipo.setNomPresident(nouPresident);
        }


    }

    private static void donarDeBaixaEquip(Equipo equipo, ArrayList<Equipo> equipos) {
        Scanner scanner = new Scanner(System.in);
        String respuesta;

        do {
            System.out.println("Estas seguro de que quieres eliminar " + equipo.getNom() + ". Introduce solo Y para si N para no");
            respuesta = scanner.nextLine();
        } while (!respuesta.toLowerCase().equals("y") && !respuesta.toLowerCase().equals("n"));
        if (respuesta.equals("y")) {
            equipos.remove(equipo);
        } else {
            System.out.println("Perfecto! No hay problema");
        }
    }

    private static void clasificacionLiga() {

    }

    private static void despedida() {
        System.out.println("Espero verte pronto!!");
    }

    private static int menuInicio() {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println();
            System.out.println();
            System.out.println("Que accion quieres realizar?");
            System.out.println("    1-Ver clasificacion de la liga");
            System.out.println("    2-Gestionar equipo");
            System.out.println("    3-Dar de alta equipo");
            System.out.println("    4-Dar de alta entrenador o jugador");
            System.out.println("    5-Consultar datos del equipo");
            System.out.println("    6-Consultar datos del jugador");
            System.out.println("    7-Disputar nueva liga");
            System.out.println("    8-Realizar sesion de entrenamiento");
            System.out.println("    9-Cargar datos del equipo");
            System.out.println("    10-Guardar datos del equipo");
            System.out.println("    11-Cargar mercado de fichajes");
            System.out.println("    0-Salir");
            opcion = scanner.nextInt();
        } while (opcion < 0 || opcion > 11);

        return opcion;
    }
}