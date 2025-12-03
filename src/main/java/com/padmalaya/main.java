package com.padmalaya;

class This {

    int number1;
    This(int number1) {

        this.number1= number1;

    }
}


public class main {

    public static void main(String[] args) {
        System.out.println("This Keyword");

        This object = new This(100);
        System.out.println(object.number1);
    }

}
