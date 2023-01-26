package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class BobConduite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();

        for (int i = 0; i < T; i++) {
            int R1 = scan.nextInt();
            int R2 = scan.nextInt();
            System.out.println(R1 + R2);
        }
    }
}
