package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class EntradaSaidaPulandoNomes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < 10; i++)
            nomes[i] = scan.nextLine();

        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);
    }
}
