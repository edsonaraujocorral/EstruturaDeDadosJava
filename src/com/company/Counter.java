package com.company;

public class Counter {
    //Variavel de Instancia;
    protected int count;

    //Construtor default;
    public Counter() {
        count = 0;
    }

    //Metodo de acesso para recuper o valor corrente do contador;
    public int getCount() {
        return count;
    }

    //Metodo modificador para incrementar o contador;
    public void incrementCount() {
        count++;
    }

    //Metodo modificador para decrementar o contador;
    public void decrementCount() {
        count--;
    }
}
