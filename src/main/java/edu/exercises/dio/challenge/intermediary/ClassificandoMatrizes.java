package edu.exercises.dio.challenge.intermediary;

import java.util.Scanner;

public class ClassificandoMatrizes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i;
        int N = input.nextInt();
        int[] nums = new int[N];
        for (i = 0; i < N; i++) {
            nums[i] = input.nextInt();
        }

        int j = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }

        for (int entry : nums) {
            System.out.println(entry);
        }
    }
}