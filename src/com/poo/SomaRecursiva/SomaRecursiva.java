package com.poo.SomaRecursiva;

public class SomaRecursiva {
    public void ApresentarNumeroR(int n){
        if (n==1){
            System.out.println(n);
        } else {
            ApresentarNumeroR(n-1);
            System.out.println(n);
        }
    }
}
