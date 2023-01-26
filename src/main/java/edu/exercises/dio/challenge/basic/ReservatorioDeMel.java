package edu.exercises.dio.challenge.basic;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ReservatorioDeMel {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        final double PI = 3.14; 
        final double R = 2;

        while (scan.hasNext()) {
            double V = scan.nextDouble();
            double D = scan.nextDouble();

            double height = V / (PI * (D / R) * (D / R));
            double area = PI * (D / R) * (D / R);

            System.out.println("ALTURA = " + df.format(height));
            System.out.println("AREA = " + df.format(area));
        }
    }
}