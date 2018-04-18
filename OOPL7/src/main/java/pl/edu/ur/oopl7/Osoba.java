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
public class Osoba {

    private String imie;
    private String nazwisko;
    private int data;
    private String plec;

    public Osoba(String imie, String nazwisko, int data, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data = data;
        this.plec = plec;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }

    @Override
    public String toString() {
        return "Osoba{" + "imie=" + imie + ", nazwisko=" + nazwisko + ", data=" + data + ", plec=" + plec + '}';
    }

    
    
    
    
}
