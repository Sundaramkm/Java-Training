package com.padmalaya;


abstract class bike{

    void run(){

    }

    abstract void running();//Declaration

}

class pulsar extends bike{//cpncrete class

    void running()
    {
        System.out.println("running");
    }

}

public class Abstract {

    public static void main(String[] args) {
        System.out.println(" I am in Abstract");
        bike obj = new pulsar();
        obj.run();
        obj.running();

    }

}
