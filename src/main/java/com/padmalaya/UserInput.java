package com.padmalaya;

import java.util.Scanner;

public class UserInput {


    public static void main(String[] args) {

        String name;
        int age;
        int section;


        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Name :");

        //name = input.next();
        name = input.nextLine();
        age = input.nextInt();
        section = input.nextInt();


        System.out.println("Entered Name is :" +name);
        System.out.println("Entered Name is :" +name +" " +name.toLowerCase() +" " +name.length());
        System.out.println("Entered Age is :" +age);
        System.out.println("Entered Section is :" +section);
    }

}
