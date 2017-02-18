/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajedrezuees;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Scanner;

/**
 *
 * @author valentinam.peralta
 */

public class cTrebejo {

    static Scanner scan = new Scanner(System.in);

    protected String color;
    protected int numero;
    protected char inicial;

    public cTrebejo() {
        this.color = " ";
        this.numero = 0;
        this.inicial = ' ';
    }

    public cTrebejo(String color, int numero, char inicial) {
        this.color = color;
        this.numero = numero;
        this.inicial = inicial;
    }

    public static Scanner getScan() {
        return scan;
    }

    public static void setScan(Scanner scan) {
        cTrebejo.scan = scan;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public char getInicial() {
        return inicial;
    }

    public void setInicial(char inicial) {
        this.inicial = inicial;
    }

    public boolean moverTrebejo(cTrebejo tablero[][], int x1, int x2, int y1, int y2) {
        boolean respuesta = true;
        this.numero = 1;

        return respuesta;
    }

    public boolean validacion(int x1, int x2, int y1, int y2) {
        boolean resp = false;
        int con = 0;

        if (x1 != x2) {
            con++;
        }
        if (y1 != y2) {
            con++;
        }
        if (con == 2) {
            resp = true;
        }
        return resp;
    }

    public boolean celdaOcupada(cTrebejo tablero[][], int n1, int m1) {
        boolean resp = false;
        if (tablero[n1][m1].numero == 1) {
            resp = true;
        }
        return resp;
    }
}