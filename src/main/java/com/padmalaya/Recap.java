package com.padmalaya;


import java.util.Arrays;
import java.util.Scanner;

public class Recap {

    public static void main (String [] args){

        System.out.println("Welcome to recap session");

        int a = 10;
        System.out.println(a);

        int arr[] = {10,20,30};
        System.out.println(Arrays.toString(arr));

        String fname ="Meenakshi Sundaram";
        System.out.println(fname);
        String revfnam = new StringBuffer(fname).reverse().toString();
        System.out.println(revfnam);


        int num1 = 100;
        int num2 = 250;

        System.out.println(num1+num2);

        String name;

        Scanner input = new Scanner(System.in);

        name = input.nextLine();
        System.out.println(name);




    }

}
