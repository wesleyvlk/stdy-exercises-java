package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;

public class Quadrante {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int x = scan.nextInt();
            int y = scan.nextInt();

            while (x != 0 && y != 0) {
                if (x > 0 && y > 0) {
                    System.out.println("primeiro");
                } else if (x < 0 && y > 0) {
                    System.out.println("segundo");
                } else if (x < 0 && y < 0) {
                    System.out.println("terceiro");
                } else {
                    System.out.println("quarto");
                }

                x = scan.nextInt();
                y = scan.nextInt();
            }
        }
        
    }

}
