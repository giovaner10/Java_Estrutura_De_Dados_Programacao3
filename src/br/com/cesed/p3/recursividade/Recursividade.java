package br.com.cesed.p3.recursividade;

public class Recursividade {

    public static void main(String[] args) {
        // System.out.println(fatorial(5));
/*
        for (int i = 0; i < 20; i++) {
            System.out.println(fibonacci(19));
        }*/

        System.out.println(somatorio(5));
    }

    public static int fatorial(int num) {
        if (num == 0) {
            return 1;
        } else {
            return num * fatorial(num - 1);
        }
    }


    public static int fibonacci(int num) {
        if (num < 2) {
            return 1;
        } else {
            return fibonacci(num - 1) + fibonacci(num - 2);
        }
    }

    public static int somatorio(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num + somatorio(num-1);
        }
    }
}
