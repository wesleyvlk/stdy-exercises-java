package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class LeituraDaGertrudes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pages = scan.nextInt();
        int pagesRead = 3;

        System.out.printf("%d dias\n", (pages / pagesRead));
    }
}
