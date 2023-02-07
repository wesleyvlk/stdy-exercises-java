package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Blobs {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int testCases = scan.nextInt();

            IntStream.range(0, testCases)
                    .forEach(i -> {
                        double food = scan.nextDouble();
                        int days = 0;

                        while (food > 1) {
                            food /= 2;
                            days++;
                        }

                        System.out.println(days + " dias");
                    });
        }
        
    }
}
