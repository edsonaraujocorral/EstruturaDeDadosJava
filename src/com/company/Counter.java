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

    //O nome de um metodo combinado com a quantidade e o tipo de seus parametros chama-se assinatura;
    //Dois metodos com mesma assinatura nao podem retornar valores diferentes...
    public void decrementCount() {
        count--;
    }
    public void decrementCount(int num) {
        this.count -= num;
    }
}
