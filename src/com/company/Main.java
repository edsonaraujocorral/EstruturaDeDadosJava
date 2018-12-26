package com.company;

public class Main {
    public static void main(String[] args) {
        //Controle de Fluxo
        /* Os valores testados por um comando if devem ser uma
            expressao booleana...
         */
        int x = 10;

        if(x > 10) {
            System.out.println("X e maior a 10");
        } else if(x == 15) {
            System.out.println("X e igual a 15");
        } else {
            System.out.println("X e menor que 10 e nao e igual a 15");
        }

    }
}
