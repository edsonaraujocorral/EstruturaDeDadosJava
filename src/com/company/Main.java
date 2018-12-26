package com.company;

public class Main {
    public static void main(String[] args) {
        /* break := e usado para sair do bloco internamente mais aninhado dos comandos:
            switch, for, while, do-while.
         */
        int j = 0;

        for(int i = 0; i < 10; i++) {
            j += i;
            if(j == 5) {
               break;
            }
        }
       System.out.println("Test");


    }
}
