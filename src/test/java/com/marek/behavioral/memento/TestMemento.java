package com.marek.behavioral.memento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMemento {
    @Test
    public void testMemento() {
        DietInfoCaretaker dietInfoCaretaker = new DietInfoCaretaker();

        DietInfo dietInfo = new DietInfo("Fred", 1, 100);

        dietInfo.setDayNumberAndWeight(2, 99);
        dietInfo.setDayNumberAndWeight(3, 98);
        dietInfoCaretaker.saveState(dietInfo);
        dietInfo.setDayNumberAndWeight(4, 97);
        dietInfoCaretaker.restoreState(dietInfo);

        assertEquals(98, dietInfo.getWeight());
    }
}
