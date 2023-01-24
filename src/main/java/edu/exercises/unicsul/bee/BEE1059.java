package edu.exercises.unicsul.bee;

public class BEE1059 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            boolean pairs = i % 2 == 0;
            if (pairs)
                System.out.println(i);
        }
    }
}