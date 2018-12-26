package com.company;

public class Main {
    /* Se um metodo Java e declarado como tipo de retorno void, entao fluxo de controle
        retorna quando encontra a ultima linha de codigo do metodo ou quando encontra um
        comando return sem argumentos...
     */
    private static void sum(int x, int y) {
        System.out.println("The sum is: " + (x + y));
    }

    /* Entretando, se um metodo e declarado com um tipo de retorno, ele e uma funcao
        e devera terminar retornando o valor da funcao como um argumento de comando return.
     */
    public static boolean checkBDay(int date) {
        if(date == 20) {
            return true;
        }
        return false;
    } //O comando return deve ser o ultimo comando executado em uma funcao...

    public static void main(String[] args) {
        //Expressoes explicitas de controle de fluxo..
        sum(10, 20);
        boolean setData = checkBDay(20);
        if(setData) {
            System.out.println("Data is true");
        } else {
            System.out.println("Data is false");
        }
    }
}
