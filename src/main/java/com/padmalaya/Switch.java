package com.padmalaya;

import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        String name;

        Scanner input = new Scanner(System.in);

        name = input.nextLine();
/* Switch case (Switch, Case, break, Default)*/
        switch (name) {

            case "Meenakshi":
                System.out.println("Hi," +name);
                break;
            case "Sundaram":
                System.out.println("Hi," +name);
                break;

            case "Bhavani":
                System.out.println("Hi," +name);
                break;
            default:
                System.out.println("Your name is not in the list");
        }


    }

}
