package org.umg.service;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@ToString
public class Biblioteca implements Aggregate<Libro> {
    private final List<Libro> libros = new ArrayList<>();

    public void agregar(Libro libro) {
        libros.add(libro);
    }


    public List<Libro> getLibros() {
        return Collections.unmodifiableList(libros);
    }

    @Override
    public Iterator<Libro> getIterator() {
        return new BibliotecaIterator(this);
    }
}
