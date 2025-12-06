package com.padmalaya;

class add{//Super or Parent Class //Grandfather

    add() {

    }

    void run(){
        System.out.println(" I am in Class A");
    }
}

class sub extends add {//Child or Sub Class // Father

    void run2(){
        System.out.println(" I am in Class B");
    }
}

class mul extends sub{//Sub Class of Child // Grand Child // Multilevel is not supported by Java but Multiple supported

}

// is -a, has -a
public class inheritance {

    public static void main(String[] args) {

        System.out.println("Inheritance");
        mul s = new mul();
        s.run();
        s.run2();


    }

}
