package org.umg.service;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class BibliotecaTest {
    @Test
    public void debeAgregarLibrosYExponerVistaDeSoloLectura() {
        Biblioteca biblioteca = new Biblioteca();
        Libro libro = new Libro("Dune", "Frank Herbert");

        biblioteca.agregar(libro);
        List<Libro> libros = biblioteca.getLibros();

        assertEquals(1, libros.size());
        assertEquals(libro, libros.get(0));
        assertTrue(biblioteca.toString().contains("Dune"));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void noDebePermitirModificarLaVistaDeLibros() {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.getLibros().add(new Libro("Dune", "Frank Herbert"));
    }

    @Test
    public void debeCrearUnIteradorParaSusLibros() {
        Biblioteca biblioteca = new Biblioteca();
        Iterator<Libro> iterador = biblioteca.getIterator();

        assertTrue(iterador instanceof BibliotecaIterator);
        assertFalse(iterador.hasNext());
    }
}
