package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MultiplosDeTreze {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int n1 = scan.nextInt();
            int n2 = scan.nextInt();
            int min = Math.min(n1, n2);
            int max = Math.max(n1, n2);

            int sum = IntStream.rangeClosed(min, max)
                    .filter(i -> i % 13 != 0)
                    .sum();

            System.out.println(sum);
        }

    }
}