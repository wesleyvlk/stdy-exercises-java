package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;

public class ChecagemDePalindromos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = checkPalindrome(scan.next());

        word = (checkPalindrome(word).contains(word)) ? "TRUE" : "FALSE";

        System.out.println(word);
    }

    private static String checkPalindrome(String word) {
        String reversedWord = "";

        for (int i = 0; i < word.length(); i++) {
            reversedWord = word.charAt(i) + reversedWord;
        }

        return reversedWord;
    }
}
