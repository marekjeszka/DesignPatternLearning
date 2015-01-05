package com.marek.structural.adapter;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

public class TestAdapter {
    @Test
    public void testArraysAsList() {
        String[] strings = new String[]{"aaa", "bbb", "ccc"};
        final List<String> stringList = Arrays.asList(strings);
        assertEquals("ccc", stringList.get(2));
    }

    @Mock private LegacyLine legacyLine;
    @Mock private LegacyRectangle legacyRectangle;

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testAdapterPattern() {
        // in legacy code Line and Rectangle didn't have common interface (objects are incompatible)

        final Line line = new Line();
        line.setLegacyLine(legacyLine);
        final Rectangle rectangle = new Rectangle();
        rectangle.setLegacyRectangle(legacyRectangle);
        Shape[] shapes = {line, rectangle};
        int x1 = 10, y1 = 20;
        int x2 = 30, y2 = 60;
        for (int i = 0; i < shapes.length; i++) {
            shapes[i].draw(x1, y1, x2, y2);
        }

        verify(legacyLine).draw(10,20,30,60);
        verify(legacyRectangle).draw(10,20,20,40);
    }
}
