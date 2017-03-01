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
    protected char lista[] = new char[16];
    protected char listaPeces[] = new char[16];
    protected int k;

    public cJugador() {
        this.color = " ";
        this.cantidadTrebejos = 0;
        this.nombre = " ";
        for (int i = 0; i < lista.length; i++) {
            this.lista[i] = ' ';
        }
        for (int i = 0; i < listaPeces.length; i++) {
            this.listaPeces[i] = ' ';
        }
        this.k = 0;
    }

    public cJugador(String color, int cantidadTrebejos) {
        this.color = color;
        this.cantidadTrebejos = cantidadTrebejos;
        this.nombre = " ";
        for (int i = 0; i < lista.length; i++) {
            this.lista[i] = ' ';
        }
        for (int i = 0; i < listaPeces.length; i++) {
            this.listaPeces[i] = ' ';
        }
        this.k = 0;
        
    }

    public void leerNombre(int num, String color) {
        System.out.println("Color: " + color);
        System.out.print("Nombre Jugador" + num + ": ");
        this.nombre = scan.nextLine();
    }
    
    public void setLista(){
        for (int i = 0; i < 8; i++) {
            this.lista[i] = 'P';
        }
        this.lista[8] = 'T';
        this.lista[9] = 'T';
        this.lista[10] = 'C';
        this.lista[11] = 'C';
        this.lista[12] = 'A';
        this.lista[13] = 'A';
        this.lista[14] = 'R';
        this.lista[15] = 'r';
    }
    
    public void mostrar(){
        System.out.println("Lista: ");
        for (int i = 0; i < lista.length; i++) {
            if(this.lista[i] == ' '){
                
            }else{
                System.out.println(this.lista[i]);
            }
        }
    }
    
     public void mostrarPeces(){
         System.out.println("ListaPeces: ");
        for (int i = 0; i < listaPeces.length; i++) {
            if(this.listaPeces[i]==' '){
                
            }else{
            System.out.println(this.listaPeces[i]);
            }
        }
     }
}

