package com.padmalaya;

public class Operators {

    public static void main(String[] args) {
        byte number1 = 10;
        byte number2 = 5;
/* Normal Operations */
        System.out.println("Addition"+ " "+ (number1 + number2));
        System.out.println("Subtraction" +" "+ (number1 - number2));
        System.out.println("Multiplication" +" "+ (number1 * number2));
        System.out.println("Division" +" "+ ((float)number1 / number2));
        System.out.println("Percentage" +" "+ ((float)number1 / number2)*100 +"%");

        /* Conditional Operations Relational Operators*/

        System.out.println("Greater" +" "+ (number1 > number2));
        System.out.println("Smaller" +" "+ (number1 < number2));
        System.out.println("Equal" +" "+ (number1 == number2));
        System.out.println("Not Equal" +" "+ (number1 != number2));

//BODMAS (Bracket,Power, Division, Multiplication, Addition and Subtraction
        int number3 = 5 + 5 - 2 *5 *3 /5 % 6;

        System.out.println(number3);

        //Logical Operators

        int ageOfPerson =20;
        boolean indianCitizen = false;

        System.out.println(ageOfPerson== 18 && indianCitizen == true);
        System.out.println(ageOfPerson== 18 || indianCitizen == true);

        //Terinory operator

                    //Condition            true         false
        String name = ageOfPerson >=18 ? "Eligible" : "Not Eligible";

        System.out.println(name);

        int number4 = 10;
        number4++;
        System.out.println(--number4);


    }


}
