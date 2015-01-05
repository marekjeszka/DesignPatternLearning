package com.marek.structural.adapter;

public class Line implements Shape {
    private LegacyLine adaptee;

    public void setLegacyLine(LegacyLine legacyLine) {
        adaptee = legacyLine;
    }

    @Override
    public void draw(int x1, int y1, int x2, int y2) {
        adaptee.draw(x1, y1, x2, y2);
    }
}
