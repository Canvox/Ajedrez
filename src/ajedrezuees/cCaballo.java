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

    //Todos los posibles movimientos del caballo
    static int[] moves = {-1, 2, -1, -2, 1, 2, 1, -2, -2, 1, -2, -1, 2, 1, 2, -1};

    public cCaballo() {
        this.numero = 2;
        this.inicial = 'C';
        this.color = " ";
    }

    public cCaballo(int numero, String color) {
        this.color = color;
        this.numero = numero;
        this.inicial = 'C';
        this.cantidad = 2;
    }

    public boolean moverTrebejo(cTrebejo tablero[][], int x1, int x2, int y1, int y2) {
        boolean respuesta = false;

        if (super.validacion(x1, x2, y1, y2) != false) {
            for (int i = 0; i < moves.length; i = i + 2) {
                if (x1 == x2 + moves[i] && y1 == y2 + moves[i + 1]) {
                    respuesta = true;
                }
            }
        }
        return respuesta;
    }
}
