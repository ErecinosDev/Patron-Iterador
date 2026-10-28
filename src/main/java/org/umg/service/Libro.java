package org.umg.service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Libro {
    private final String titulo;
    private final String autor;
}
