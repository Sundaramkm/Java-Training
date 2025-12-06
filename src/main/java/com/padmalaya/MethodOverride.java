package com.padmalaya;

class a1 {
    void display()
    {
        System.out.println("a1 CLass");

    }
}
    class b1 extends a1{
    @Override //Annotations used to identify the mismatch also it shoukld follow by method
        void display(){
            System.out.println("b1 CLass");
//Child or sub class had more power has more power this is called method override
        }
    }

public class MethodOverride {
    public static void main(String[] args) {
        System.out.println("Method Overriding");
        b1 obj = new b1();
        obj.display();
    }
}
