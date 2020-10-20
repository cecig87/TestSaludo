package com.ceci.Leedor;

import java.util.Scanner;

import com.ceci.Printeador.Printeador;

public class Leedor {
    Printeador pr = new Printeador();

    public void obtenerNombre() {
        Scanner obtainName = new Scanner(System.in);

        System.out.print("Introduzca su nombre: ");
        String name;
        name = obtainName.nextLine();

        if (name.isEmpty()) {
            System.out.println(pr.saludar());

        } else {
            System.out.println(pr.saludar(name));
            obtainName.close();
        }

    }

}
