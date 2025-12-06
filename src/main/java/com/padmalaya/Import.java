package com.padmalaya;

import com.padmalaya.New.Dummy;

import java.util.Arrays;

public class Import
{
// We can use the class within the pacakge when its public or protected
    public static void main(String[] args) {
        System.out.println("Package and import");

        Rough obj = new Rough();
        obj.display();
        Dummy obj1 = new Dummy();
        obj1.display1();

    }
}
