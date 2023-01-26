package edu.exercises.dio.challenge.intermediary;

import java.io.IOException;
import java.util.Scanner;

public class Idades {
        public static void main(String[] args) throws IOException {
            Scanner scan = new Scanner(System.in);
            int cont = 0;
            int sum = 0;
            int n = scan.nextInt();

            while (n >= 1) {
                if (n >= 0) {
                    sum += n;
                    cont++;
                }
                n = scan.nextInt();
            }
            double average = (double) sum / cont;
            System.out.printf("%.2f\n", average);
        }
}
