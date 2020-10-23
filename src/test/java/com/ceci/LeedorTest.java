package com.ceci;

import static org.junit.Assert.assertEquals;
//import static org.junit.Assert.assertTrue;

import com.ceci.Leedor.Leedor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class LeedorTest {
    static Leedor lee;

    @Before
    public void Before() {
        lee = new Leedor();

    }

    String nombre, esp;

    @Parameters
    public static Iterable<Object[]> verNombre() {
        return Arrays.asList(new Object[][] { { "Sara", "Sara" }, { "", "" } });
    }

    public LeedorTest(String nombre, String esp) {
        this.nombre = nombre;
        this.esp = esp;
    }

    @Test
    public void TestObtenerName() {

        String nombres = lee.name(nombre);
        assertEquals(esp, nombres);

    }

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
