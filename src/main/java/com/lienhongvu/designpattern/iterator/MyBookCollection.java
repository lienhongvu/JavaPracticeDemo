package com.lienhongvu.designpattern.iterator;

import java.util.*;
import java.util.function.UnaryOperator;

/**
 * Created by hvlien on 1/9/2019.
 */
public class MyBookCollection {

    private Book[] books;
    private int size = 0;

    public MyBookCollection() {
        this.books = new Book[16];
    }

    public int size() {
        return size;
    }

    public MyIterator<Book> iterator() {
        return new BookIterator();
    }

    public boolean add(Book book) {
        books[size] = book;
        size++;
        return true;
    }

    class BookIterator implements MyIterator<Book> {

        private int currentItem = 0;

        @Override
        public boolean hasNext() {
            return currentItem < books.length;
        }

        @Override
        public Book next() {
            return books[currentItem++];
        }
    }
}
