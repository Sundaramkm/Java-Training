package com.padmalaya;

class NewClass{

    void useMe(){

        System.out.println("I am Use Me Method");
    }

    int sub(int a, int b){

        return a - b;
    }

}


public class AccessModifier {

    public static void main(String[] args) {

        System.out.println("Hi Welcome to Access Modifiers");

        methodOne();
        System.out.println(methodTwo(21,52));//argument
        System.out.println(methodThree(4.5));

        String name = new String("Meenakshi");
        System.out.println(name);

        NewClass object = new NewClass();
        object.useMe();
        int c = object.sub(20,10);
        System.out.println(c);




    }

    private static void methodOne(){
        int i = 10;
        System.out.println("Method 1");
        System.out.println("Number" +i);

    }

    static int methodTwo(int num1, int num2){//Parameters

        return num1 + num2;


    }

    static double methodThree(double num1){

        return num1 * num1;
    }



}
