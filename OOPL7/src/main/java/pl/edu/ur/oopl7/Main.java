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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Student st = new Student(0, " ", " ", 0, " ", " ", 0, " ");
        System.out.println(st.toString());
        Wykladowca w = new Wykladowca(0, 0, " ", " ", " ", 0, " ");
        System.out.println(w.toString());

    }

}
