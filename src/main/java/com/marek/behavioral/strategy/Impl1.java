package com.marek.behavioral.strategy;

public class Impl1 extends TemplateMethod1 {
    public int getState() {
        return state;
    }

    private int state = 1;

    @Override
    protected void stop() {
        System.out.println("stop");
    }

    @Override
    protected boolean isSolution() {
        System.out.print("isSolution-" + (state == 3) + "  ");
        return state == 3;
    }

    @Override
    protected boolean nextTry() {
        System.out.print("nextTry-" + state++ + "  ");
        return true;
    }

    @Override
    protected void start() {
        System.out.print("start   ");
    }
}
