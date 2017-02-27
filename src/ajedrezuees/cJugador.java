/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrezuees;

import java.util.Scanner;

/**
 *
 * @author INTEL-COREi7
 */
public class cJugador {

    static Scanner scan = new Scanner(System.in);

    protected String color;
    protected int cantidadTrebejos;
    protected String nombre;

    public cJugador() {
        this.color = " ";
        this.cantidadTrebejos = 0;
        this.nombre = " ";
    }

    public cJugador(String color, int cantidadTrebejos) {
        this.color = color;
        this.cantidadTrebejos = cantidadTrebejos;
        this.nombre = " ";
    }

    public void leerNombre(int num, String color) {
        System.out.println("Color: " + color);
        System.out.print("Nombre Jugador" + num + ": ");
        this.nombre = scan.nextLine();
    }

}
