package com.padmalaya;

import java.util.Scanner;

public class Exercise {

    public static void main(String[] args) {
        System.out.println("Hello \n Meenakshi Sundaram" );

        int a=74;
        int b=36;
        System.out.println(a+b);

        int c=50;
        System.out.println(c/3);

        int d =-5+8*6;
        int e = (55+9)%9;
        int f = 20+ -3*5/8;
        int g = 5+15/3*2-8%3;
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        int fnum = 125;
        int snum = 24;

        System.out.println(fnum+snum);
        System.out.println(fnum-snum);
        System.out.println(fnum*snum);
        System.out.println(fnum/snum);
        System.out.println(fnum%snum);

        int mul;
        Scanner input = new Scanner(System.in);
        mul =input.nextInt();

        for (int i=1; i<10; i++){
            System.out.println(mul +"X" +(i+1) +"=" +(mul*(i+1)));
        }

        System.out.println("   J     a    V      V   a");
        System.out.println("   J    a a    V    v   a a");
        System.out.println("J  J   aaaaa     VV   aaaaaaa ");
        System.out.println(" JJ   a      a   v   a        a");

        System.out.println((25.5*3.5-3.5*3.5)/(40.5-4.5) );



    }
}


