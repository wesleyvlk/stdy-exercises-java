package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class IndustriaDaMulta {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentSpeed = scan.nextInt();

        if (currentSpeed > 60)
            System.out.println("Foi multado");
        else
            System.out.println("Nao foi multado");
    }
}