package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;

public class SalvandoMusicas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String PcFiles = scan.next();

        if (PcFiles.contains(".mp3"))
            System.out.println("Salvar");
        else
            System.out.println("Deletar");
    }
}