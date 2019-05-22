package com.lienhongvu.javaconcurrent.atomic;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by hvlien on 1/11/2019.
 */
public class ConcurrentStack<E> {

    AtomicReference<Node<E>> atomicReference = new AtomicReference<>();

    public void push(){

    }

    public void pop(){

    }

    private class Node<E> {
        final E item;
        Node<E> next;

        public Node(E item) {
            this.item = item;
        }
    }
}
