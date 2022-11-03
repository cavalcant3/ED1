package com.poo.OrdenacaoAlg.SeletionSort;

import java.util.Scanner;

public class SeletionSort {
    public static void main(String[] args) {

        // SeletionSort seletionSort = new SeletionSort();

        int vetor[] = new int[3];



//        preenchendo dados do meu array
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = 1 + (int) (Math.random() *100);
        }
        System.out.println("Vetor desordenado: ");
        for (int i = 0; i < vetor.length; i++) { //o(n)
            System.out.println(vetor[i]);
        }


//        seletion sort


        int posicaoMenor, aux;
//        percorre o vetor desordenado
        for (int i = 0; i < vetor.length; i++) { //o(n)
            posicaoMenor = i;
//            encontra a menor posição
            for (int j = i + 1; j < vetor.length; j++) { //o(n)
                if (vetor[j] < vetor[posicaoMenor]) {
                    posicaoMenor = j;
                }
            }
//            guardando a posição
            aux = vetor[posicaoMenor];
            vetor[posicaoMenor] = vetor[i];
            vetor[i] = aux;
        }
//        Comlpexidade:
        //O(N) * O(N)
        //O(N²)

//      imprimindo o array
        System.out.println("Vetor ordenado: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.println(vetor[i]);
        }



    }
}
