package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;

public class ImoveisDisponiveis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String property = scan.next();
        String[] array = new String[3];

        array = property.split("/");
        
        System.out.printf("Imovel: %s R$%s %s\n", array[0], array[1], array[2]);
    }
}
