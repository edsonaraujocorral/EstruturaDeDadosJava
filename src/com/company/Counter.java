package com.company;

public class Counter {
    //Variavel de Instancia;
    protected int count;

    //Construtor default;
    /* Um construtor e um tipo especial de metodo que e usado para inicializar objetos quando instanciados */
    public Counter() {
        count = 0;

        //O comando return nao e permitido no corpo de um construtor...
        /* A finalidade deste corpo e ser usado para inicializacao dos dados associados com os objetos da classe
            correspondente, de forma que eles fiquem em um estado inicial estavel quando criados...
         */

        /* Uma classe pode ter varios construtores, mas cada um deve ter uma assinatura diferente... */
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
