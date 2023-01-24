package edu.exercises.unicsul.bee;

import java.util.Scanner;

public class BEE1044 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        final BEE1044 uri1044 = new BEE1044(scan.nextInt(), scan.nextInt());
        uri1044.isMultiple();
    }

    private final Integer a, b;
    private Boolean isMultiple;

    public BEE1044(final Integer a, final Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer getA() {
        return a;
    }

    public Integer getB() {
        return b;
    }

    private void isMultiple() {
        isMultiple = ((getA() % getB()) == 0) || ((getB() % getA()) == 0);

        if (isMultiple)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");

    }
}