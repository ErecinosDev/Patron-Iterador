package org.umg.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LibroTest {
    @Test
    public void debeObtenerDatosYRepresentacionDelLibro() {
        Libro libro = new Libro("1984", "George Orwell");

        assertEquals("1984", libro.getTitulo());
        assertEquals("George Orwell", libro.getAutor());
        assertTrue(libro.toString().contains("titulo=1984"));
        assertTrue(libro.toString().contains("autor=George Orwell"));
    }
}
