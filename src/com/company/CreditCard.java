package com.company;

public class CreditCard {
    //Variaveis de Instancia
    private String number;
    private String name;
    private String bank;
    private double balance;
    private int limit;

    //Construtor
    public CreditCard(String number, String name, String bank, double balance, int limit) {
        this.number = number;
        this.name = name;
        this.bank = bank;
        this.balance = balance;
        this.limit = limit;
    }

    //Metodos de Acesso
    public String getNumber() { return this.number; }
    public String getName() { return this.name; }
    public String getBank() { return this.bank; }
    public double getBalance() { return this.balance; }
    public int getLimit() { return this.limit; }

    //Metodos de acao
    public boolean chargelt(double price) {
        if(price + this.balance > (double)this.limit) {
            return false; //Na ha dinheiro sufuciente para debitar
        }

        this.balance += price;
        return true;//Debito foi efetuado...
    }
    public void makePayment(double payment) {
        this.balance -= payment;
    }
    public static void printCard(CreditCard card) {
        System.out.println("Number: " + card.getNumber());
        System.out.println("Name: " + card.getName());
        System.out.println("Bank: " + card.getBank());
        System.out.println("Balance: " + card.getBalance());
        System.out.println("Limit: " + card.getLimit());
    }
}
