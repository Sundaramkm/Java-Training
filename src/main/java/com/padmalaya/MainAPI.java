package com.padmalaya;


interface in {// Interface just does'nt need class

    void m1();

    public int m2();
}
interface inn{

}

class in1 implements in, inn{
  public void m1(){

    }

    public int m2(){
      return 0;
    }


}


public class MainAPI {

    public static void main(String[] args) {
        System.out.println(" I am in API session");
        //API we can communicat using this , api, multiple, interface - implements


    }
}
