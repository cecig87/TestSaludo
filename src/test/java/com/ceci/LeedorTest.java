package com.ceci;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import com.ceci.Leedor.Leedor;

import org.junit.Before;
import org.junit.Test;

public class LeedorTest {
    static Leedor lee;

    @Before
    public void Before() {
        lee = new Leedor();

    }

    @Test
    public void TestObtenerName() {
        lee.name("Luis");
        String saludo = lee.seleccionarSaludo();
        String respuesta = "Hola Luis!";
        assertEquals(respuesta, saludo);
    }

    @Test
    public void TestObtenerAnonimo() {
        lee.name("");
        String saludo = lee.seleccionarSaludo();
        String respuesta = "Hola Anónimo!";
        assertEquals(respuesta, saludo);
    }

}
