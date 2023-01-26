package edu.exercises.dio.challenge.intermediary;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class QuadradosPerfeitos {

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        System.out.println(findMinSquares(n));
    }

    private static int findMinSquares(int n) {
        List<Integer> d = new LinkedList<>();
        d.add(0);

        for (int i = 1; i <= n; i++) {
            int minSquares = Integer.MAX_VALUE;
            for (int j = 1; j * j <= i; j++) {
                int current = d.get(i - j * j) + 1;
                minSquares = Math.min(minSquares, current);
            }
            d.add(minSquares);
        }
        return d.get(n);
    }
}