package edu.exercises.unicsul.bee;

import java.util.*;

public class BEE1038 {
    public static void main(String[] args) {
        int x, y;
        double request;
        Scanner scan = new Scanner(System.in);
        double[] product = { 4.000, 4.500, 5.000, 2.000, 1.500 };
        x = scan.nextInt() - 1;
        y = scan.nextInt();
        request = product[x] * y;
        System.out.println("Total: R$ " + request + "0");
    }
}
