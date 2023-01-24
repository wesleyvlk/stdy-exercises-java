package edu.exercises.unicsul.bee;

import java.util.Scanner;

public class BEE1067 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        final BEE1067 uri1067 = new BEE1067(scan.nextInt());
        uri1067.oddNumber();
    }

    private final Integer x;

    public BEE1067(final Integer x) {
        this.x = x;
    }

    public Integer getX() {
        return x;
    }

    private void oddNumber() {
        for (int i = 1; i <= getX(); i += 2) {
            System.out.println(i);
        }
    }
}
