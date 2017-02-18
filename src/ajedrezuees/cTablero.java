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
public class cTablero {

    static Scanner scan = new Scanner(System.in);

    private cTrebejo[][] tablero = new cTrebejo[10][10];
    protected cJugador j1, j2;
    private boolean disponible;
    private int x1, x2, y1, y2;

    public cTablero() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                tablero[i][j] = new cTrebejo();
            }
        }
        j1 = new cJugador("blanco");
        j2 = new cJugador("negro");
    }

    public void setTablero() {
        int j = 1;
        char i;
        for (i = 'a'; i <= 'h'; i++) {
            tablero[0][j].setInicial(i);
            tablero[9][j].setInicial(i);
            j++;
        }
        j = 1;
        for (char k = 56; k > 48; k--) {
            tablero[j][0].setInicial(k);
            tablero[j][9].setInicial(k);
            j++;
        }
    }

    public void gestionTablero() {

    }

    public void mostrarTablero() {

        for (int row = 0; row < tablero.length; row++) {
            for (int column = 0; column < tablero[row].length; column++) {
                System.out.print(" | " + tablero[row][column].inicial);
            }
            System.out.println(" |");
            System.out.println();
            if (row != 9) {
                System.out.println("-------------------------------------------");
            }
        }
    }

    public void checkDisponibilidad() {

    }

    public void setTrebejosCelda() {
        int j = 7;

        tablero[8][3] = new cAlfil();
        tablero[8][6] = new cAlfil();
        tablero[8][1] = new cTorre();
        tablero[8][8] = new cTorre();
        tablero[8][2] = new cCaballo();
        tablero[8][7] = new cCaballo();
        tablero[8][4] = new cReina();
        tablero[8][5] = new cRey();
        for (int i = 1; i < 9; i++) {
            tablero[j][i] = new cPeon(1);
        }
        j = 2;
        tablero[1][3] = new cAlfil();
        tablero[1][6] = new cAlfil();
        tablero[1][1] = new cTorre();
        tablero[1][8] = new cTorre();
        tablero[1][2] = new cCaballo();
        tablero[1][7] = new cCaballo();
        tablero[1][4] = new cReina();
        tablero[1][5] = new cRey();
        for (int i = 1; i < 9; i++) {
            tablero[j][i] = new cPeon(1);
        }
    }

    public void setmTrebejo() {
        this.leer();
        while (true) {
            this.tablero[x2][y2] = this.tablero[x1][y1];
            this.tablero[x1][y1] = new cTrebejo();
            if ((this.tablero[x1][y1].moverTrebejo(this.tablero, x1, x2, y1, y2)) == true){
                System.out.println("asd");
                break;
            }
        }

    }

    public void leer() {
        char column = ' ';
        while ((column != 'a' && column != 'b' && column != 'c' && column != 'd' && column != 'e' && column != 'f' && column != 'g' && column != 'h')) {
            System.out.print("Ingrese la letra: ");
            column = scan.next().charAt(0);

            switch (column) {
                case 'a':
                    this.y1 = 1;
                    break;
                case 'b':
                    this.y1 = 2;
                    break;
                case 'c':
                    this.y1 = 3;
                    break;
                case 'd':
                    this.y1 = 4;
                    break;
                case 'e':
                    this.y1 = 5;
                    break;
                case 'f':
                    this.y1 = 6;
                    break;
                case 'g':
                    this.y1 = 7;
                    break;
                case 'h':
                    this.y1 = 8;
                    break;
                default:
                    System.out.println("No puede ingresar esa letra");

            }
        }
        //valir que no este fuera de rango
        //agregar try catch
        System.out.print("Ingrese el numero: ");
        this.x1 = scan.nextInt();
        scan.nextLine();
        column = ' ';

        while ((column != 'a' && column != 'b' && column != 'c' && column != 'd' && column != 'e' && column != 'f' && column != 'g' && column != 'h')) {
            System.out.print("Ingrese la letra: ");
            column = scan.next().charAt(0);

            switch (column) {
                case 'a':
                    this.y2 = 1;
                    break;
                case 'b':
                    this.y2 = 2;
                    break;
                case 'c':
                    this.y2 = 3;
                    break;
                case 'd':
                    this.y2 = 4;
                    break;
                case 'e':
                    this.y2 = 5;
                    break;
                case 'f':
                    this.y2 = 6;
                    break;
                case 'g':
                    this.y2 = 7;
                    break;
                case 'h':
                    this.y2 = 8;
                    break;
                default:
                    System.out.print("No puede ingresar esa letra");

            }
        }
        //validar que no este fuera de rango
        System.out.print("Ingrese el numero: ");
        this.x2 = scan.nextInt();
    }
}