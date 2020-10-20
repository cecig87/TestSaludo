package com.ceci;

import com.ceci.Printeador.Printeador;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class PrinteadorTest {
    static Printeador printead;
    String nombre;
    String respuesta;

    @Before
    public void before() {
        printead = new Printeador();
    }

    @Test
    public void testSaludar() {

        nombre = printead.saludar("Mario");
        respuesta = "Hola Mario!";
        assertEquals(respuesta, nombre);
    }

    @Test
    public void verificarAnonimo() {

        respuesta = "Hola Anónimo!";
        assertEquals(respuesta, printead.saludar());

    }
}
