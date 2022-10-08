package com.poo.Q3;

public class Vetor {

    public void Imprimir(int[] numerosVetor, int n) {
        if (n == 1) {
            System.out.println(numerosVetor[n - 1] + " ");
        } else {
            System.out.println(numerosVetor[n - 1] + " espaço");
            Imprimir(numerosVetor, n - 1);
        }
    }

    public int Somar(int[] numerosVetor, int n) {
        int ResultadoDaSoma = 0;
        if (n == 1) {
            return numerosVetor[n - 1];

        } else {
            return numerosVetor[n - 1] + Somar(numerosVetor, n - 1);
        }
    }
}
