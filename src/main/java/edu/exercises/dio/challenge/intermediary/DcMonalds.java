package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;

public class DcMonalds {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String ingredient = scan.next();
        String[] ingredientsList = ingredient.split(";");

        for (int i = 0; i < ingredientsList.length; i++) 
            System.out.println(ingredientsList[i]);
    }
}
