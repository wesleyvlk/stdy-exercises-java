package edu.exercises.unicsul.bee;

import java.util.*;

public class BEE1014 {
    public static void main(String[] args) {
        int x;
        float y, kml;
        Scanner scan = new Scanner(System.in);
        x = scan.nextInt();
        y = scan.nextFloat();
        kml = x / y;
        System.out.println(String.format("%.3f km/l", kml));
    }
}
