package edu.exercises.dio.challenge.basic;

import java.util.Scanner;

public class MediasPonderadas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = (scan.nextInt() == 3) ? 3 : 3;
        double[] a = new double[N], b = new double[N], c = new double[N];
        double[] sums = new double[N];
        int[] weight = { 2, 3, 5 };
        int[] totalWeight = new int[N];

        for (int i = 0; i < a.length; i++) {
            a[i] = scan.nextDouble();
            sums[0] += a[i] * weight[i];
            totalWeight[0] += weight[i];
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = scan.nextDouble();
            sums[1] += b[i] * weight[i];
            totalWeight[1] += weight[i];
        }

        for (int i = 0; i < c.length; i++) {
            c[i] = scan.nextDouble();
            sums[2] += c[i] * weight[i];
            totalWeight[2] += weight[i];
        }

        for (int i = 0; i < sums.length; i++) {
            double average = sums[i] / totalWeight[i];
            System.out.printf("%.1f\n", average);
        }
    }
}
