package org.umg.service;


public interface Aggregate<T> {
    Iterator<T> getIterator();
}
