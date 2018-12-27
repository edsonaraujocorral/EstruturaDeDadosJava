package com.company;

public class ThisTester {
    /*
        A referencia this e util quando se deseja passar o objeto corrente
        como parametro de algum metodo..
     */

    /*
        Outra aplicacao e referenciar um campo do objeto corrente cujo nome
        esta em conflito com o nome de uma variavel definida no bloco corrente...
     */
    private int dog = 2;
    public void clobber() {
        int dog = 5;
        System.out.println("The dog local variable = " + dog);
        System.out.println("The dog field = " + this.dog);
    }


}
