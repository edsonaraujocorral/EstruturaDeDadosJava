package com.company;

public class Main {
    public static void main(String[] args) {
        //A conversao e uma operacao que nos permite alterar o tipo de uma variavel
        // (tipo) exp ; onde o tipo  e o tipo que se deseja que a expressao exp assuma...
        //Quando se converte um double em um int, pode-se perder a precisao, ou seja, o valor double
        //resultante sera arredondo para baixo;;
        double d1 = 3.2;
        double d2 = 3.9999;
        int i1 = (int)d1;
        //System.out.println("d1 = " + i1); //3
        int i2 = (int)d2;
        double d3 = (double)i2;
        //System.out.println("d3 = " + d3); //3.0

        //Alguns operadores binarios, com o de divisao, terao resultados diferentes dependendo
        //dos tipos de variaveis envolvidas, quando usada com inteiros, a divisao nao mantem a parte
        //fracionaria..
        int div1 = 3;
        int div2 = 6;
        double dresult = (double)div1 / (double)div2;
        System.out.println("Divisao com double: " + dresult);
        dresult = div1 / div2; //Java executou uma conversao implicita para atribuir um valor int ao resultado double..

        System.out.println("Divisao com int: " + dresult);

    }
}
