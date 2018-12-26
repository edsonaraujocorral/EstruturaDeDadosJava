package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("Digite um limite para lista: ");
        int limiteLista = s.nextInt();

        int[] lista = new int[limiteLista];

        for(int i = 0; i < lista.length; i++) {
            System.out.print("Digite o " + i + " valor para lista: ");
            int value = s.nextInt();
            lista[i] = value;
        }

        for(int i = 0; i < lista.length; i++) {
            System.out.print(lista[i] + " ");
        }
    }
}
