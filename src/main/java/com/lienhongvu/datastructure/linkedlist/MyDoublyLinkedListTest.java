package com.lienhongvu.datastructure.linkedlist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by hvlien on 10/23/2018.
 */
public class MyDoublyLinkedListTest {

    @Test
    public void testAdd(){
        MyLinkedList<String> myDoublyLinkedList = new MyDoublyLinkedList<>();
        myDoublyLinkedList.add("1");
        myDoublyLinkedList.add("2");
        myDoublyLinkedList.add("3");

        Assert.assertEquals(3, myDoublyLinkedList.size());
        Assert.assertEquals("1 2 3", myDoublyLinkedList.displayForward());
        Assert.assertEquals("3 2 1", myDoublyLinkedList.displayBackward());
    }

    @Test
    public void testAddFirst(){
        MyLinkedList<String> myList = new MyDoublyLinkedList<>();
        myList.addFirst("1");
        myList.addFirst("2");
        myList.addFirst("3");

        Assert.assertEquals(3, myList.size());
        Assert.assertEquals("3 2 1", myList.displayForward());
        Assert.assertEquals("1 2 3", myList.displayBackward());
    }

    @Test
    public void testAddLast(){
        MyLinkedList<String> myList = new MyDoublyLinkedList<>();
        myList.addLast("1");
        myList.addLast("2");
        myList.addLast("3");

        Assert.assertEquals(3, myList.size());
        Assert.assertEquals("1 2 3", myList.displayForward());
        Assert.assertEquals("3 2 1", myList.displayBackward());
    }

    @Test
    public void testAddAfter(){
        MyLinkedList<String> myList = new MyDoublyLinkedList<>();
        myList.addAfter("1", "2");
        Assert.assertEquals(0, myList.size());
        myList.add("1");
        myList.add("3");
        myList.add("4");
        Assert.assertEquals(3, myList.size());
        Assert.assertEquals("1 3 4", myList.displayForward());
        myList.addAfter("2", "1");
        Assert.assertEquals("1 2 3 4", myList.displayForward());
        myList.addAfter("6", "5");
        Assert.assertEquals("1 2 3 4", myList.displayForward());
    }
}
