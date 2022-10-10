package com.poo.Fibonacci;

public class FibonacciRecursivo {

    static int fibonacci(int n) {
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    static int fibonacciComTernario(int termo) {
        return (termo == 1 || termo == 2) ? 1 : fibonacciComTernario(termo - 1)
                + fibonacciComTernario(termo - 2);
    }

    public static void main(String[] args) {
        int numero = 30;


        for (int i = 1; i <= numero; i++) {
            System.out.println(fibonacci(i));
        }

    }
}
