package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cases = scan.nextInt();
        for (int i = 0; i < cases; i++) {
            double a = scan.nextDouble() * 2;
            double b = scan.nextDouble() * 3;
            double c = scan.nextDouble() * 5;
            System.out.printf("%.1f%n", ((a + b + c) / 10));
        }
    }
}