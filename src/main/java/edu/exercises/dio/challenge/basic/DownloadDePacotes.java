package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class DownloadDePacotes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int percentage = scan.nextInt();

        for (int i = 0; i < percentage; i++)
            System.out.print("/");

    }
}
