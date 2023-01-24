package edu.exercises.unicsul.bee;

import java.util.Scanner;

public class BEE1043 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        final BEE1043 uri1043 = new BEE1043(scan.nextFloat(), scan.nextFloat(), scan.nextFloat());
        uri1043.triangle();
    }

    private float a, b, c, perimeter, area;
    private boolean triangle;

    public BEE1043(final float a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void triangle() {
        triangle = ((getA() < (getB() + getC())) && (getB() < (getA() + getC())) &&
                (getC() < (getB() + getA())));

        if (triangle)
            perimeter();
        else
            area();

    }

    public float getA() {
        return a;
    }

    public void setA(final float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(final float b) {
        this.b = b;
    }

    public float getC() {
        return c;
    }

    public void setC(final float c) {
        this.c = c;
    }

    final private void perimeter() {
        perimeter = getA() + getB() + getC();
        System.out.println("Perimetro = " + perimeter);
    }

    final private void area() {
        area = ((getA() + getB()) * getC()) / 2;
        System.out.println("Area = " + area);
    }

}
