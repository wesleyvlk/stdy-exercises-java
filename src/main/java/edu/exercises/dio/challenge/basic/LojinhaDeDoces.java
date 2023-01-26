package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class LojinhaDeDoces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sweets = scan.nextInt();

        System.out.printf("O cliente obteve %d doces\n", (sweets * 2));
    }
}
