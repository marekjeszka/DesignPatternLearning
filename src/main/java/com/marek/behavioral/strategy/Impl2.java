package com.marek.behavioral.strategy;

public class Impl2 extends TemplateMethod2 {
    private int state = 1;

    @Override
    protected void postProcess() {
        System.out.print("postProcess  ");
    }

    @Override
    protected boolean search() {
        System.out.print("search-" + state++ + "  ");
        return state == 3;
    }

    @Override
    protected void preProcess() {
        System.out.print("preProcess  ");
    }

    public int getState() {
        return state;
    }
}
