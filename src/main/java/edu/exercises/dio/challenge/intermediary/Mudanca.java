package edu.exercises.dio.challenge.intermediary;

import java.io.IOException;
import java.util.Scanner;

public class Mudanca {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        String msg;

        while (scan.hasNext()) {
            int degree = scan.nextInt();
            if (degree == 360 || degree >= 0 && degree < 90)
                msg = "Bom Dia!!";
            else if (degree >= 90 && degree < 180)
                msg = "Boa Tarde!!";
            else if (degree >= 180 && degree < 270)
                msg = "Boa Noite!!";
            else
                msg = "De Madrugada!!";

            System.out.println(msg);
        }
    }
}
