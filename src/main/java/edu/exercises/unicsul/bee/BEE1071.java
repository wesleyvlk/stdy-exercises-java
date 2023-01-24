package edu.exercises.unicsul.bee;

import java.util.Scanner;

public class BEE1071 {
    private static Scanner scan = new Scanner(System.in);

    public static void main(final String[] args) {
        final BEE1071 uri1071 = new BEE1071(scan.nextInt(), scan.nextInt());
        uri1071.sumOddNumber();
    }

    private final Integer x, y;

    public BEE1071(final Integer x, final Integer y) {
        this.x = x;
        this.y = y;
    }

    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }

    private void sumOddNumber() {
        int sumOddNumber = 0;
        if (getX() > getY()) {
            for (int i = getY() + 1; i < getX(); i++) {
                if (i % 2 != 0)
                    sumOddNumber += i;
            }
        } else {
            for (int i = getX() + 1; i < getY(); i++) {
                if (i % 2 != 0)
                    sumOddNumber += i;
            }
        }
        System.out.println(sumOddNumber);
    }
}
