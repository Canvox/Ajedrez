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
public class cJugador {

    public String color;
    public int cantidadTrebejos;

    //eliminar trebejos?
    cPeon p[] = new cPeon[8];
    cAlfil a[] = new cAlfil[2];
    cCaballo c[] = new cCaballo[2];
    cTorre t[] = new cTorre[2];
    cRey r = new cRey();
    cReina re = new cReina();

    public cJugador(String color) {
        this.color = color;
        this.cantidadTrebejos = 16;
        for (int i = 0; i < p.length; i++) {
            p[i] = new cPeon();

        }
        for (int i = 0; i < a.length; i++) {
            a[i] = new cAlfil();
            c[i] = new cCaballo();
            t[i] = new cTorre();
        }
        cRey r = new cRey();
        cReina re = new cReina();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCantidadTrebejos() {
        return cantidadTrebejos;
    }

    public void setCantidadTrebejos(int cantidadTrebejos) {
        this.cantidadTrebejos = cantidadTrebejos;
    }

    public cPeon[] getP() {
        return p;
    }

    public void setP(cPeon[] p) {
        this.p = p;
    }

    public cAlfil[] getA() {
        return a;
    }

    public void setA(cAlfil[] a) {
        this.a = a;
    }

    public cCaballo[] getC() {
        return c;
    }

    public void setC(cCaballo[] c) {
        this.c = c;
    }

    public cTorre[] getT() {
        return t;
    }

    public void setT(cTorre[] t) {
        this.t = t;
    }

    public cRey getR() {
        return r;
    }

    public void setR(cRey r) {
        this.r = r;
    }

    public cReina getRe() {
        return re;
    }

    public void setRe(cReina re) {
        this.re = re;
    }

    public void setColorTrebejos() {
        if (this.color == "blanco") {
            for (int i = 0; i < p.length; i++) {
                p[i].color = "blanco";
            }
            for (int i = 0; i < a.length; i++) {
                a[i].color = "blanco";
                c[i].color = "blanco";
                t[i].color = "blanco";

            }
            r.color = "blanco";
            re.color = "blanco";
        } else if (this.color == "negro") {
            for (int i = 0; i < p.length; i++) {
                p[i].color = "negro";
            }
            for (int i = 0; i < a.length; i++) {
                a[i].color = "negro";
                c[i].color = "negro";
                t[i].color = "negro";

            }
            r.color = "negro";
            re.color = "negro";
        }
    }

}