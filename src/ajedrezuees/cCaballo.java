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
public class cCaballo extends cTrebejo {

    public cCaballo() {
        this.numero = 2;
        this.inicial = 'C';
        this.color = " ";
    }

    public boolean moverTrebejo(cTrebejo tablero[][], int x1, int x2, int y1, int y2) {
        boolean respuesta = true;

        if (super.validacion(x1, x2, y1, y2) == false) {
            respuesta = false;
        }
        if (x2 != x1 - 1 && x2 != x1 + 1 && x2 != x1 + 2 && x2 != x1 - 2) {
            respuesta = false;
        }
        if (y2 != y1 - 2 && y2 != y1 + 2 && y2 != y1 - 1 && y2 != y1 + 1) {
            respuesta = false;
        }

        return respuesta;
    }
}
