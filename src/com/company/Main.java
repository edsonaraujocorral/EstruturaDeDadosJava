package com.company;

public class Main {
    public static void main(String[] args) {
        /* Pode haver varias referencias para um mesmo objeto */
        Counter counter01 = new Counter();
        Counter counter02 = counter01;

        //Incremntar o contador em 10 vezes
        for(int i = 0; i < 10; i++) {
            counter01.incrementCount();
        }

        //Decrementar o contador em 5 vezes
        for(int i = 0; i < 5; i++) {
            counter02.decrementCount();
        }

        System.out.println("O valor do contador = " + counter01.getCount());

        counter01.decrementCount(3);
        System.out.println("O valor do contador = " + counter01.getCount());
    }
}
