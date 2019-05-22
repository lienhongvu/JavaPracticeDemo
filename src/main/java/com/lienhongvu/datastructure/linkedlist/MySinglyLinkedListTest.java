package com.lienhongvu.datastructure.linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by hvlien on 10/3/2018.
 */
public class MySinglyLinkedListTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void test_Add(){
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();
        list.add("Lien");
        Assert.assertEquals(1, list.size());

        list.add("Hong");
        list.add("Vu");
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("Lien", list.getFirst().getItem());
        Assert.assertEquals("Hong", list.getFirst().getNext().getItem());
        Assert.assertEquals("Vu", list.getFirst().getNext().getNext().getItem());
    }

    @Test
    public void test_AddAfter(){
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        // Test addAfter with empty list
        list.addAfter("-", "Lien");
        Assert.assertEquals(0, list.size());

        // Test addAfter with some items in list
        list.add("Lien");
        list.add("Hong");
        list.add("Vu");
        list.addAfter("-", "Lien");
        list.addAfter("-", "Hong");
        list.addAfter("|", "Vu");

        list.addAfter("vvvvv", "Vvvvvvvv");
        Assert.assertEquals(6, list.size());
        Assert.assertEquals("Lien - Hong - Vu |", list.toString());
    }

    @Test
    public void test_DeleteFront(){
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        // Test delete when list doesn't have any item
        list.deleteFront();
        Assert.assertEquals(0, list.size());

        // Test delete when list has some items
        list.add("1");
        list.add("2");
        list.add("3");
        list.deleteFront();
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("2 3", list.toString());
    }

    @Test
    public void test_DeleteOneAfter(){
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        // Test delete when list doesn't have any item
        list.deleteOneAfter("1");
        Assert.assertEquals(0, list.size());

        // Test delete when list has some items
        list.add("1");
        list.add("2");
        list.add("3");
        list.deleteOneAfter("2");
        Assert.assertEquals(2, list.size());
        Assert.assertEquals("1 2", list.toString());

        list.clear();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.deleteOneAfter("2");
        Assert.assertEquals(3, list.size());
        Assert.assertEquals("1 2 4", list.toString());
    }

    @Test
    public void testDeleteAllAfter(){
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        // Test delete when list doesn't have any item
        list.deleteAllAfter("1");
        Assert.assertEquals(0, list.size());

        // Test delete when list has some items
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.deleteAllAfter("1");
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("1", list.toString());
    }

    @Test
    public void test_DeleteValue(){
        MySinglyLinkedList<String> list = new MySinglyLinkedList<>();

        // Test delete when list doesn't have any item
        list.deleteValue("1");
        Assert.assertEquals(0, list.size());

        // Test delete when list has some items
        list.add("1");
        list.add("2");
        list.deleteValue("2");
        Assert.assertEquals(1, list.size());
        Assert.assertEquals("1", list.toString());

        list.clear();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("4");
        list.add("5");
        list.add("4");
        list.deleteValue("4");
        Assert.assertEquals(4, list.size());
        Assert.assertEquals("1 2 3 5", list.toString());
    }

}
