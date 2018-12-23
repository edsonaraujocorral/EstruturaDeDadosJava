package com.company;

public class Main {
    public static void main(String[] args) {
        //Classes Numericas
        Byte byte01 = new Byte((byte) 32);
        System.out.println("Byte Class = " + byte01.byteValue());

        Short shor01 = new Short((short) 100);
        System.out.println("Short class = " + shor01.shortValue());

        Integer int01 = new Integer(1045);
        System.out.println("Integer Class = " + int01.intValue());

        Long long01 = new Long(10849L);
        System.out.println("Long class = " + long01.longValue());

        Float float01 = new Float(3.994F);
        System.out.println("Float class = " + float01.floatValue());

        Double double01 = new Double(3.123334);
        System.out.println("Double class " + double01.doubleValue());
    }
}
