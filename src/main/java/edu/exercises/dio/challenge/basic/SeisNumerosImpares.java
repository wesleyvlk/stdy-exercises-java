package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class SeisNumerosImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int cont = 0;
        while (cont < 6) {
            if (x % 2 != 0) {
                System.out.println(x);
                cont++;
            }
            x++;
        }
    }
}