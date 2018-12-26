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
    }
}
