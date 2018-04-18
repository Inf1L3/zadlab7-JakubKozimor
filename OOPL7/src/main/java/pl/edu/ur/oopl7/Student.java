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
public class Student extends Osoba{
    private int nr_indeksu;
    private String typ;
    private String kierunek;
    private int rok;

    public Student(int nr_indeksu, String typ, String kierunek, int rok, String imie, String nazwisko, int data, String plec) {
        super(imie, nazwisko, data, plec);
        this.nr_indeksu = nr_indeksu;
        this.typ = typ;
        this.kierunek = kierunek;
        this.rok = rok;
    }

    public int getNr_indeksu() {
        return nr_indeksu;
    }

    public void setNr_indeksu(int nr_indeksu) {
        this.nr_indeksu = nr_indeksu;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getKierunek() {
        return kierunek;
    }

    public void setKierunek(String kierunek) {
        this.kierunek = kierunek;
    }

    public int getRok() {
        return rok;
    }

    public void setRok(int rok) {
        this.rok = rok;
    }

    @Override
    public String toString() {
        return "Student{" + "nr_indeksu=" + nr_indeksu + ", typ=" + typ + ", kierunek=" + kierunek + ", rok=" + rok +" "+super.toString()+ '}';
    }
    
   
}
