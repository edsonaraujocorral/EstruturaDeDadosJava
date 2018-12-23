package com.company;

public class Main {
    public static void main(String[] args) {

        /* variaveis de instancia ou campos; representam os dados associados com os objetos de uma classe.. */

        /* O tipo da variavel pode ser tanto um tipo basico, indicando que a variavel armazena
            valores daquele tipo, ou um nome de classe, indicando que a variavel e uma referencia para um
            objeto desta classe...
         */

        /* O escopo (visibilidade) de uma variavel de instancia pode ser controlado pelo uso dos modificadores de variaveis*/
        //Sintaxe: modificador tipo identificador = valor;

        //Modificadores de escopo de variavel
        //public: qualquer um pode acessar variaveis de instancia publicas;
        //protected: apenas metodos do mesmo pacote ou subclasse podem acessar variaveis de instancia protegidas
        //private: apenas metodos da mesma classe (excluindo metodos de uma subclasse) pode acessar variaveis de instancia privadas
        /* Se nenhum dos modificadores for usado, entao a variavel de instancia e considerada amigavel */

        //Modificadores de uso;
        //static: e usada para declarar variaveis que e associada com a classe, e nao com instancias individuais daquela classe.
        //final: uma variavel de instancia final e um tipo de variavel para o qual se deve atribuir um valor inicial,
        //e para a qual, a partir de entao, nao e possivel atribuir um novo valor;


    }
}
