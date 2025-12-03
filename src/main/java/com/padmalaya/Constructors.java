package com.padmalaya;

class car{

    int speed;
    String color;

    car(){
        speed =100;
        color ="White";
    }

    car(int s, String c){

        speed =s;
        color = c;
    }

    void run(){

        System.out.println("Car is Running ");
    }

}

public class Constructors {

    public static void main(String[] args) {

        car audi = new car();
        // class name and constructor name  should be same

        car bmw = new car(200, "Brown");

       // audi.color = "RED";
        audi.speed = 120;
        audi.run();
        System.out.println("Audi:" +audi.color);

        //bmw.color ="BLACK";
       // bmw.speed =150;

        System.out.println("BMW :" + bmw.speed);
        System.out.println("BMW :" + bmw.color);

    }

}
