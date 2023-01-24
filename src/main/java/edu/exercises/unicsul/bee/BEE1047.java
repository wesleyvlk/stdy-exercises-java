package edu.exercises.unicsul.bee;

import java.util.Scanner;

public class BEE1047 {
    private static Scanner scan;
    private static int startHour, startMin, endHour, endMin, durationHour, durationMin;
    private final static int DAY_IN_HOURS = 24;
    private final static int MINUTES_IN_HOURS = 60;

    public static void main(final String[] args) {
        readStartAndEndTime();
        fixEndTime();
        calculateDuration();
        fixDuration();

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n", durationHour, durationMin);
    }

    private static void readStartAndEndTime() {
        scan = new Scanner(System.in);

        startHour = scan.nextInt();
        startMin = scan.nextInt();
        endHour = scan.nextInt();
        endMin = scan.nextInt();
    }

    private static void fixEndTime() {
        if ((endHour <= startHour) && (endMin <= startMin))
            endHour += DAY_IN_HOURS;
    }

    private static void calculateDuration() {
        durationHour = endHour - startHour;
        durationMin = endMin - startMin;
    }

    private static void fixDuration() {
        if (durationHour < 0)
            durationHour = DAY_IN_HOURS + (endHour - startHour);

        if (durationMin < 0) {
            durationMin = MINUTES_IN_HOURS + (endMin - startMin);
            durationHour -= 1;
        }
    }
}
