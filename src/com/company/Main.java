package com.company;

public class Main {

    public static void main(String[] args) {
        Counter primeiroContador = new Counter();

        //Incrementar o contador 10 vezes
        for(int i = 0; i < 10; i++) {
            primeiroContador.incrementCount();
        }

        System.out.println("O valor do contador = " + primeiroContador.getCount());

    }
}
