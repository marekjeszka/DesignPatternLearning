package com.marek.behavioral.strategy;

public abstract class TemplateMethod1 implements Strategy {
    @Override
    public void solve() {
        start();
        while (nextTry() && !isSolution());
        stop();
    }

    protected abstract void stop();

    protected abstract boolean isSolution();

    protected abstract boolean nextTry();

    protected abstract void start();
}
