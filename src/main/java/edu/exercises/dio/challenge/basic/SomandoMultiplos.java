package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class SomandoMultiplos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int N = scan.nextInt();
        int sum = 0;

        for (int i = A; i <= N; i += A)
            sum += i;

        System.out.println(sum);
    }
}
