/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.oopl7;

/**
 *
 * @author student
 */
public class Wykladowca extends Osoba{
    private int ilgodzin;
    private int ildni;
    private String przedmiot;

    public Wykladowca(int ilgodzin, int ildni, String przedmiot, String imie, String nazwisko, int data, String plec) {
        super(imie, nazwisko, data, plec);
        this.ilgodzin = ilgodzin;
        this.ildni = ildni;
        this.przedmiot = przedmiot;
    }

    public int getIlgodzin() {
        return ilgodzin;
    }

    public void setIlgodzin(int ilgodzin) {
        this.ilgodzin = ilgodzin;
    }

    public int getIldni() {
        return ildni;
    }

    public void setIldni(int ildni) {
        this.ildni = ildni;
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return "Wykladowca{" + "ilgodzin=" + ilgodzin + ", ildni=" + ildni + ", przedmiot=" + przedmiot + " "+super.toString()+'}';
    }

   
   
    
    
}
