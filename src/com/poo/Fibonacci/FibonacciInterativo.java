package com.poo.Fibonacci;

public class FibonacciInterativo {

// Faça um programa que imprime 30 números da Sequência de Fibonacci em Java.
//O matemático Leonardo Pisa, conhecido como Fibonacci, propôs no século XIII,
// a sequência numérica abaixo: (0, 1, 1, 2 , 3, 5, 8, 13, 21, 34, 55, 89, ...)
// Essa sequência tem uma lei de formação simples: cada elemento, a partir do terceiro,
// é obtido somando-se os dois anteriores. Veja: 1+1=2, 2+1=3, 3+2=5 e assim por diante.

    public static void main(String[] args) {
        int atual = 1;
        int proximo=1;
        int qnt_num = 5;
        int anterior = 0;
        for (int i = 0; i < qnt_num; i++) {
            System.out.println(proximo);
            proximo = atual + anterior;
            anterior = atual;
            atual = proximo;
        }
    }
}
