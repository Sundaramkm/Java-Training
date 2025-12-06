package com.padmalaya;

class data {
    private int id;
    private String pwd;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}



public class Encapsulation {

    public static void main(String[] args) {
        System.out.println("I am in Encapsulation");
        data obj = new data();

//        obj.setId(1234);
//        obj.getId();

    }

}
