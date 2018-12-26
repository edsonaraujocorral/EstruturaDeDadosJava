package com.company;

public class Main {
    public static void main(String[] args) {
        /* Existem casos em que o Java ira executar
            uma conversao implicita, de acordo com o tipo da variavel atribuida,
            DESDE QUE NAO HAJA PERDA DE PRECISAO... */

        int iresult, i = 3;
        double dresult, d = 3.2;
        dresult = i / d; // i foi convertido para double.
        //iresult = i / d; //perda de precisao -> isso e um erro de complicacao...

        //Uma situacao em que apenas a conversao implicita e permitida: concatenacao de String..
        //Uma conversao explicita para um String nao e permitida
        //Para executar conversoes para string, deve-se, usar o metodo toString()
        String t = "Value = " + 12;
        System.out.println(t);
        String u = Integer.toString(1);
        System.out.println("Value: " + u);


    }
}
