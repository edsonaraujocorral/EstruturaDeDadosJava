package com.company;

import Code.Test;

import java.io.*;
import java.util.Scanner;
import Code.Test;
/** Comentario para Javadoc **/

//Java permite que definicoes de classes sejam feitas dentro, isto e, aninhadas dentro
//das definicoes de outras classes...
//O uso principal de classes aninhadas e para definir uma classes fortemente conectada com outra...
public class Main {
    public static void main(String[] args) {
        Test testClass = new Test(18);
        System.out.println("Your age is " + testClass.getAge());
        testClass.setAge(20);
        System.out.println("Your new age is " + testClass.getAge());
    }
}
