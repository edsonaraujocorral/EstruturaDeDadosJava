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
    //Encontra o menor elemento
    public static int findMinor(int[] a) {
        int j = 0;
        for(int i = 0; i < a.length; i++) {
            if(a[i] < a[j]) {
                j = i;
            }
        }

        return j;
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

        int menor = findMinor(lista);
        System.out.println("O menor elemento: " + lista[menor]);

        //E muito perigoso tentar indexar em um array a um fora do intervalo de [0, a.length - 1]
        //Tal referencia e dita "Fora de Faixa"
        /* Se um indice de um array esta fora de faixa, o ambiente de execucao de Java sinaliza uma condicao
            de erro chamada ArrayIndexOutOfBoundsException
         */
        //Declaracao de Arrays
        int[] primes = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29};

        double[] a = new double[10];

        for(int i = 0; i < a.length; i++) {
            a[i] = 1.0;
        }

        for(int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

    }
}
