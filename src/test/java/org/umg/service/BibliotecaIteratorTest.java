package org.umg.service;

import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;

public class BibliotecaIteratorTest {
    @Test
    public void debeRecorrerLosLibrosEnOrden() {
        Biblioteca biblioteca = new Biblioteca();
        Libro primero = new Libro("Clean Code", "Robert C. Martin");
        Libro segundo = new Libro("El Principito", "Antoine de Saint-Exupery");
        biblioteca.agregar(primero);
        biblioteca.agregar(segundo);
        BibliotecaIterator iterador = new BibliotecaIterator(biblioteca);

        assertSame(biblioteca, iterador.getBiblioteca());
        assertEquals(0, iterador.getPosicionActual());
        assertTrue(iterador.hasNext());
        assertSame(primero, iterador.next());
        assertEquals(1, iterador.getPosicionActual());
        assertSame(segundo, iterador.next());
        assertFalse(iterador.hasNext());
        assertTrue(iterador.toString().contains("posicionActual=2"));
    }

    @Test(expected = NoSuchElementException.class)
    public void debeFallarAlSolicitarUnElementoCuandoNoHayMas() {
        BibliotecaIterator iterador = new BibliotecaIterator(new Biblioteca());
        iterador.next();
    }
}
