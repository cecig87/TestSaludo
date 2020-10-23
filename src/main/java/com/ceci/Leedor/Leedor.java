package com.ceci.Leedor;

import java.util.Scanner;

//import com.ceci.Printeador.Printeador;

public class Leedor {

    private String name;

    // Printeador pr = new Printeador();

    public String obtenerNombre() {
        Scanner obtainName = new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");

        name = obtainName.nextLine();

        obtainName.close();
        // return seleccionarSaludo();
        return name(name);
    }

    public String name(String nombre) {
        name = nombre;
        return name;
    }

    // public String seleccionarSaludo() {
    // if (name.isEmpty()) {
    // return pr.saludar();

    // } else {
    // return pr.saludar(name);

    // }

    // }

}
