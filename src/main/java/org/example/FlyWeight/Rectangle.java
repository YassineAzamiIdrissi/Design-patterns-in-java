package org.example.FlyWeight;

public class Rectangle implements RectangleFlyWeight {

    private int l;
    private int h;

    public Rectangle() {
    }

    public Rectangle(int l, int h) {
        this.l = l;
        this.h = h;
    }

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public void draw(String color) {
        System.out.println("Drawing Rectangle with color: " +
                color + " and dimensions: l : " + l + " h : " + h);
    }
}
