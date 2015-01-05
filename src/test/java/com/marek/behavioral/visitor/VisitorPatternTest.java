package com.marek.behavioral.visitor;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VisitorPatternTest {
    private static int calculatePrice(ItemElement... items) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int sum = 0;
        for (ItemElement el : items) {
            sum += el.accept(visitor);
        }
        return sum;
    }

    /**
     * In core Java there is TreeVisitor (e.g. SimpleTreeVisitor) that is used to visit object of type Tree.
     */
    @Test
    public void testVisitorPattern() {
        ItemElement[] items = new ItemElement[] {
                new Book(20, "1234"), new Book(100, "5678"), new Fruit(10, 2, "Banana"), new Fruit(5, 5, "Apple")
        };
        int total = calculatePrice(items);
        System.out.println("Total cost: " + total);
        assertEquals(160, total);
    }
}
