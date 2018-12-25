package com.company;

public class Gnome {

    //Variaveis de instancia
    public String name;
    public int age;
    public Gnome gnomeBuddy;
    private boolean magical = false;
    protected double height = 2.6;
    public static final int MAX_HEIGHT = 3;

    //Construtores
    public Gnome(String nm, int ag, Gnome bud, double hgt) {
        this.name = nm;
        this.age = ag;
        this.gnomeBuddy = bud;
        this.height = hgt;
    }
    public Gnome() { //Construtuor default
       this.name = "Rumple";
       this.age = 204;
       this.gnomeBuddy = null;
       this.height = 2.1;
    }

    //Metodos
    public static void makeKing(Gnome h) {
        h.name = "King" + h.getRealName();
        h.magical = true;
    }
    public void makeMeKing() {
        this.name = "King" + getRealName();
        this.magical = true;
    }

    public boolean isMagical() { return this.magical; }
    public void setHeight(int newHeight) { this.height = newHeight; }
    public String getName() { return "I wont tell!!"; }
    public String getRealName() { return this.name; }
    public void renameGnome(String s) { this.name = s; }

}
