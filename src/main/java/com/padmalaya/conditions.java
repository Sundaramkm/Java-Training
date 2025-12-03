package com.padmalaya;

import java.util.Scanner;

public class conditions {

    public static void main(String[] args) {

        /* If conditions */

        int pen = 10;
        int sPen = 20;
        int cost;

        Scanner input = new Scanner(System.in);
        cost = input.nextInt();


        if (cost >= sPen) {

            System.out.println("You can buy the Special pen");
        }

        else if (cost >= pen) {
            System.out.println("You can by the normal pen");
        }
        else {
            System.out.println("you have less money to buy the pen");
        }
    }
}
