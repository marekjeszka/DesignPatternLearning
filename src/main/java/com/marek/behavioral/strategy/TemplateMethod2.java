package com.marek.behavioral.strategy;

public abstract class TemplateMethod2 implements Strategy {
    @Override
    public void solve() {
        while (true) {
            preProcess();
            if (search()) break;
            postProcess();
        }
    }

    protected abstract void postProcess();

    protected abstract boolean search();

    protected abstract void preProcess();
}
