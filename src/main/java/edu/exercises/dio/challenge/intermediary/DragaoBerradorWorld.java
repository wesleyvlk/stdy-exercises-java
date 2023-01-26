package edu.exercises.dio.challenge.intermediary;

import java.io.IOException;
import java.util.Scanner;

public class DragaoBerradorWorld {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int N = scan.nextInt();
            int min = scan.nextInt();
            int max = scan.nextInt();
            int cont = 0;

            for (int i = 0; i < N; i++) {
                int A = scan.nextInt();
                if (A >= min && A <= max)
                    cont++;
            }

            System.out.println(cont);
            break;
        }
    }
}
