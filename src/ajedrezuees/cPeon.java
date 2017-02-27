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
public class cPeon extends cTrebejo {

    static Scanner scan = new Scanner(System.in);
    //int contador;
    int movimiento;

    public cPeon() {
        super();
        this.inicial = 'P';
        this.movimiento = 0;
        this.cantidad = 8;
        this.numero = 1;
    }

    public cPeon(int numero, String color) {
        this.color = color;
        this.numero = numero;
        this.inicial = 'P';
        this.movimiento = 0;
        this.cantidad = 8;
    }

    public boolean moverTrebejo(cTrebejo tablero[][], int x1, int x2, int y1, int y2) {
        //Verifica si se puede realizar el movimiento para poder llamarlo en tablero
        boolean resp = false;
        int contador = 0;
        //Movimiento blanco
        if (this.color.compareTo("blanco") == 0) {
            if ((movimiento == 0)) {
                if (super.validacion(x1, x2, y1, y2) == false) {
                    //Validacion para mover (0 == desocupada)
                    if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 0)) {
                        if ((x1 <= (x2 + 2)) && (y2 == y1)) {
                            for (int i = x1 + 1; i <= x1 + 2; i++) {
                                if (tablero[i][y1].celdaOcupada(tablero, i, y1) == false) {
                                    contador++;
                                }
                            }
                            if (contador <= 2) {
                                resp = true;
                                movimiento++;
                            }
                        }
                    }
                }
                //Validacion para comer (1 == ocupada)
                if (super.validacion(x1, x2, y1, y2) != false) {
                    if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 1)) {
                        if ((x2 == (x1 - 1) && y2 == (y1 + 1)) || (x2 == (x1 - 1) && y2 == (y1 - 1))) {
                            if ((Math.abs(x1 - x2)) == (Math.abs(y1 - y2))) {
                                int j = y1;
                                if (x1 > x2 && y1 > y2) {//izq-sube
                                    for (int i = x1 - 1; i >= x2; i--) {
                                        j--;
                                        if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                            contador++;
                                        }
                                    }
                                    if ((contador == (x1 - x2 - 1)) && (contador == (y1 - y2 - 1))) {
                                        resp = true;
                                    }
                                }
                                if (x1 > x2 && y1 < y2) {//der-sube
                                    for (int i = x1 - 1; i >= x2; i--) {
                                        j++;
                                        if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                            contador++;
                                        }
                                    }
                                    if (contador == (x1 - x2 - 1) && (contador == (y2 - y1 - 1))) {
                                        resp = true;
                                    }
                                }
                            }
                        }
                    }
                }
                //Despues del primer movimiento
            } else if ((movimiento > 0)) {
                if (super.validacion(x1, x2, y1, y2) == false) {
                    //Validacion para mover (0 == desocupada)
                    if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 0)) {
                        if ((x1 <= (x2 + 1)) && (y2 == y1)) {
                            for (int i = x1 + 1; i <= x1 + 1; i++) {
                                if (tablero[i][y1].celdaOcupada(tablero, i, y1) == false) {
                                    contador++;
                                }
                            }
                            if (contador == 1) {
                                resp = true;
                                movimiento++;
                            }
                        }
                    }
                }
                if (super.validacion(x1, x2, y1, y2) != false) {
                    //Validacion para comer (1 == ocupada)
                    if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 1)) {
                        if ((x2 == (x1 - 1) && y2 == (y1 + 1)) || (x2 == (x1 - 1) && y2 == (y1 - 1))) {
                            if ((Math.abs(x1 - x2)) == (Math.abs(y1 - y2))) {
                                int j = y1;
                                if (x1 > x2 && y1 > y2) {//izq-sube
                                    for (int i = x1 - 1; i >= x2; i--) {
                                        j--;
                                        if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                            contador++;
                                        }
                                    }
                                    if ((contador == (x1 - x2 - 1)) && (contador == (y1 - y2 - 1))) {
                                        resp = true;
                                    }
                                }
                                if (x1 > x2 && y1 < y2) {//der-sube
                                    for (int i = x1 - 1; i >= x2; i--) {
                                        j++;
                                        if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                            contador++;
                                        }
                                    }
                                    if (contador == (x1 - x2 - 1) && (contador == (y2 - y1 - 1))) {
                                        resp = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        //Movimiento negro
        if (this.color.compareTo("negro") == 0) {
            if ((movimiento == 0)) {
                if (super.validacion(x1, x2, y1, y2) == false) {
                    //Validacion para mover (0 == desocupada)
                    if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 0)) {
                        if ((x2 <= (x1 + 2)) && (y2 == y1)) {
                            for (int i = x1 + 1; i <= x1 + 2; i++) {
                                if (tablero[i][y1].celdaOcupada(tablero, i, y1) == false) {
                                    contador++;
                                }
                            }
                            if (contador <= 2) {
                                resp = true;
                                movimiento++;
                            }
                        }
                    }
                }
                if (super.validacion(x1, x2, y1, y2) != false) {
                    //Validacion para comer (1 == ocupada)
                    if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 1)) {
                        if ((x2 == (x1 + 1) && y2 == (y1 - 1)) || (x2 == (x1 + 1) && y2 == (y1 + 1))) {
                            if ((Math.abs(x1 - x2)) == (Math.abs(y1 - y2))) {
                                int j = y1;
                                if (x1 < x2 && y1 > y2) {//izq-baja
                                    for (int i = x1 + 1; i <= x2; i++) {

                                        j--;
                                        if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                            contador++;
                                        }
                                    }
                                    if (contador == (x2 - x1 - 1) && (contador == (y1 - y2 - 1))) {
                                        resp = true;
                                    }
                                }
                                if (x1 < x2 && y1 < y2) {//der-baja
                                    for (int i = x1 + 1; i <= x2; i++) {

                                        j++;
                                        if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                            contador++;
                                        }
                                    }

                                    if (contador == (x2 - x1 - 1) && (contador == (y2 - y1 - 1))) {
                                        resp = true;
                                    }
                                }
                            }
                        }
                    }
                }
                //Despues del primer movimiento
            } else if ((movimiento > 0)) {
                if (super.validacion(x1, x2, y1, y2) == false) {
                    //Validacion para mover (0 == desocupada)
                    if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 0)) {
                        if ((x2 <= (x1 + 1)) && (y2 == y1)) {
                            for (int i = x1 + 1; i <= x1 + 1; i++) {
                                if (tablero[i][y1].celdaOcupada(tablero, i, y1) == false) {
                                    contador++;
                                }
                            }
                            if (contador == 1) {
                                resp = true;
                                movimiento++;
                            }
                        }
                    }
                }
                if (super.validacion(x1, x2, y1, y2) != false) {
                    //Validacion para comer (1 == ocupada)
                    if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 1)) {
                        if ((x2 == (x1 + 1) && y2 == (y1 - 1)) || (x2 == (x1 + 1) && y2 == (y1 + 1))) {
                            if ((Math.abs(x1 - x2)) == (Math.abs(y1 - y2))) {
                                int j = y1;
                                if (x1 < x2 && y1 > y2) {//izq-baja
                                    for (int i = x1 + 1; i <= x2; i++) {

                                        j--;
                                        if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                            contador++;
                                        }
                                    }
                                    if (contador == (x2 - x1 - 1) && (contador == (y1 - y2 - 1))) {
                                        resp = true;
                                    }
                                }
                                if (x1 < x2 && y1 < y2) {//der-baja
                                    for (int i = x1 + 1; i <= x2; i++) {

                                        j++;
                                        if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                            contador++;
                                        }
                                    }

                                    if (contador == (x2 - x1 - 1) && (contador == (y2 - y1 - 1))) {
                                        resp = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        return resp;
    }
}
