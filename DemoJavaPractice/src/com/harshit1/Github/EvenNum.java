package com.harshit1.Github;

public class EvenNum {
    public static void main(String[] args) {
        getevennum(9);
    }
    static void getevennum(int num)
    {
        if(num%2==0)
        {
            System.out.println("Is Even Number:"+num);
        }else {
            System.out.println("Not Even");
        }
    }

}
