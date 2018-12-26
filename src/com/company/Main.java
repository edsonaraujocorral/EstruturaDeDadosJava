package com.company;

public class Main {
    public static int sum(int[] a) {
        int total = 0;
        for(int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }
    public static void main(String[] args) {
        //Arrays := sao colecoes numeradas de variaveis do mesmo tipo..
        //Cada variavel ou celula em um arranjo tem um indi
        /* Cada variavel ou celula em um array tem um indice,
         */
        int[] lista = {10, 20, 30, 40, 50, 60};
        int total = sum(lista);
        System.out.println("Total: " + total);

    }
}
