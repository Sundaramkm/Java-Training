package com.padmalaya;

class s1 {
    void s1m() {
        System.out.println("slm");
    }


    class s2 {
        void s2m() {
            System.out.println("S2m");
        }
    }

}
public class MainInnerClass {

    public static void main(String[] args) {
        System.out.println(" I am in Inner class session");
        s1 o = new s1();
        o.s1m();
        s1.s2 o1 = o.new s2();
        o1.s2m();
    }
}
