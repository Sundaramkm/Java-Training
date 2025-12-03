package com.padmalaya;

import java.util.Arrays;

public class ReferenceArrayDataTypes {

    public static void main(String[] args){

        /* Creating array to store value */

        //int[] num = new int[]{10,20,20};
        int[] num = new int[5];
        num[0] = 10;
        num[1] = 20;
        num[2] = 30;
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        System.out.println("Values in a Array" +" "+ Arrays.toString(num));

        char[] name = {'K','M','S'};
        int len = name.length;
        System.out.println("Array values in a variable"+" "+ Arrays.toString(name));
        System.out.println("First Value in a array"+" "+name[0]);
        System.out.println("Length of values in array"+" "+ len);

        char[] name1 = name.clone();
        System.out.println(name1);
        System.out.println(Arrays.toString(name1));
    }

}
