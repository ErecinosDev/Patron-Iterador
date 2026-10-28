package org.umg;

import org.umg.service.Biblioteca;
import org.umg.service.Iterator;
import org.umg.service.Libro;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        biblioteca.agregar(new Libro("Clean Code", "Robert C. Martin"));
        biblioteca.agregar(new Libro("El Principito", "Antoine de Saint-Exupery"));
        biblioteca.agregar(new Libro("1984", "George Orwell"));

        Iterator<Libro> iterador = biblioteca.getIterator();
        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}
