package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class MesadaDoSobrinho {
    public static void main(final String[] args) {
        final Scanner scan = new Scanner(System.in);
        final int MONTH = scan.nextInt();
        final int ALLOWANCE = 50;

        System.out.println("Voce tera " + String.valueOf(MONTH * ALLOWANCE) + " reais");
    }
}
