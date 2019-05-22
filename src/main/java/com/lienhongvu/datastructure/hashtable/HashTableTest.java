package com.lienhongvu.datastructure.hashtable;

import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;

/**
 * Created by hvlien on 9/26/2018.
 */
public class HashTableTest {

    Hashtable<Word, String> table = new Hashtable<>();

    public static void main(String[] args) {
        HashTableTest hashTableTest = new HashTableTest();

        // Equal hashcode test
        hashTableTest.table.put(new Word(null), "28 years old");
        hashTableTest.table.put(new Word("Cong"), "26 years old");
        hashTableTest.table.put(new Word("Dat"), "24 years old");
        System.out.println(hashTableTest.table.get(new Word("Lien")));

        // Not fail fast test
        Enumeration<Word> enumeration = hashTableTest.table.keys();
        hashTableTest.table.remove(new Word("Lien"));
        while (enumeration.hasMoreElements()) System.out.println(enumeration.nextElement().getName());


        // Fail fast test
        Iterator<Word> iterator = hashTableTest.table.keySet().iterator();
        hashTableTest.table.remove(new Word("Dat"));
        try {
            while (iterator.hasNext()) iterator.next();
        } catch (ConcurrentModificationException ex){
            System.out.println("ConcurrentModificationException");
        }

        // Some newest functions
        hashTableTest.table.getOrDefault(new Word("Lien"), "Not Found");
        hashTableTest.table.putIfAbsent(new Word("Linh"), "haha");

        // Don't allow null key null value
        hashTableTest.table.put(null, null);
    }
}
