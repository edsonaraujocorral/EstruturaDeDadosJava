package com.company;

public class Main {

    private enum Day {MON, TUE, WED, THU, FRI, SAT, SUN};

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

        Day d = Day.MON;
        switch(d) {
            case MON:
                System.out.println("This is tough...");
                break;
            case TUE:
                System.out.println("This is getting better...");
                break;
            case WED:
                System.out.println("Half way there...");
                break;
            case THU:
                System.out.println("I can see the light...");
                break;
            case FRI:
                System.out.println("Now we ara talking...");
                break;
            default:
                System.out.println("Day off!!");
                break;
        }

        //While := este tipo de laco testa se uma certa condificao e satisfeita e executa o corpo do laco
        //enquanto essa condicao for true...
        boolean condicao = true;
        int i = 0;
        while(condicao) {
            if(i >= 10) {
                condicao = false;
            } else {
                System.out.println("i - " + i);
                i++;
            }
        }
        //for := os lacos for oferecem uma repedicao codificada baseada em um indice inteiro..
        for(int counter = 0; counter < 10; ++counter) {
           //o escopo da variavel counter e limitado apenas ao corpo do laco...
           System.out.println("counter = " + counter);
        }
        //do-while := Enqaunto os primeiros lacos testam a condicao antes de executar a primeira
        //interacao, o laco do-while testa a condicao apos a interacao..
        boolean testa = true;
        int j = 0;
        do {
            System.out.println("Interacao: " + i);
            i++;
            if(i >= 10) {
                testa = false;
            }

        }while(testa);

        /* Regra de Java diz lacos se encerram quando a condicao nao e verdade..
            (ao contrario da construcao repeat-until usada em outras linguagens)
         */
    }
}
