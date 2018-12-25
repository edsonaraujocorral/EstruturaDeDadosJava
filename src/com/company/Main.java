package com.company;

public class Main {
    public static void main(String[] args) {
        //As expressoes em Java implicam em concatenar literais e variaveis usando operadores...

        //Operador de Atribuicao..
        //O operador padrao de atribuicao em Java e "="
        //O valor da operacao de atribuicao e o valor da expressao que e atribuida..
        int i, j = 25; //Funciona por que o operador "=" e avaliado da direta para a esquerda...

        //Operadores Aritmeticos..
        // % Operador Modulo tambem e conhecido como o operador de "resto", na medida em que fornece
        //o resto de uma divisao inteira.
        //definimos formalmente: n mod m = r => n = mq + r tq q 0 <= r < n
        //E possivel utilizar parenteses em qualquer expressao para alterar a ordem de avaliacao..

        //Operadores de Incremento(++) e Decremento(--);

        /*Se tais operadores sao usados na frente de um nome de variavel, entao 1 e somado ou subtraido a variavel
        e seu valor e empregado na expressao... */

        /* Se for utilizado depois do nome da variavel, entao primeiro o valor e usado, e depois a variavel e incrementada
            ou decremetada de 1;
         */
        int var = 8;
        var++; //Pegar o valor e depois incrementar 1;
        var--; //Pegar o valor e depois decrementar 1;

        ++var; //Primeiro incrementa 1 e depois pegar o valor;
        --var; //Primeiro decrementa 1 e depois pegar o valor;

        //Operadores Logicos := sao usados para comparacoes entre numeros;; O tipo resultante de uma comparacao e booelan..
        //Os operadores == e != tambem podem ser usadas como referencias para objetos...

        //Operadores Booleanos...
        /*  ! negacao
            && e condicional
            || ou condicional
         */

        //Operadores sobre bits para INTEIROS E BOOLEANOS
        /*  ~ := complemento sobre bits
            & := e sobre bits
            | := ou sobre bits
            ^ := ou exclusivo sobre bits
            << := deslocamento de bits para esquerda, preenchendo com zeros;
            >> := deslocamento de bits para direita, preenchendo com bits de sinal;
            >>> := deslocamento de bits para direita, preenchendo com zeros;

         */

        //Operadores Operacionais de Atribuicao
        //variavel op = expressa <=> variavel = variavel op expressao
        int[] a = new int[10];
        int value = 5;
        a[value++] += 2; //a[6] = a[6] + 2;

        //Concatenacao de Strings
        //As strings podem ser compostas usando o operadores de concatenacao (+)
        String rug = "carpet";
        String dog = "spot";
        String mess = rug + dog;
        String answer = mess + "will cost me" + 5 + " hours!";

    }
}
