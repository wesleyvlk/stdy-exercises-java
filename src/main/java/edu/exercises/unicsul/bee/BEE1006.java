package edu.exercises.unicsul.bee;

import java.util.*;

public class BEE1006 {
    public static void main(String[] args) {
        double a, b, c, media;
        Scanner scan = new Scanner(System.in);
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        media = (a / 10 * 2) + (b / 10 * 3) + (c / 10 * 5);
        System.out.println(String.format("MEDIA = %.1f", media));
    }
}
