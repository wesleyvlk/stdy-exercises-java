package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;

public class NomeVerticalEscada {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();

        for (int i = 0; i <= word.length(); i++) {
            String subString = word.substring(0, i);
            System.out.println(subString);
        }
    }
}
