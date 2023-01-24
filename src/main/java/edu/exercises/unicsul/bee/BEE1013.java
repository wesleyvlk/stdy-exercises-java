package edu.exercises.unicsul.bee;

import java.util.*;

public class BEE1013 {
    public static void main(String[] args) {
        int a, b, c, ab;
        Scanner scan = new Scanner(System.in);
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        scan.close();
        ab = maior(maior(a, b), c);
        System.out.println(ab + " eh o maior");
    }

    private static int maior(int a, int b) {
        return (a + b + Math.abs(a - b)) / 2;
    }
}