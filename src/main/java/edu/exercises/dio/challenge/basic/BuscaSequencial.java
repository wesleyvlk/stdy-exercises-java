package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int[] elements = { 64, 137, -16, 43, 67, 81, -90, 212, 10, 75 };
        int notFound = -1;

        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == N) {
                notFound = i;
                System.out.printf("Achei %d na posicao %d\n", N, i);
                break;
            }
        }
        if (notFound == -1)
            System.out.printf("Numero %d nao encontrado!\n", N);
    }
}