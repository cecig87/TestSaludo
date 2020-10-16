package com.ceci;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import com.ceci.Printeador.Printeador;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    static Printeador printead;

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Before
    public void before() {
        printead = new Printeador();
    }

    @Test
    public void testSaludar() {
        String nombre = printead.saludar("Mario");
        String respuesta = "Hola Mario!";
        assertEquals(respuesta, nombre);
    }

}
