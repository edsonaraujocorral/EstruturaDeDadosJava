package com.company;

public class Main {
    public static void main(String[] args) {

        /* Em Java, um objeto e criado a partir de uma classe usando o operador new;
            O operador new cria um novo objeto a partir de uma classe espeficiada e retorna
            uma referencia para este objeto;
         */

        //Declara a variavel c como sendo do tipo Counter; isto e, c pode se referir a qualquer objeto Counter;
        Counter c;

        //Declara a variavel d como sendo do tipo Couter; cria um novo objeto Counter e retorna uma referencia;
        Counter d = new Counter(); //O operador = atribui a referencia ao novo objeto para variavel d;

        c = new Counter();

        //Atribui a referencia para o mesmo objeto que c (o objeto que d referenciava nao tem mais nenhuma variavel referenciando-o)
        d = c;



    }
}
