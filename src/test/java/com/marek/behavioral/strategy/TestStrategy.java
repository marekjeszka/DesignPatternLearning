package com.marek.behavioral.strategy;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestStrategy {

    // good example of strategy pattern is a compare method of Comparator interface

    private void clientCode(Strategy strategy) {
        strategy.solve(); // invoking method (execution of strategy) of a provided implementation
    }

    @Test
    public void testStrategy() {
        final Impl1 impl1 = new Impl1();
        final Impl2 impl2 = new Impl2();
        Strategy[] algorithms = {impl1, impl2};
        for (int i = 0; i < algorithms.length; i++) {
            clientCode(algorithms[i]);
        }
        assertEquals(3, impl1.getState());
        assertEquals(3, impl2.getState());
    }
}
