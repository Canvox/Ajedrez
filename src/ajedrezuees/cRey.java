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
public class cRey extends cTrebejo {

    public cRey() {
        this.numero = 1;
        this.inicial = 'R';
        this.color = " ";
    }

    public cRey(int numero, String color) {
        this.color = color;
        this.numero = numero;
        this.inicial = 'R';
        this.cantidad = 1;
    }

    public boolean moverTrebejo(cTrebejo tablero[][], int x1, int x2, int y1, int y2) {
        boolean respuesta = false;
        int contador = 0;
        if (super.validacion(x1, x2, y1, y2) == false) {
            if ((x1 == x2) && ((y2 == (y1 + 1)) || (y2 == (y1 - 1))) || (y1 == y2) && ((x2 == (x1 + 1)) || (x2 == (x1 - 1)))) {
                if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 0)) {
                    if (x1 > x2 && y1 == y2) {//sube
                        for (int i = x1; i >= x2; i--) {
                            if (tablero[i][y1].celdaOcupada(tablero, i, y1) == false) {
                                contador++;
                            }
                        }
                        if (contador == x1 - x2) {
                            respuesta = true;
                        }
                    }

                    if (x1 < x2 && y1 == y2) {//baja
                        for (int i = x1; i <= x2; i++) {
                            if (tablero[i][y1].celdaOcupada(tablero, i, y1) == false) {
                                contador++;
                            }
                        }
                        if (contador == x2 - x1) {
                            respuesta = true;
                        }
                    }
                    if (x1 == x2 && y1 > y2) {//izq
                        for (int i = y1; i >= y2; i--) {
                            if (tablero[x1][i].celdaOcupada(tablero, x1, i) == false) {
                                contador++;
                            }

                        }
                        if (contador == y1 - y2) {
                            respuesta = true;
                        }
                    }

                    if (x1 == x2 && y1 < y2) {//der
                        for (int i = y1; i <= y2; i++) {
                            if (tablero[x1][i].celdaOcupada(tablero, x1, i) == false) {
                                contador++;
                            }
                        }
                        if (contador == y2 - y1) {
                            respuesta = true;
                        }
                    }
                }
                if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 1)) {
                    if (x1 > x2 && y1 == y2) {//sube
                        for (int i = x1; i >= x2; i--) {
                            if (tablero[i][y1].celdaOcupada(tablero, i, y1) == false) {
                                contador++;
                            }
                        }
                        if (contador == x1 - x2 - 1) {
                            respuesta = true;
                        }
                    }

                    if (x1 < x2 && y1 == y2) {//baja
                        for (int i = x1; i <= x2; i++) {
                            if (tablero[i][y1].celdaOcupada(tablero, i, y1) == false) {
                                contador++;
                            }
                        }
                        if (contador == x2 - x1 - 1) {
                            respuesta = true;
                        }
                    }
                    if (x1 == x2 && y1 > y2) {//izq
                        for (int i = y1; i >= y2; i--) {
                            if (tablero[x1][i].celdaOcupada(tablero, x1, i) == false) {
                                contador++;
                            }

                        }
                        if (contador == y1 - y2 - 1) {
                            respuesta = true;
                        }
                    }

                    if (x1 == x2 && y1 < y2) {//der
                        for (int i = y1; i <= y2; i++) {
                            if (tablero[x1][i].celdaOcupada(tablero, x1, i) == false) {
                                contador++;
                            }
                        }
                        if (contador == y2 - y1 - 1) {
                            respuesta = true;
                        }
                    }
                }
            }
        }
        if (super.validacion(x1, x2, y1, y2) != false) {
            if ((x2 == (x1 - 1) && y2 == (y1 + 1)) || (x2 == (x1 + 1) && y2 == (y1 - 1)) || (x2 == (x1 - 1) && y2 == (y1 - 1)) || (x2 == (x1 + 1) && y2 == (y1 + 1))) {
                //celda vacia
                if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 0)) {
                    if ((Math.abs(x1 - x2)) == (Math.abs(y1 - y2))) {
                        int j = y1;
                        if (x1 > x2 && y1 > y2) {//izq-sube
                            for (int i = x1 - 1; i >= x2; i--) {

                                j--;
                                if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                    contador++;
                                }
                            }
                            if ((contador == (x1 - x2)) && (contador == (y1 - y2))) {
                                respuesta = true;
                            }
                        }

                        if (x1 < x2 && y1 > y2) {//izq-baja
                            for (int i = x1 + 1; i <= x2; i++) {

                                j--;
                                if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                    contador++;
                                }
                            }
                            if (contador == (x2 - x1) && (contador == (y1 - y2))) {
                                respuesta = true;
                            }
                        }
                        if (x1 > x2 && y1 < y2) {//der-sube
                            for (int i = x1 - 1; i >= x2; i--) {

                                j++;
                                if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                    contador++;
                                }
                            }
                            if (contador == (x1 - x2) && (contador == (y2 - y1))) {
                                respuesta = true;
                            }

                        }

                        if (x1 < x2 && y1 < y2) {//der-baja
                            for (int i = x1 + 1; i <= x2; i++) {

                                j++;
                                if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                    contador++;
                                }
                            }

                            if (contador == (x2 - x1) && (contador == (y2 - y1))) {
                                respuesta = true;
                            }
                        }
                    }
                }
                //comer
                if ((tablero[x1][y1].color.compareTo(tablero[x2][y2].color) != 0) && (tablero[x2][y2].numero == 1)) {
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
                                respuesta = true;
                            }
                        }

                        if (x1 < x2 && y1 > y2) {//izq-baja
                            for (int i = x1 + 1; i <= x2; i++) {

                                j--;
                                if (tablero[i][j].celdaOcupada(tablero, i, j) == false) {
                                    contador++;
                                }
                            }
                            if (contador == (x2 - x1 - 1) && (contador == (y1 - y2 - 1))) {
                                respuesta = true;
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
                                respuesta = true;
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
                                respuesta = true;
                            }
                        }
                    }
                }
            }
        }

        return respuesta;
    }

}

