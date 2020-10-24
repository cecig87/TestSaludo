package com.ceci;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import com.ceci.Leedor.Leedor;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.junit.runners.Parameterized;
//import org.junit.runners.Parameterized.Parameters;

import java.io.InputStream;
//import java.io.PrintStream;
import java.io.ByteArrayInputStream;
//import java.io.ByteArrayOutputStream;
//import java.util.Arrays;

//@RunWith(Parameterized.class)
public class LeedorTest {
    static Leedor lee;
    // String nombre, esp;

    private final InputStream systemIn = System.in;
    // private final PrintStream systemOut = System.out;

    private ByteArrayInputStream testIn;
    // private ByteArrayOutputStream testOut;

    @Before
    public void BeforeSetUpOutput() {
        lee = new Leedor();
        // testOut = new ByteArrayOutputStream();
        // System.setOut(new PrintStream(testOut));
    }

    public void provideInput(String data) {
        testIn = new ByteArrayInputStream(data.getBytes());
        System.setIn(testIn);
    }

    @After
    public void restoreSystemInputOutput() {
        System.setIn(systemIn);
        // System.setOut(systemOut);

    }

    @Test
    public void TestObtenerName() {
        final String testString = "Sara";
        provideInput(testString);

        assertEquals(testString, lee.obtenerNombre());
    }

    // @Test
    // public void TestObtenerName() {

    // String nombres = lee.name(nombre);
    // assertEquals(esp, nombres);

    // }

    // @Test
    // public void TestObtenerName() {
    // lee.name("Luis");
    // String saludo = lee.seleccionarSaludo();
    // String respuesta = "Hola Luis!";
    // assertEquals(respuesta, saludo);
    // }

    // @Test
    // public void TestObtenerAnonimo() {
    // lee.name("");
    // String saludo = lee.seleccionarSaludo();
    // String respuesta = "Hola Anónimo!";
    // assertEquals(respuesta, saludo);
    // }

}
