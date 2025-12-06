package com.padmalaya;

 class cons{
     final void display(){
        int i = 100;
        System.out.println("100");
    }

}


class ok extends cons{


}


public class Finalkeyword {

    public static void main(String[] args) {
        System.out.println(" I am in Final keyword");
        final int i = 10;
        ok obj = new ok();
        obj.display();

    }

}
