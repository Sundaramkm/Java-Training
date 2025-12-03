package com.padmalaya;

public class loops {

    public static void main(String[] args) {

/*       int i = 5;


        for (i = 0; i <5; i++) {

            System.out.println("Hi Hasanti");

        }
*/
        int a =3;

        while (a>0){
            System.out.println("This is while loop");
            a --;
        }

        int b =4;

        do{
            System.out.println("This is do while loop");
            b --;
        }while (b>0);


        String veg[] = {"Tomato", "Onion", "Brinjal"};

        for (int i=0; i<veg.length; i++){
            System.out.println(veg[i]);
        }

    }
}
