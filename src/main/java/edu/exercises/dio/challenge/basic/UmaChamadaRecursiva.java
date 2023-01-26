package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class UmaChamadaRecursiva {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int summation = 0;

        for (int i = N; i >= 0; i--) 
            summation += i;

        System.out.println(summation);
    }
}
