package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class OsNumerosSaoIguais {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();
        int B = scan.nextInt();

        if (A == B)
            System.out.println("Sao iguais!");
        else
            System.out.println("Nao sao iguais!");
    }
}
