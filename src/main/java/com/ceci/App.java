package com.ceci;

import com.ceci.Leedor.Leedor;

import com.ceci.Printeador.Printeador;

/**
 * Hello world!
 *
 */
public class App {

    public static String seleccionarSaludo() {
        Leedor l = new Leedor();
        Printeador hi = new Printeador();

        String nombre = l.obtenerNombre();
        if (nombre.isBlank()) {
            return hi.saludar();
        } else {
            return hi.saludar(nombre);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        // System.out.println(l.obtenerNombre());

        System.out.println(seleccionarSaludo());

    }

}
