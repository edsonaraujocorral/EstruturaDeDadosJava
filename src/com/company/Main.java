package com.company;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Entrada e Saida Simples
        //System.out e um instancia da classe java.io.PrintStream
        System.out.print("Java values: ");
        System.out.print(3.1415);
        System.out.print(',');
        System.out.print(15);
        System.out.print(" (double, char, int).");

        //Entrada Simples Usando a classe java.util.Scanner;
        //System.in := E um objeto usado para executar a entrada de dados a partir da janela de console Java.
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your age in years: ");
        double age = s.nextDouble();
        System.out.println("Enter your maximum heart rate: ");
        double rate = s.nextDouble();
        double fb = (rate - age) * 0.65;
        System.out.println("Your target fat burning heart rate is " + fb + ".");
    }
}
