package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;

public class FatorialDesajeitado {
    public static void main(String[] args) {
        int number = Integer.parseInt(new Scanner(System.in).nextLine());
        int result = 0;
        int temp = number;
        int cycle = 1;

        while (temp >= 3) {
            result = calculateCycle(temp, cycle, result);
            temp -= 4;
            cycle++;
        }

        result += calculateRemainder(temp, cycle);
        System.out.println(result);
    }

    public static int calculateCycle(int temp, int cycle, int result) {
        if (cycle == 1) {
            result += temp * (temp - 1) / (temp - 2);
            result += (temp - 3);
        } else {
            result += (-temp * (temp - 1)) / (temp - 2);
            result += (temp - 3);
        }
        return result;
    }

    public static int calculateRemainder(int temp, int cycle) {
        if (temp == 1) {
            return cycle == 1 ? 1 : -temp;
        } else if (temp == 2) {
            return cycle == 1 ? temp : -temp;
        } else {
            return 0;
        }
    }
}
