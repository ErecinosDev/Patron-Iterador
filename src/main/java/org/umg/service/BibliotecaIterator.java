package org.umg.service;

import lombok.Getter;
import lombok.ToString;

import java.util.NoSuchElementException;

@Getter
@ToString
public class BibliotecaIterator implements Iterator<Libro> {
    private final Biblioteca biblioteca;
    private int posicionActual;

    public BibliotecaIterator(Biblioteca biblioteca) {
        this.biblioteca = biblioteca;
    }

    @Override
    public boolean hasNext() {
        return posicionActual < biblioteca.getLibros().size();
    }

    @Override
    public Libro next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No hay mas libros por recorrer");
        }
        return biblioteca.getLibros().get(posicionActual++);
    }
}
