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
public class cReina extends cTrebejo {

    public cReina() {
        this.numero = 1;
        this.inicial = 'r';
        this.color = " ";
    }

    public boolean moverTrebejo(cTrebejo tablero[][], int x1, int x2, int y1, int y2) {
        boolean respuesta = false;

        if (super.validacion(x1, x2, y1, y2) == false) {
            respuesta = false;
        }
        if (x1 > x2 && y1 == y2) {//sube
            for (int i = x1 + 1; i <= x2; i--) {
                if (tablero[i][y1].celdaOcupada(tablero, i, y1) != false) {
                    respuesta = true;
                }
            }
        }

        if (x1 < x2 && y1 == y2) {//baja
            for (int i = x1 + 1; i <= x2; i++) {
                if (tablero[i][y1].celdaOcupada(tablero, i, y1) != false) {
                    respuesta = true;
                }
            }
        }
        if (x1 == x2 && y1 > y2) {//izq
            for (int i = x1 + 1; i <= x2; i--) {
                if (tablero[i][y1].celdaOcupada(tablero, i, y1) != false) {
                    respuesta = true;
                }
            }
        }

        if (x1 == x2 && y1 < y2) {//der
            for (int i = x1 + 1; i <= x2; i++) {
                if (tablero[i][y1].celdaOcupada(tablero, i, y1) != false) {
                    respuesta = true;
                }
            }
        }

        if ((Math.abs(x1 - x2)) == (Math.abs(y1 - y2))) {
            if (x1 > x2 && y1 > y2) {//izq-sube
                for (int i = x1 + 1; i <= x2; i--) {
                    y1--;
                    if (tablero[i][y1].celdaOcupada(tablero, i, y1) != false) {
                        respuesta = true;
                    }
                }
            }

            if (x1 < x2 && y1 > y2) {//izq-baja
                for (int i = x1 + 1; i <= x2; i++) {
                    y1--;
                    if (tablero[i][y1].celdaOcupada(tablero, i, y1) != false) {
                        respuesta = true;
                    }
                }
            }
            if (x1 < x2 && y1 < y2) {//der-sube
                for (int i = x1 + 1; i <= x2; i--) {
                    y1++;
                    if (tablero[i][y1].celdaOcupada(tablero, i, y1) != false) {
                        respuesta = true;
                    }

                }
            }

            if (x1 > x2 && y1 < y2) {//der-baja
                for (int i = x1 + 1; i <= x2; i++) {
                    y1++;
                    if (tablero[i][y1].celdaOcupada(tablero, i, y1) != false) {
                        respuesta = true;
                    }
                }
            }
        }

        return respuesta;
    }
}