package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;

public class CamaroteDoBlueColdIceCubes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int queueSize = scan.nextInt();
        int peopleInCabin = (queueSize % 2 != 0) ? queueSize / 2 + 1 : queueSize / 2;

        System.out.printf("%d pessoas no camarote\n", peopleInCabin);
    }
}
