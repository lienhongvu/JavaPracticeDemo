package com.lienhongvu.designpattern.factorypattern.ex2;

import org.xml.sax.helpers.XMLReaderFactory;

import javax.sql.rowset.spi.XmlReader;

/**
 * Created by hvlien on 10/10/2017.
 */
public class Test {

    public static void main(String[] args) {
        FirstFactory firstFactory = new FirstFactory();
        Connection connection = firstFactory.createConnection("Oracle");
        System.out.println(connection.description());
    }
}
