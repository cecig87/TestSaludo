package com.ceci.Printeador;

import java.util.Scanner;

public class Printeador {

    public String saludar(String name) {
        name = saludarAnonimo(name);
        return "Hola " + name + "!";

    }

    public void obtenerNombre() {
        Scanner obtainName = new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        String name;
        name = obtainName.nextLine();

        // if (name.isEmpty()) {
        // Scanner obtainAgain = new Scanner(System.in);
        // System.out.print("Por favor introduzca su nombre:");
        // name = obtainAgain.nextLine();
        // name = "anónimo";
        // System.out.println(saludar(name));
        // obtainAgain.close();
        // } else {
        System.out.println(saludar(name));
        obtainName.close();
        // }

    }

    public String saludarAnonimo(String nombre) {
        if (nombre.isEmpty()) {
            nombre = "anónimo";
        }
        return nombre;
    }

}
