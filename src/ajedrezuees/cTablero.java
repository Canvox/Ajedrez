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
            //Ponerle 1 a todos
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

            if ((this.tablero[x1][y1].moverTrebejo(this.tablero, x1, x2, y1, y2)) == true) {
                this.tablero[x2][y2] = this.tablero[x1][y1];
                this.tablero[x1][y1] = new cTrebejo();
                break;
            }
            else{
                break;
            }
        }

    }

    public void leer() {
        char column = ' ';
        int o1, o2;
        while ((column != 'a' && column != 'b' && column != 'c' && column != 'd' && column != 'e' && column != 'f' && column != 'g' && column != 'h') || ((this.x1 < 0) || (this.x1 > 8))) {
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
        //o1 = this.x1;
        switch (this.x1) {
            case 1:
                this.x1 = 8;
                break;
            case 2:
                this.x1 = 7;
                break;
            case 3:
                this.x1 = 6;
                break;
            case 4:
                this.x1 = 5;
                break;
            case 5:
                this.x1 = 4;
                break;
            case 6:
                this.x1 = 3;
                break;
            case 7:
                this.x1 = 2;
                break;
            case 8:
                this.x1 = 1;
                break;
            default:
                System.out.println("No puede ingresar ese numero");

        }

        scan.nextLine();
        column = ' ';

        while ((column != 'a' && column != 'b' && column != 'c' && column != 'd' && column != 'e' && column != 'f' && column != 'g' && column != 'h') || ((this.x2 < 0) || (this.x2 > 8))) {
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
        //valir que no este fuera de rango

        System.out.print("Ingrese el numero: ");
        this.x2 = scan.nextInt();
        //o2 = this.x2;
        switch (this.x2) {
            case 1:
                this.x2 = 8;
                break;
            case 2:
                this.x2 = 7;
                break;
            case 3:
                this.x2 = 6;
                break;
            case 4:
                this.x2 = 5;
                break;
            case 5:
                this.x2 = 4;
                break;
            case 6:
                this.x2 = 3;
                break;
            case 7:
                this.x2 = 2;
                break;
            case 8:
                this.x2 = 1;
                break;
            default:
                System.out.println("No puede ingresar ese numero");

        }
    }
}
