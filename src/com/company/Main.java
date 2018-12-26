package com.company;

public class Main {
    //Somatoria de todos os elementos de um Array
    public static int sum(int[] a) {
        int total = 0;
        for(int i = 0; i < a.length; i++) {
            total += a[i];
        }
        return total;
    }

    //Contador do Numero de frequencia de um elemento de um Array
    public static int findCount(int[] a, int k) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] == k) {
                count++;
            }
        }

        return count;
    }


    public static void main(String[] args) {
        //Arrays := sao colecoes numeradas de variaveis do mesmo tipo..
        //Cada variavel ou celula em um arranjo tem um indi
        /* Cada variavel ou celula em um array tem um indice,
         */
        int[] lista = {10, 20, 10, 40, 50, 60};
        int total = sum(lista);
        System.out.println("Total: " + total);

        int frequencia = findCount(lista, 10);
        System.out.println("O Numero de vezes que o numero 10 apareceu na Lista e " + frequencia);

    }
}
