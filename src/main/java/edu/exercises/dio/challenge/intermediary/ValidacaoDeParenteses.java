package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;

public class ValidacaoDeParenteses {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean chars = validateChars(scan.nextLine());

        System.out.println(chars);
    }

    private static boolean validateChars(String chars) {
        if (chars.contains("()"))
            return true;
        else if (chars.contains("[]"))
            return true;
        else if (chars.contains("{}"))
            return true;
        else
            return false;
    }
}
