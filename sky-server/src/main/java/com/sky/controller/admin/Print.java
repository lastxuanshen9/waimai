package com.sky.controller.admin;

public class Print {
    String space = "     ";
    String star = "*********";
    void print(){
        for(int i = 1; i < 6; i++) {
            System.out.println(space.substring(0,5-i)+star.substring(0,2*i-1)+space.substring(0,i-1));
        }
    }
    public static void main(String[] args){
        Print ppp = new Print();
        ppp.print();
    }
}
