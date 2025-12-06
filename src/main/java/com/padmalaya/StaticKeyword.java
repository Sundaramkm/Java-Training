package com.padmalaya;

public class StaticKeyword {

    int rollno;
    int class_;
    static String principal;

    void display(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {

        System.out.println("Static Keyword");

        StaticKeyword Karthik = new StaticKeyword();
        Karthik.rollno = 1234;
        Karthik.class_=10;
        Karthik.principal ="Raju";

        System.out.println(StaticKeyword.principal);


    }

}
