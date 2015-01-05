package com.marek.behavioral.visitor;

public interface ItemElement {
    public int accept(ShoppingCartVisitor visitor);
}
