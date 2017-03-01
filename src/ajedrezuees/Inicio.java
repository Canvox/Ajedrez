/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrezuees;

/**
 *
 * @author INTEL-COREi7
 */
public class Inicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        cTablero t = new cTablero();

        t.j1.leerNombre(1, "blanco");
        t.j2.leerNombre(2, "negro");
        t.j1.setLista();
        t.j2.setLista();

        t.setTablero();
        t.setTrebejosCelda();
        t.mostrarTablero();

        while (true) {
            while (true) {
                t.leer();
                if (t.tablero[t.x1][t.y1].color.compareTo("blanco") == 0) {
                    t.setmTrebejo();
                    t.mostrarTablero();
                    break;
                } else {
                    System.out.println("");
                    System.out.println("Turno del Jugador 1(blanco)");
                    System.out.println("");
                }

            }
            while (true) {
                t.leer();
                if (t.tablero[t.x1][t.y1].color.compareTo("negro") == 0) {
                    t.setmTrebejo();
                    t.mostrarTablero();
                    break;
                } else {
                    System.out.println("");
                    System.out.println("Turno del Jugador 2(negro)");
                    System.out.println("");
                }
            }

            //t.j1.mostrar();
            System.out.println("Blancas");
            t.j1.mostrarPeces();
            System.out.println("Negras");
            t.j2.mostrarPeces();
            if ((t.j1.cantidadTrebejos == 0) || (t.j2.cantidadTrebejos == 0)) {
                System.out.println("Juego Finalizado");
                if (t.j1.cantidadTrebejos == 0) {
                    System.out.println("Ganador: " + t.j2.nombre + "(" + t.j2.color + ")");
                    System.out.println("Perdedor: " + t.j1.nombre + "(" + t.j1.color + ")");
                    break;
                }
                if (t.j2.cantidadTrebejos == 0) {
                    System.out.println("Ganador: " + t.j1.nombre + "(" + t.j1.color + ")");
                    System.out.println("Perdedor: " + t.j2.nombre + "(" + t.j2.color + ")");
                    break;
                }
            }
        }
    }
}
