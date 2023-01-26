package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;

public class PontosNaCarteira {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int speed = scan.nextInt();
        int fines = scan.nextInt();

        if (speed > 80)
            fines++;
        if (fines >= 3)
            System.out.printf("%d multas. Levou pontos na carteira\n", fines);
        else
            System.out.printf("%d multas. Nao levou pontos na carteira\n", fines);
    }
}
