package edu.exercises.dio.challenge.basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class QtdNumerosPositivos {
    public static void main(String[] args) throws IOException {
        String linha;
        Double n;
        int Pos;

        Pos = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            linha = br.readLine();
            if (linha == null || linha.isEmpty())
                break;
            n = Double.parseDouble(linha);
            if (n > 0)
                Pos++;
        }

        System.out.println("" + Pos + " valores positivos");
    }
}