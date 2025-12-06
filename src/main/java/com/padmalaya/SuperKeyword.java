package com.padmalaya;

class a {//Super

    a() {
        System.out.println("a");
    }

    a(int i) {
        System.out.println("i, a");

    }
}

class b extends a {

    b(){
        System.out.println("b");
    }

    b(int i){
        super(i);
        System.out.println("1 b");
    }

        }

public class SuperKeyword {

    public static void main(String[] args) {

        System.out.println("I am in Super Keyword");
        b obj = new b(10);


    }

}
