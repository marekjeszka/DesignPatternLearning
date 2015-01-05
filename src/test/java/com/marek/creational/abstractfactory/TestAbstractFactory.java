package com.marek.creational.abstractfactory;

import org.junit.Test;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import static org.junit.Assert.assertEquals;

public class TestAbstractFactory {
    @Test
    public void testCarFactory() {
        final Car car = CarFactory.buildCar(CarType.LUXURY); // client don't care which factory will be used
        System.out.println(car);
        assertEquals(car.getLocation(), Location.ASIA);
    }

    @Test
    public void testDocumentBuilderFactory() {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            // ....
            // ....
            // ....
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }
    }
}
