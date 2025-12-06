package com.padmalaya;

import java.util.Scanner;

public class MainEH {

    public static void main(String[] args) {
        System.out.println("I am in Exception Handling session");
try {
    int number ; // If condition is wrong it will switch to catch
    Scanner input = new Scanner(System.in);
    number = input.nextInt();
    System.out.println(number);
}
catch (Exception ex) {
    System.out.println("Only number is accepted");
}
finally {
    System.out.println("Always execute");
}
//throw
        try{
            int num = 12;

            if(num == 10)
                throw new Exception();

        } catch (Exception e) {
            System.out.println("yes");

        }
    }

}
