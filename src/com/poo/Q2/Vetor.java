package com.poo.Q2;

public class Vetor {

    public int SomarDadosVetor(int[] numerosVetor) {
        int somaTotal=0, i, n = numerosVetor.length;
        for (i = 0; i < n; i++) {

            somaTotal= somaTotal+ numerosVetor[i];
        }
        return somaTotal;
    }
}
