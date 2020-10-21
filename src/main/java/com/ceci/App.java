package com.ceci;

import com.ceci.Leedor.Leedor;
//import com.ceci.Printeador.Printeador;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Leedor p = new Leedor();
        System.out.println(p.obtenerNombre());
    }

}
