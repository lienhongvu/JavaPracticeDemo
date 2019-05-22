package com.lienhongvu.datastructure.linkedlist;

/**
 * Created by hvlien on 10/25/2018.
 */
public interface MyLinkedList<T> {

    boolean isEmpty();

    int size();

    void add(T item);

    void addFirst(T item);

    void addAfter(T item, T after);

    void addLast(T item);

    void delete(T item);

    void deleteFirst();

    void deleteLast();

    void deleteAfter(T item);

    String displayForward();

    String displayBackward();
}
