package com.padmalaya;

public class MethodOverloading {

    public static void main(String[] args) {
        System.out.println("Welcome to Method Overloading");
        add(5,5,10);
    }

    static  void add(int num1){
        System.out.println(num1+num1);
    }


    static void add(int num1, int num2) {

        System.out.println(num1 + num2);
    }

    static void add(int num1, int num2, int num3) {

        System.out.println(num1 + num2 + num3);
    }
}
